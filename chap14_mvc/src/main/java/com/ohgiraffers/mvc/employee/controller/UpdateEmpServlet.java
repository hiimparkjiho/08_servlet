package com.ohgiraffers.mvc.employee.controller;

import com.ohgiraffers.mvc.employee.dto.EmpDTO;
import com.ohgiraffers.mvc.employee.service.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/employees/update")
public class UpdateEmpServlet extends HttpServlet {
    private EmpService empService;

    @Override   // init은 리소스를 할당하는 경우 사용한다.
    public void init() throws ServletException {
        empService = new EmpService();
        System.out.println(empService + "현재 상태");
    }

    @Override
    public void destroy() {
        empService = null;
        System.out.println(empService + "현재 상태");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        EmpDTO empDTO = new EmpDTO();
        empDTO.setEmpName(req.getParameter("empName"));
        empDTO.setEmail(req.getParameter("email"));
        empDTO.setPhone(req.getParameter("phone"));
        empDTO.setEmpId(Integer.parseInt(req.getParameter("empId")));

        int result = empService.update(empDTO);

        String path;
        if(result > 0){
            path = "/WEB-INF/views/common/successPage.jsp";
            req.setAttribute("message", "직원 수정 성공");
        }else{
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "직원 수정 실패");
        }
        req.getRequestDispatcher(path).forward(req, resp);
    }
}
