package com.epam.ae.action;

import com.epam.ae.dao.OrderDAO;
import com.epam.ae.dao.TestUserDAO;

import javax.servlet.http.HttpServletRequest;

public class ShowPageAction implements Action {

    private ActionResult actionResult;
    private OrderDAO orderDAO = new OrderDAO();
    private TestUserDAO userDAO = new TestUserDAO();
    public ShowPageAction(String pageName) {
        actionResult = new ActionResult(pageName);
    }

    @Override
    public ActionResult execute(HttpServletRequest request) {
        if (actionResult.getPath().equals("login")) {
            request.setAttribute("home", true);
        }

//        if (actionResult.getPath().equals("successOrder")) {
//            String login = request.getParameter("login");
//            User user = userDAO.findByLogin(login);
//            Order order = orderDAO.findOrder(user);
//            request.getSession().setAttribute("order", order);
//        }

        return actionResult;
    }
}
