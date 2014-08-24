package com.epam.ae.servlet;

import com.epam.ae.action.Action;
import com.epam.ae.action.ActionFactory;
import com.epam.ae.action.ActionResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   //     String actionName = req.getMethod() + req.getPathInfo();
        String actionName = req.getParameter("action");
        Action action = ActionFactory.getAction(actionName);
        ActionResult result = action.execute(req, resp);
        System.out.println("ACTIONNAME AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + actionName);

        if (result.getPath().equals(req.getPathInfo().substring(1))){
            req.getRequestDispatcher("/WEB-INF/" + result.getPath() + ".jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/" + result.getPath() + ".jsp");
        }



//        req.getRequestDispatcher("/WEB-INF/" + result + ".jsp").forward(req, resp);


    }
}
