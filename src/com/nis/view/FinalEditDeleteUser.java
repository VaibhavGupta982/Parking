package com.nis.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.nis.controller.EmployeesController;
import com.nis.controller.UserController;
import com.nis.model.Employees;
import com.nis.model.User;

/**
 * Servlet implementation class FinalEditDeleteUser
 */
@WebServlet("/FinalEditDeleteUser")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class FinalEditDeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String uid=request.getParameter("uid");
	      String btn=request.getParameter("btn");
	      if(btn.equals("Delete"))
	      {
	    	 boolean st=UserController.deleteRecord(Integer.parseInt(uid));
	    	 response.sendRedirect("DisplayAllUser");
	      }
	      else if(btn.equals("Edit"))
	      {
	    	  User U=new User();
	    		U.setUserid(request.getParameter("uid"));
	    		U.setUsername(request.getParameter("un"));
	    		U.setGender(request.getParameter("ug"));
	    		U.setDob(request.getParameter("udob"));
	    		U.setAddress(request.getParameter("uadd"));
	    		
	    		if(request.getParameter("ustate").equals("-Select-") && request.getParameter("ucity").equals("-Select-"))
	    		{U.setState(request.getParameter("stateid"));
	    		U.setCity(request.getParameter("cityid"));}
	    		else
	    		{
	    			U.setState(request.getParameter("ustate"));
	        		U.setCity(request.getParameter("ucity"));	
	    			
	    		}
	    		
	    		U.setDesignation(request.getParameter("udes"));
	    		U.setSalary(Long.parseLong(request.getParameter("usal")));
	    		U.setEmail(request.getParameter("email"));
	    		U.setMobileno(request.getParameter("umobile"));
	    		U.setPassword(request.getParameter("upwd"));
	            boolean st=UserController.editRecord(U);
	            
	            response.sendRedirect("UserEdit");
	    	  
	      }
	      else if(btn.equals("Edit Picture"))
	      {     
	    		Part P=request.getPart("epic");
	    		FileUpload F=new FileUpload(P,"F:/Eclipse Mars/eclipse/Parking/WebContent/images");
	    		boolean st=EmployeesController.editPicture(Integer.parseInt(uid), F.filename);
	    		 response.sendRedirect("DisplayAllUser");
	      }
	}

}
