package com.loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123"))
		{
			out.print("Welcome to LoginPage");
			HttpSession session = request.getSession();
			session.setAttribute("username", user);
			response.sendRedirect("Dashboard");
		}
		else
		{
			request.getRequestDispatcher("Login.html").include(request, response);
			out.print("INCORRECT DETAILS");
		}
	}

}
