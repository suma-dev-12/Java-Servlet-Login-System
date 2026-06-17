package LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/Login")
public class Login extends HttpServlet {
    
	LoginDao dao= new LoginDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       
	  String un=req.getParameter("uname");
	  String pswd=req.getParameter("pwd");
	  
	  if(dao.check(un, pswd)) {
		  HttpSession session=req.getSession();
		     session.setAttribute("username",un);
		  req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	  }
	  else {
		  resp.sendRedirect("Login.jsp");
	  }
	  
	}
	
	

}
