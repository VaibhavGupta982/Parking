package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.controller.VehiclesController;

/**
 * Servlet implementation class DisplayVehicleByRFID
 */
@WebServlet("/DisplayVehicleByRFID")
public class DisplayVehicleByRFID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayVehicleByRFID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
		out.println("<script src='/Parking/asset/vehicle.js'></script>");
		out.println("<html><center>");
		out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
		 String rfidno=VehiclesController.ReadRFID(); 
		 if(rfidno.length()==12)
		 {
			 out.println("<meta http-equiv=\"refresh\" content=\"-5\">");}
		 else
		 {
			 out.println("<meta http-equiv=\"refresh\" content=\"5\">");
			 
		 }
		 out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>Search Vehicle By RFID</i></b></h2>");
	
		out.println("<tr><td><b><i>RFID Number:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' id='rfid' value="+rfidno+"></td><td><input type='button' class='btn btn-info' id='btn' value='Search'></td></tr>");
	    out.println("</table><br>");
	    out.println("<div id='result'></div>");
	    out.println("</html>");
	    
	    
	    
	}

}
