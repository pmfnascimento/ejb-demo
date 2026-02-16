package org.java.servlets;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.java.ejbs.HelloBean;

import java.io.IOException;

@WebServlet({"/InvokerServlet", "/invoke"})
public class InvokeServlet extends HttpServlet {

    private @EJB HelloBean helloBean;

    public InvokeServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = helloBean.sayHello("Pedro");
        resp.getWriter().println("Message : " + message);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
