package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class QRCode
 */
@WebServlet("/QRCode")
public class QRCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QRCode() {
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
		out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
		out.println("<script src='/Parking/asset/jquery.min.js'></script>");
		out.println("<script src='/Parking/asset/qrcode.min.js'></script>");
		out.println("<script type='text/javascript' src='/Parking/asset/new.js'></script>");
		
		//CHECK CODE START
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<input id='myinput' placeholder='input id'>");
		out.println("<input id='uname' placeholder='input name'>");
		out.println("<input id='mobile' placeholder='mpbile number'>");
		out.println("<input type='date' id='vehicle' placeholder='vehicle number'>");
		out.println("<button onclick='generateQR()'>Generate</button> ");
		out.println("<div id='qrcode'></div>");
	
		
		
		out.println("</body>");
		out.println("<html>");
	


	//	HttpSession ses=request.getSession();
	//	try{
	//	String nv="<i>User Id:"+ses.getValue("USERID").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("USERNAME").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='/Parking/images/"+ses.getValue("APICTURE")+"' width=30 height=30></i>";
	//	}
	//catch(Exception e)
	//{
	//	response.sendRedirect("UserLogin");
	//}
		
	/*
		out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
	//	out.println("<script src='/Parking/asset/statecity.js'></script>");
		out.println("<script src='/Parking/asset/Velidation.js'></script>");
		out.println("<script src='/Parking/asset/jquery.min.js'></script>");
		out.println("<script src='/Parking/asset/qrcode.min.js'></script>");
		out.println("<form  enctype='multipart/form-data' onsubmit='generateQR()'>");
		out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>UserRegister</i></b></h2>");
	    
	   /* out.println("<tr><td><b><i>Employee Id:</i></b></td>");
	    out.println("<td><input type='text' name='eid'></td></tr>");
	    */

	/*    
	    out.println("<tr><td><b><i>User Id:</i></b></td>");
	    out.println("<td><input type='text' id='vid' class='form-control' name='uid'></td></tr>");
	    
	    out.println("<tr><td><b><i>Name:</i></b></td>");
	    out.println("<td><input type='text' id='vn' class='form-control' name='un' ></td></tr>");
	    
	  
	    out.println("<tr><td><b><i>Vehical Number:</i></b></td>");
	    out.println("<td><input type='number' id='una' class='form-control' name='usal'></td></tr>");
	 
	    
	    out.println("<tr><td><b><i>Mobile:</i></b></td>");
	    out.println("<td><input type='text' id='mn' class='form-control' name='umobile'></td></tr>");

	   out.println("<tr><td><b><i>Date:</i></b></td>");
	   out.println("<td><input type='text' id='mt' class='form-control' name='date'></td></tr>");

	   out.println("<tr><td><b><i>Time:</i></b></td>");
	    out.println("<td><input type='text' id='td' name='time' class='form-control' ></td></tr>");
		
	
	    out.println("</table><br><br>");
	    out.println("<button onclick='generateQR()'>Generate QR</button></form></table></center>"); 
	    out.println("<div id='qrcode'></div>");
	    out.flush();
*/
	}

}
