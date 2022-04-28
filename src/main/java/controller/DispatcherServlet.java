package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet(name = "DispatcherServlet", value = "/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        System.out.println("key = " + key);

        Controller controller = HandlerMapping.getFactory().getController(key);

        ModelAndView mv = controller.handleRequest(req, resp);
        if(mv.isRedirect()) {
            resp.sendRedirect(mv.getViewName());
        }else {
            req.getRequestDispatcher(mv.getViewName()).forward(req, resp);
        }
    }
}
