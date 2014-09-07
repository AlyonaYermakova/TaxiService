package com.epam.ae.action;

import javax.servlet.http.HttpServletRequest;

public class ShowPageAction implements Action {
    private ActionResult actionResult;

    public ShowPageAction(String pageName) {
        actionResult = new ActionResult(pageName);
    }

    @Override
    public ActionResult execute(HttpServletRequest request) {
        if (actionResult.getPath().equals("login")) {
            request.setAttribute("home", true);
        }

        return actionResult;
    }
}
