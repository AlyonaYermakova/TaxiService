package com.epam.ae.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction implements Action {

    @Override
    public ActionResult execute(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        if (name.equals("a") && pass.equals("123")) {
            return new ActionResult("/index.jsp", true);
        }
        else {return new ActionResult("/login.jsp", true);}
    }
}
