package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Admin")
public class adminUser2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();		
		String Admin =request.getParameter("Admin");		
		session.setAttribute("Admin",Admin );
		out.println("<b>- Department 1 : Software engineering </b><br>"
				+"<br>"+ "<b>- Department 2 : Computer Science </b> <br> "
				+"<br>"+"<b>- Department 3 :Cyper Security </b><br>"
				+"<br>"+"<b>- Department 4 : Artificial intelegance </b><br>"
				);
	}

}
