package com.epam.ae.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private final static Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("GET/", new ShowPageAction("index"));
        actions.put("GET/index", new ShowPageAction("index"));

        actions.put("GET/login", new ShowPageAction("login"));
        actions.put("POST/login", new LogInAction());
        actions.put("GET/home", new ShowPageAction("home"));

        actions.put("GET/logout", new LogOutAction());
        actions.put("POST/logout", new ShowPageAction("index"));

    }

    public static Action getAction(String actionName) {
        return actions.get(actionName);
    }
}

