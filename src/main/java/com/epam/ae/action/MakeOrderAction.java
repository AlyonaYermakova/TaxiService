package com.epam.ae.action;

import com.epam.ae.dao.OrderDAO;
import com.epam.ae.dao.UserDAO;
import com.epam.ae.entity.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MakeOrderAction implements Action {

    @Override
    public ActionResult execute(HttpServletRequest request) {

        String carType = request.getParameter("carType");
        String note = request.getParameter("note");



        HttpSession session = request.getSession();

        Client client = (Client) session.getAttribute("user");



        OrderDAO orderDAO = new OrderDAO();
        orderDAO.addOrder(carType, client, note);
        return new ActionResult("successOrder", true);
    }
}
