package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.controller.UserController;
import com.nis.model.User;

/**
 * Servlet implementation class UserEdit
 */
@WebServlet("/UserEdit")
public class UserEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub.
	
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
		out.println("<title></title>");
		out.println("</head>");
		
		out.println("<body>");
		       out.println("<form action='UserEditDeleteDisplayById'  method='post'>");
		       out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>Edit Data</i></b></h2>");
	    
		        out.println("<tr><td><b><i>User Id:</i></b></td>");
		       out.println("<td><input type='text' name='uid'  class='form-control' placeholder='Enter User Id' ></td>");
		        out.println("</table><br><br>");
		         out.println("<tr><td><input type='submit' class='btn btn-success'></td></tr>");
		         out.println("</body>");
		         out.println("</html>");
		         out.flush();	    	

	}
}
