package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchVehicleById
 */
@WebServlet("/SearchVehicleById")
public class SearchVehicleById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchVehicleById() {
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
    	out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
    	out.println("<form action='EditDeleteDisplayVehiclesByID'>");
    	out.println("<center><br><br><br><br><table><caption><b>Search Vehicle By Id..</b></caption>");
    	out.println("<tr><td><b><i>Vehicle Id:</i></b></td><td><input class='form-control' type=text name=vid size=30></td><td><input class='btn btn-info' type=submit></td></tr>");
    	
    	out.println("</table><center></form></html>");
    	
    	out.flush();
	}

}
