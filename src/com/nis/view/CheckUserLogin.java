package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.controller.AdminController;
import com.nis.controller.UserController;
import com.nis.model.Admin;
import com.nis.model.User;

/**
 * Servlet implementation class CheckUserLogin
 */
@WebServlet("/CheckUserLogin")
public class CheckUserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		
		User U=UserController.checkLogin(id, password);
		if(U!=null)
		{HttpSession ses=request.getSession();
		 ses.putValue("USERID", U.getUserid());
		ses.putValue("USERNAME", U.getUsername());
		ses.putValue("APICTURE", U.getPicture());
		 ses.putValue("LTIME", new Date());
			
			
			
		response.sendRedirect("UserHome");	
		}
		else
		{
		out.println("<b><font color='red'>Invalid UserId/Password</font></b>");	
		}
		
		out.println("</html>");
	
	}

}
