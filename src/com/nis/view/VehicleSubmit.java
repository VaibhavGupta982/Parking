package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.nis.controller.UserController;
import com.nis.controller.VehiclesController;
import com.nis.model.User;
import com.nis.model.Vehicle;

/**
 * Servlet implementation class VehicleSubmit
 */
@WebServlet("/VehicleSubmit")
public class VehicleSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Vehicle t=new Vehicle();
		//E.setEmployeeid(request.getParameter("eid"));
		t.setUsername(request.getParameter("un"));
		//U.setGender(request.getParameter("ug"));
		
		t.setDate(request.getParameter("udob"));
		t.setTime(request.getParameter("time"));
		//U.setAddress(request.getParameter("uadd"));
		//U.setState(request.getParameter("ustate"));
		//U.setCity(request.getParameter("ucity"));
		//U.setDesignation(request.getParameter("udes"));
	///	U.setSalary(Long.parseLong(request.getParameter("usal")));
		///U.setEmail(request.getParameter("email"));
		t.setVehicleno(request.getParameter("vno"));
		t.setMobile(request.getParameter("umobile"));
	//	U.setPassword(request.getParameter("upwd"));
		//Part P=request.getPart("upic");
		//FileUpload F=new FileUpload(P,"F:/Eclipse Mars/eclipse/Parking/WebContent/images");
		
//		U.setPicture(F.filename);
		boolean statu=VehiclesController.newRecord(t);
		out.println("<html>");
		if(statu)
		{
		out.println("Record Submitted...");	
		}
		else{
		out.println("Fail to Submit User Record...");	
			
		}
		out.println("</html>");
		out.flush();
	}

}
