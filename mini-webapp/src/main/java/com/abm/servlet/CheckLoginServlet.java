package com.abm.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abm.dao.UserDao;
import com.abm.entity.User;

/**
 * Servlet implementation class AddEmployeeServlet
 */
public class CheckLoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao dao = new UserDao();
		user = dao.fetchByUserName(username);
		if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			response.sendRedirect("confirmation.jsp");
			LocalDate local=LocalDate.now();
			String l = local.toString();
			dao.updateLocalDate(l);
		}

		else {
			response.sendRedirect("confirmationfailed.jsp");
		}
		

	}

}
