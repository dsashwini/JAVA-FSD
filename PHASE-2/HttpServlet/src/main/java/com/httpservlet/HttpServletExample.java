package com.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("getpostexample")
public class HttpServletExample extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		out.append("<html><body>");
		out.append("Welcome to GET example!");
		String name = req.getParameter("name");
		out.append("Hello " + name);
		out.append("</body></html>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		out.append("<html><body>");
		out.append("Welcome to POST example!");
		String name = req.getParameter("name");
		out.append("Hello " + name);
		out.append("</body></html>");
	}
}