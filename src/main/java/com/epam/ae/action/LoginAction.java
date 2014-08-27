package com.epam.ae.action;

import com.epam.ae.dao.UserDAO;
import com.epam.ae.entity.*;

import javax.servlet.http.HttpServletRequest;

public class LoginAction implements Action {

    private final static String LOGIN = "login";
    private final static String PASSWORD = "password";

    @Override
    public ActionResult execute(HttpServletRequest request) {
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        Client user = UserDAO.findByLoginPassword(login, password);

        if (user != null) {
            request.getSession().setAttribute("user", user);
            return new ActionResult("home", true);
        } else {
            request.setAttribute("error", "Unknown username/password. Please retry.");
            return new ActionResult("login");
        }

    }
}
