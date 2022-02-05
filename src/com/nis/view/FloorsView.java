package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FloorsView
 */
@WebServlet("/FloorsView")
public class FloorsView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FloorsView() {
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
	out.println("<form action='FloorsSubmit' method=''>");
	out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>Floors</i></b></h2>");


	out.println("<tr><td><b>Floor no</b></td><td><input type='text' class='form-control' name='floorno'></td></tr>");
	out.println("<tr><td><b>Floor name</b></td><td><input type='text' class='form-control' name='floorname'></td></tr>");
	out.println("<tr><td><b>Total no of space </b></td><td><input type='text' class='form-control' name='space'></td></tr>");
	
	
	out.println("<tr><td><input type='submit' class='btn btn-info' value='submit'></td><td><input type='reset' class='btn btn-danger'></td></tr>");
	out.println("</form>");
	out.println("</table></center>");

	out.println("</html>");
	out.flush();
	}

}
