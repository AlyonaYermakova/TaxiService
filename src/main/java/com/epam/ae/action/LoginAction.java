package com.epam.ae.action;

import javax.servlet.http.HttpServletRequest;

public class LoginAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/index.jsp";
    }
}
