package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class VehicleRegister
 */
@WebServlet("/VehicleRegister")
public class VehicleRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
		out.println("<title></title>");
		out.println("</head>");
		
		out.println("<body>");
		
	


	//	HttpSession ses=request.getSession();
	//	try{
	//	String nv="<i>User Id:"+ses.getValue("USERID").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("USERNAME").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='/Parking/images/"+ses.getValue("APICTURE")+"' width=30 height=30></i>";
	//	}
	//catch(Exception e)
	//{
	//	response.sendRedirect("UserLogin");
	//}
		
	
		out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
		out.println("<script src='/Parking/asset/statecity.js'></script>");
		out.println("<script src='/Parking/asset/Velidation.js'></script>");
		out.println("<form action='VehicleSubmit' method='post' enctype='multipart/form-data' onsubmit='return myfun()'>");
		out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>UserRegister</i></b></h2>");
	    
	   /* out.println("<tr><td><b><i>Employee Id:</i></b></td>");
	    out.println("<td><input type='text' name='eid'></td></tr>");
	    */
	    out.println("<tr><td><b><i>Name:</i></b></td>");
	    out.println("<td><input type='text' name='un' class='form-control'></td></tr>");
	    
	  
	    out.println("<tr><td><b><i>Current Date:</i></b></td>");
	    out.println("<td><input type='date' class='form-control' name='udob'></td></tr>");
	   

	    out.println("<tr><td><b><i>Current Time:</i></b></td>");
	    out.println("<td><input type='time' class='form-control' name='time'></td></tr>");
	   
	    out.println("<tr><td><b><i>Vehical Number:</i></b></td>");
	    out.println("<td><input type='text' id='vno' value='' class='form-control' name='usal'>");
	    out.println("<span id='massages' style='color:red;'></span><br><br>");
	    out.println("</td></tr>");  
	   
	    out.println("<tr><td><b><i>Mobile:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='umobile'></td></tr>");
	   
	    
	    out.println("</table><br><br>");
	    out.println("<input type='submit' class='btn btn-success'>  <input type='Reset' class='btn btn-danger'></form></table></center>");
	    
	    out.flush();
	}

}
