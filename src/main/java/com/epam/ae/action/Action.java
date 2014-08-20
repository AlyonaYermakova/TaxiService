package com.epam.ae.action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
    String execute(HttpServletRequest request);
}
