package com.epam.ae.action;

import com.epam.ae.dao.TestUserDAO;

import javax.servlet.http.HttpServletRequest;

public class RegistrationAction implements Action {

    TestUserDAO userDAO = new TestUserDAO();

    @Override
    public ActionResult execute(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String role = request.getParameter("role");

        userDAO.addUser(login, password, name, surname, role);

        return new ActionResult("successRegister", true);
    }
}
