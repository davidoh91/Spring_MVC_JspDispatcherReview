package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelectController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SelectController invoked..");

        req.setAttribute("message", "mom's touch burger delivery");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("selectResult.jsp");

        return mv;
    }
}
