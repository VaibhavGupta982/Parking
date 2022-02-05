package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.controller.VehiclesController;

/**
 * Servlet implementation class VehicleView
 */
@WebServlet("/VehicleView")
public class VehicleView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	   HttpSession ses=request.getSession();
		try{
			String nv="Employee Id:"+ses.getValue("EMPLOYEEID").toString()+"&nbsp;&nbsp;&nbsp;"+ses.getValue("EMPLOYEENAME").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='/Parking/images/"+ses.getValue("EMPLOYEEPICTURE")+"' width=30 height=30><hr color=red>";
	 
		}
	catch(Exception e)
	{
		response.sendRedirect("EmployeeLogin");
	}
		
		
		out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
		out.println("<script src='/Parking/asset/floor.js'></script>");
		out.println("<html>");
		out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
		 String rfidno=VehiclesController.ReadRFID(); 
		 if(rfidno.length()==12)
		 {
			 out.println("<meta http-equiv=\"refresh\" content=\"-5\">");}
		 else
		 {
			 out.println("<meta http-equiv=\"refresh\" content=\"5\">");
			 
		 }
		out.println("<form action='VehiclesSubmit' method='post'>");
		out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>Vehicle Registration</i></b></h2>");


		
		out.println("<tr><td><b><i>Employee Id:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='eid' value="+ses.getValue("EMPLOYEEID")+"></td></tr>");
	   
	    out.println("<tr><td><b><i>RFID No.:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='vrfid' value="+rfidno+"></td></tr>");
	    
	    out.println("<tr><td><b><i>Registration No.:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='regno'></td></tr>");
	    
	    
	    
	    out.println("<tr><td><b><i>Mobile No.:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='vmob'></td></tr>");
	    Calendar C=Calendar.getInstance();
	    String cd=C.get(Calendar.YEAR)+"/"+(C.get(Calendar.MONTH)+1)+"/"+C.get(Calendar.DATE);
	    String ct=C.get(Calendar.HOUR)+":"+(C.get(Calendar.MINUTE))+":"+C.get(Calendar.SECOND)+" "+C.get(Calendar.AM_PM);
	    out.println("<tr><td><b><i>Current date:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='vcdate' value="+cd+"></td></tr>");
	    
	    out.println("<tr><td><b><i>Current time:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='vctime' value="+ct+"></td></tr>");
	    
	    out.println("<tr><td><b><i>Amount:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='vamt' value='30'></td></tr>");
	    
	    out.println("<tr><td><b><i>Time:</i></b></td>");
	    out.println("<td><select name='vtime' class='form-control'><option value='1'>1</option><option value='2'>2</option><option selected value='3'>3</option><option value='4'>4</option></select></td></tr>");
	    
	    out.println("<tr><td><b><i>Status:</i></b></td>");
	    out.println("<td><select name='vstatus' class='form-control'><option selected value='in'>in</option><option value='out'>out</option></select>");
	    
	    out.println("<tr><td valign='top'><b><i>Floor No:</i></b></td>");
	    out.println("<td><select name='vfno' id='vfno' class='form-control'></select><br><div id='fdiv'></div></td></tr>");
	    
	    out.println("</table><br><br>");
	    out.println("<input type='submit' class='btn btn-info'>  <input type='Reset' class='btn btn-danger'></form></table></center>");
	    
	    
	    
	    out.flush();
	}

}
