/*package com.abm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abm.dao.UserDao;
import com.abm.entity.Employee;

*//**
 * Servlet implementation class SearchEmployeeServlet
 *//*
public class SearchEmployeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empno = Integer.parseInt(request.getParameter("empno"));
		
		UserDao dao = new UserDao();
		Employee emp = dao.fetch(empno);
		
		HttpSession session = request.getSession();
		session.setAttribute("empData", emp);
		
		response.sendRedirect("viewEmployee.jsp");
		
	}


}
*/