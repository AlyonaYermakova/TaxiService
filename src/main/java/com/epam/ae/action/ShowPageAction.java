package com.epam.ae.action;

import javax.servlet.http.HttpServletRequest;

public class ShowPageAction implements Action {
    @Override
    public ActionResult execute(HttpServletRequest request) {
        return new ActionResult("home",true);
    }
}
