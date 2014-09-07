package com.epam.ae.connection;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.epam.ae.util.PropertyManager;

import java.sql.SQLException;

public class DBConnection {
    public static final String H2 = "h2.properties";
    public static final String JDBC_URL = "jdbc_url";
    public static final String USER = "user";
    public static final String MAX_CONNECTIONS = "max_connections";
    private static final Logger log = LoggerFactory.getLogger(DBConnection.class);
    private static final String PASSWORD = "password";
    private static BoneCPConfig config;
    private static BoneCP cp;

    public static BoneCPConfig getConfig(String propertiesFileName) {
        PropertyManager manager = PropertyManager.getManager(propertiesFileName);
        String jdbcUrl = manager.getProperty(JDBC_URL);
        String user = manager.getProperty(USER);
        String password = manager.getProperty(PASSWORD);
        int maxConnections = Integer.parseInt(manager.getProperty(MAX_CONNECTIONS));

        BoneCPConfig config = new BoneCPConfig();
        config.setJdbcUrl(jdbcUrl);
        config.setUsername(user);
        config.setPassword(password);
        config.setMaxConnectionsPerPartition(maxConnections);

        return config;
    }

    public static BoneCP getConnectionPool() {
        if (cp == null) {
            if (config == null) {
                log.error("BoneCPConfig == null");
                throw new IllegalArgumentException("You should configure connection pool");
            }
            try {
                cp = new BoneCP(config);
            } catch (SQLException e) {
                log.error("Exception during BoneCP initialization", e);
                e.printStackTrace();
            }
        }
        return cp;
    }

    public static void setConfig(BoneCPConfig config) {
        if (!DBConnection.config.equals(config))
            DBConnection.config = config;
    }

    public static BoneCP getH2ConnectionPool() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
        }
        if (cp == null) {
            if (config == null) {
                config = getConfig(H2);
            }
            cp = new BoneCP(config);
        }
        return cp;
    }
}
