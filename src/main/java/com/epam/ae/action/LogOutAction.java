package com.epam.ae.action;

import javax.servlet.http.HttpServletRequest;

public class LogOutAction implements Action {
    @Override
    public ActionResult execute(HttpServletRequest request) {
        if (request.getSession() != null) request.getSession().invalidate();
        return new ActionResult("index", true);
    }
}
