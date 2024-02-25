package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/User")
public class adminServlet extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();		
		String User =request.getParameter("User");
		session.setAttribute("User",User );
		out.println("<b>- Name : Bader </b><br>"
				+"<br>"+ "<b>- Birthday : 02/06/2004 </b> <br> "
				+"<br>"+"<b>- Id Number : 2232341 </b><br>"
				+"<br>"+"<b>- Major : Software Engineering </b><br>"
				);}
	
}
