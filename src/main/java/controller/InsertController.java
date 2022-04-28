package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsertController implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //등록하기
        System.out.println("InsertController invoked..");

        return new ModelAndView("index.jsp", true); //redirect 방식으로 이동하기
    }
}
