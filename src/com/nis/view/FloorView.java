package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FloorView
 */
@WebServlet("/FloorView")
public class FloorView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FloorView() {
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
		out.println("<form action='FloorSubmit' method='post'>");
		out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>Floor Register</i></b></h2>");

	    
	    out.println("<tr><td><b><i>Floor Id:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='fid'></td></tr>");
	    
	    out.println("<tr><td><b><i>Floor Name:</i></b></td>");
	    out.println("<td><input type='text' class='form-control' name='fn'></td></tr>");
	    
	    out.println("<tr><td><b><i>Number of space:</i></b></td>");
	    out.println("<td><input type='number' class='form-control' name='fnos'></td></tr>");
	    
	    out.println("</table><br><br>");
	    out.println("<input type='submit' class='btn btn-success'>  <input type='Reset' class='btn btn-danger'></form></table></center>");
	    
	    out.flush();
	}


}
