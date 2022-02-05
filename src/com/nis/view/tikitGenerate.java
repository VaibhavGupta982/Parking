package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.controller.UserController;
import com.nis.model.User;


/**
 * Servlet implementation class tikitGenerate
 */
@WebServlet("/tikitGenerate")
public class tikitGenerate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tikitGenerate() {
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
        out.println("body");
		User U=UserController.displayByID(Integer.parseInt(request.getParameter("uid"))); 		
		if(U!=null)
		{	out.println("<link href='asset/bootstrap.min.css' rel='stylesheet' type='text/css'>");
			out.println("<script src='/Parking/asset/jquery-2.2.1.min.js'></script>");
			out.println("<script src='/Parking/asset/statecity.js'></script>");
			//out.println("<script type='test/javascript' src='/Parking/asset/Velidation.js'></script>");
			out.println("<script src='/Parking/asset/jquery.min.js'></script>");
			out.println("<script src='/Parking/asset/qrcode.min.js'></script>");

			out.println("<script type='text/javascript' src='/Parking/asset/new.js'></script>");
			//CHECK CODE START
			
		 
		    
		   //Check Code End
			
			
            out.println("<table class='table table-bordered' style='width:75%; font-size:12px;' ><tr><td>");
			out.println("<center><table class='table table-bordered' style='width:75%; font-size:12px;' ><h2><b><i>Print Slip</i></b></h2>");

		    
		    out.println("<tr><td><b><i>User Id:</i></b></td>");
		    out.println("<td><input type='text' id='myinput' class='form-control' name='uid' value='"+U.getUserid()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>Name:</i></b></td>");
		    out.println("<td><input type='text' id='uname' class='form-control' name='un' value='"+U.getUsername()+"'></td></tr>");
		    
		  
		    out.println("<tr><td><b><i>Vehical Number:</i></b></td>");
		    out.println("<td><input type='number' id='vehicle' class='form-control' name='usal' value='"+U.getSalary()+"'></td></tr>");
		 
		    
		    out.println("<tr><td><b><i>Mobile:</i></b></td>");
		    out.println("<td><input type='text' id='mobile' class='form-control' name='umobile' value='"+U.getMobileno()+"'></td></tr>");

		    out.println("<tr><td><b><i>Date:</i></b></td>");
		    out.println("<td><input type='date' id='mt' class='form-control'></td></tr>");

		    out.println("<tr><td><b><i>Time:</i></b></td>");
		    out.println("<td><input type='time' id='td' class='form-control' ></td></tr>");
		    
		    out.println("<tr><td><button onclick='generateQR()'>Generate</button> ");
			out.println("<div id='qrcode'></div></td></tr>");
		
		  
		    
		   
		    out.println("</table></td>");
		    out.println("<td valign=top><img class='img-thumbnail' src='/Parking/images/"+U.getPicture()+"' width=300 height=300><br></td></table>");
		 //   out.println("<input type='submit' class='btn btn-success' value='Edit' name='btn'>  <input type='Submit' class='btn btn-danger' value='Delete' name='btn'></form>");
		    out.println("<center><input type='button' class='btn btn-info btn-xs' id='print' value='Print'></center><br>");
            
            out.println("<script>document.querySelector('#print').addEventListener('click',function(){ window.print();});</script>");
            
          
            
	
			
		}
		else
		{
		out.println("Record Not Found....");	
		}
		  out.println("</body></html>");
	//	out.println("</html>");
	
	}

}
