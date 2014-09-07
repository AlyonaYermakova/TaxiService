package com.epam.ae.action;

import com.epam.ae.dao.TestUserDAO;
import com.epam.ae.entity.*;

import javax.servlet.http.HttpServletRequest;

public class LogInAction implements Action {

    private final static String LOGIN = "login";
    private final static String PASSWORD = "password";
    TestUserDAO userDAO = new TestUserDAO();

    @Override
    public ActionResult execute(HttpServletRequest request) {
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        User user = userDAO.findByLoginPassword(login, password);

        if (user != null) {
            request.getSession().setAttribute("user", user);
            return new ActionResult("home", true);
        } else {
            request.setAttribute("error", "Unknown username/password. Please retry.");
            return new ActionResult("login");
        }

    }
}
