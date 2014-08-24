package com.epam.ae.action;

import com.epam.ae.dao.UserDAO;
import com.epam.ae.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction implements Action {

    @Override
    public ActionResult execute(HttpServletRequest request, HttpServletResponse response) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = UserDAO.findByLoginPassword(login, password);

        return new ActionResult("login", true);

//        if (user!=null){
//            request.getSession().setAttribute("user", user);
//            return new ActionResult("home", true);
//        } else {
//            request.setAttribute("error", "Unknown username/password. Please retry.");
//            return new ActionResult("login");
//        }

    }
}
