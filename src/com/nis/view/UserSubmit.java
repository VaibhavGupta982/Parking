package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class UserSubmit
 */
@WebServlet("/UserSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class UserSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		User U=new User();
		//E.setEmployeeid(request.getParameter("eid"));
		U.setUsername(request.getParameter("un"));
		U.setGender(request.getParameter("ug"));
		U.setDob(request.getParameter("udob"));
		U.setAddress(request.getParameter("uadd"));
		U.setState(request.getParameter("ustate"));
		U.setCity(request.getParameter("ucity"));
		U.setDesignation(request.getParameter("udes"));
		U.setSalary(Long.parseLong(request.getParameter("usal")));
		U.setEmail(request.getParameter("email"));
		U.setMobileno(request.getParameter("umobile"));
		U.setPassword(request.getParameter("upwd"));
		Part P=request.getPart("upic");
		FileUpload F=new FileUpload(P,"F:/Eclipse Mars/eclipse/Parking/WebContent/images");
		
		U.setPicture(F.filename);
		boolean status=UserController.addNewRecord(U);
		out.println("<html>");
		if(status)
		{
			response.sendRedirect("UserLogin");
		}
		else{
		out.println("Fail to Submit User Record...");	
			
		}
		out.println("</html>");
		out.flush();
	}

}
