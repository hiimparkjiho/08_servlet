package com.ohgiraffers.section02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println("방금 받은 session id: " + session.getId());


        session.setAttribute("age", 20);
        session.setAttribute("gender", "H");

        session.setAttribute("user", new UserDTO("honggildong", 20));
        session.setAttribute("username", "hong"); // 동일한 속성이 있는 경우 replace가 호출 됨

        // 세션 삭제
        session.removeAttribute("gender");

        System.out.println("asdasdfafagrtert");

        // 세션 만료 처리
        session.invalidate();
    }
}
