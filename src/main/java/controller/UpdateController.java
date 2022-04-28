package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateController implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UpdateController invoked..");


        ModelAndView mv = new ModelAndView();
        mv.setViewName("updateResult.jsp");
        return mv;
    }
}
