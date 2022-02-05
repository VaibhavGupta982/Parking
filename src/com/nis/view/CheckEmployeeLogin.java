package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.nis.controller.EmployeesController;
import com.nis.model.Employees;

/**
 * Servlet implementation class CheckEmployeesLogin
 */
@WebServlet("/CheckEmployeesLogin")
public class CheckEmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckEmployeeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		String btn=request.getParameter("Btn");
		if(btn.equals("Log In"))
		{
		out.println("<html>");
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		
		
		Employees E=EmployeesController.checkLogin(id, password);
		if(E!=null)
		{
			HttpSession ses=request.getSession();
			ses.putValue("EMPLOYEEID",E.getEmployeeid());
			ses.putValue("EMPLOYEENAME",E.getEmployeename());
			ses.putValue("EMPLOYEEPICTURE",E.getPicture());
			ses.putValue("LTIME",new Date());
		response.sendRedirect("EmployeeHome");	
		}
		else
		{
		out.println("<b><font color='red'>Invalid EmployeeId/Password</font></b>");	
		}
		
		out.println("</html>");
		}
		else if(btn.equals("Login With Otp"))
	 	{
		  Employees E=EmployeesController.displayByID(Integer.parseInt(request.getParameter("id")));	
		 if(E==null)
		 {}
		 else
		 { String name=E.getEmployeename();
		   String mob=E.getMobileno();
		   out.println("<html>");
		   out.println("<form action='CheckOtp' method=post>");
		   
		   int otp=(int)((Math.random()*8999)+1000);
		   out.println("<input type='hidden' name='otp' value='"+otp+"'>");
		   out.println("<input type='hidden' name='id' value='"+request.getParameter("id")+"'>");
		   out.println("<center><table>");
		   out.println("<tr><td><b><i>Name:</i><b></td><td>"+name+"</td></tr>");
		   String em="xxxxxxxx"+mob.substring(8);
		   out.println("<tr><td><b><i>Mobile:</i><b></td><td>"+em+"</td></tr>");
		   out.println("<tr><td><b><i>Otp:</i><b></td><td><input type=password name='uotp'></td></tr>");
		   out.println("</table>");
		   out.println("<input type='submit'></center>");
		   		   
		   SmsServlet S=new SmsServlet();
		   S.SendSms("COM5", mob,otp+"");
			 
		 }
			
			
			
	 	}
		
	}

}
