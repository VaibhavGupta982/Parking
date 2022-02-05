package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.controller.EmployeesController;
import com.nis.controller.UserController;
import com.nis.model.Employees;
import com.nis.model.User;

/**
 * Servlet implementation class UserEditDeleteDisplayById
 */
@WebServlet("/UserEditDeleteDisplayById")
public class UserEditDeleteDisplayById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEditDeleteDisplayById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
        out.println("<html>");
		User U=UserController.displayByID(Integer.parseInt(request.getParameter("uid"))); 		
		if(U!=null)
		{	out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
			out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
			out.println("<script src='/Parking/asset/statecity.js'></script>");
			
			//CHECK CODE START
			
		 
		    
		   //Check Code End
			
			out.println("<form action='FinalEditDeleteUser' method='post' enctype='multipart/form-data'>");
			
            out.println("<table class='table table-bordered' style='width:75%; font-size:12px;' ><tr><td>");
			out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>User Register [Edit/Delete]</i></b></h2>");

		    
		    out.println("<tr><td><b><i>User Id:</i></b></td>");
		    out.println("<td><input type='text' class='form-control' name='uid' value='"+U.getUserid()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>Name:</i></b></td>");
		    out.println("<td><input type='text' class='form-control' name='un' value='"+U.getUsername()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>Gender:</i></b></td>");
		    if(U.getGender().equals("Male"))
		    out.println("<td><input type='radio' name='ug' value='Male' checked>Male<input type='radio' name='ug' value='Female'>Female</td></tr>");
		    else
		    	out.println("<td><input type='radio' name='ug' value='Male' >Male<input type='radio' name='ug' value='Female' checked>Female</td></tr>");	
		    
		    out.println("<tr><td><b><i>Birth Date:</i></b></td>");
		    out.println("<td><input type='date' class='form-control' name='udob' value='"+U.getDob()+"'></td></tr>");
		   
		    out.println("<tr><td><b><i>Address:</i></b></td>");
		    out.println("<td><textarea rows='3' class='form-control' cols='30' name='uadd'>"+U.getAddress()+"</textarea></td></tr>");
		     String St[]=U.getState().split(",");
		    out.println("<input type='hidden' class='form-control' name='stateid' value='"+St[0]+"'>");
		    
		     out.println("<tr><td><b><i>State:</i></b></td>");
		    out.println("<td><select name='ustate' class='form-control' id='estate'></select> "+St[1]+"</td></tr>");
		    String Ct[]=U.getCity().split(",");
		    out.println("<input type='hidden' class='form-control' name='cityid' value='"+Ct[0]+"'>");
		    out.println("<tr><td><b><i>City:</i></b></td>");
		    out.println("<td><select id='ecity' class='form-control' name='ucity'><option>-Select-</option></select> "+Ct[1]+"</td></tr>");
		   
		   
		    out.println("<tr><td><b><i>Designation:</i></b></td>");
		    out.println("<td><input type='text' class='form-control' name='udes' value='"+U.getDesignation()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>Salary:</i></b></td>");
		    out.println("<td><input type='number' class='form-control' name='usal' value='"+U.getSalary()+"'></td></tr>");
		   
		    out.println("<tr><td><b><i>Email:</i></b></td>");
		    out.println("<td><input type='email' class='form-control' name='email' value='"+U.getEmail()+"'></td></tr>");
		   
		    out.println("<tr><td><b><i>Mobile:</i></b></td>");
		    out.println("<td><input type='text' class='form-control' name='umobile' value='"+U.getMobileno()+"'></td></tr>");
		   
		    
		    out.println("<tr><td><b><i>Password:</i></b></td>");
		    out.println("<td><input type='password' class='form-control' name='upwd' value='"+U.getPassword()+"'></td></tr>");
		   
		    out.println("</table></td>");
		    out.println("<td valign=top><img class='img-thumbnail' src='/Parking/images/"+U.getPicture()+"' width=300 height=300><br><br>Update Picture:<br><input type=file name=epic class='form-control'> &nbsp;&nbsp;&nbsp;<input type=submit class='btn btn-info' name='btn' value='Edit Picture'></td></table>");
		    out.println("<input type='submit' class='btn btn-success' value='Edit' name='btn'>  <input type='Submit' class='btn btn-danger' value='Delete' name='btn'></form>");
		    
	
			
		}
		else
		{
		out.println("Record Not Found....");	
		}
		
		out.println("</html>");
		 
	}

}
