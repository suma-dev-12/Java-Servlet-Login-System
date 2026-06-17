package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String username=req.getParameter("uname");
		String password=req.getParameter("pwd");
		HttpSession session=req.getSession();
		session.setAttribute("username", username);
		if(username.equals("Suma") && password.equals("sum1621")) {
			req.getRequestDispatcher("welcome.jsp").forward(req, resp);;
		}
		else {
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		}
	}
	
	

}
