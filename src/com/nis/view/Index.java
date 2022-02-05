package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstPage
 */
@WebServlet("/FirstPage")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		  out.println("<html>");
			out.println("<head>");

			out.println("<link href='asset/jquery-ui.css' rel='stylesheet'>");
			out.println("<link href='asset/jquery-ui.structure.css' rel='stylesheet'>");
			out.println("<link href='asset/jquery-ui.theme.css' rel='stylesheet'>");
			
			
			out.println("        <link rel='stylesheet' href='ui/css/bootstrap.min.css'>");
			out.println("        <link rel='stylesheet' href='ui/css/font-awesome.min.css'>");
			out.println("        <link rel='stylesheet' href='ui/css/style.css'>");
			out.println("        <link rel='stylesheet' href='ui/css/animate.css'>");
			out.println("        <link rel='stylesheet' href='ui/css/magnific-popup.css'>");
			out.println("        <link rel='stylesheet' href='ui/plugins/FlexSlider/jquery.flexslider.css'>");
			out.println("        <link rel='stylesheet' href='ui/plugins/owl-carousel/owl.carousel.css'>");
			out.println("        <link rel='stylesheet' href='ui/plugins/owl-carousel/owl.theme.css'>");
			out.println("        <link rel='stylesheet' type='text/css' href='ui/css/slick.css'>");
			out.println("        <link rel='stylesheet' type='text/css' href='ui/css/slick-theme.css'>");
			out.println("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>");
			out.println("        <link href='http://fonts.googleapis.com/css?family=Raleway:500,800' rel='stylesheet' property='stylesheet' type='text/css' media='all' />");
			out.println("    </head>");
			out.println("<body >");		
			out.println("        <div class='wrapper'>");
			out.println("            <div class='header header-static'>");
			out.println("                <div class='topbar'>");
			out.println("                    <div class='container'>");
		
			out.println("                        </div>");
			out.println("                    </div><!--container-->");
			out.println("                </div>");
			
			out.println("                <div class='navbar navbar-default mega-menu' role='navigation'>");
			out.println("                    <div class='container'>");
			out.println("                        <div class='navbar-header'>");
			out.println("                            <button type='button' class='navbar-toggle' data-toggle='collapse' data-target='.cd-navbar-collapse'>");
			out.println("                                <span class='sr-only'>Toggle navigation</span>");
			out.println("                                <span class='icon-bar'></span>");
			out.println("                                <span class='icon-bar'></span>");
			out.println("                                <span class='icon-bar'></span>");
			out.println("                            </button>");
			out.println("                            <a class='navbar-brand' href='FirstPage'>");
			out.println("                                <img id='logo-header' src='logo.png' alt='Logo'>");
			out.println("                            </a>");
			out.println("                        </div>");
		//	out.println("                        <div class='navbar-header'>");
		//	out.println("                       <form class='navbar-form navbar-right' role='search'>   ");
		//	out.println("          <div class='form-group'>               ");
			//out.println("         <input type='text' class='form-control' placeholder='Search Pay Slip Here'>                 ");
		//	out.println("           </div>             ");
		//	out.println("            <button type='submit' class='btn btn-default'>Submit</button>             ");
		//	out.println("  </form>                      ");
		////	out.println("<div class=cresult id=result></div>");
		//	out.println("                        </div>");
		
		//	out.println("<div class=cresult id=result></div>");
			out.println("<div class='collapse navbar-collapse cd-navbar-collapse'>");
			
			out.println("<ul class='nav navbar-nav' style='float:right;'>");
	
			
			out.println("<li class='dropdown'>");
			out.println("<a href='#' class='dropdown-toggle' data-hover='dropdown' data-toggle='dropdown'><h1style='background-color:powderblue;' ><b>Login Here</b></h1></a>");
			out.println("<ul class='dropdown-menu'>");
			out.println("<li><a href='EmployeeLogin'>Employee</a></li>");
			out.println("<li><a href='AdminLogin'>Admin</a></li>");
			out.println("<li><a href='UserLogin'>User</a></li>");
	     //	out.println("<li><a href='EmployeeLogin'>Employee</a></li>");
		   
			out.println("</ul>");
			out.println("</li>");
			out.println("</ul>");
			out.println("                        </div>");
			out.println("                    </div>");
			out.println("                </div>");
			
			out.println("            </div>");
			
			out.println("            <section class='clearfix'>");
			out.println("                <div  id='mega-slider' style='height:42%;' class='carousel slide' data-ride='carousel'>");
			out.println("                    <ol class='carousel-indicators'>");
			out.println("                        <li data-target='#mega-slider' data-slide-to='0' class='active'></li>");
			out.println("                        <li data-target='#mega-slider' data-slide-to='1'></li>");
			out.println("                        <li data-target='#mega-slider' data-slide-to='2'></li>");
			out.println("                    </ol>");
			out.println("                    <div class='carousel-inner' role='listbox'>");
			out.println("                        <div class='item active beactive'>");
			out.println("                            <img src='ui/img/banner/p3.png' alt='...'>");
			out.println("                            <div class='carousel-caption'>");
			out.println("                                <h2 style='margin-top:-50px;'>Welcome to RFID Based Car Parking System</h2>");
		//	out.println("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>");
			out.println("                            </div>");
			out.println("                        </div>");
			out.println("                        <div class='item'>");
			out.println("                            <img src='ui/img/banner/p1.jpg' alt='...'>");
			out.println("                            <div class='carousel-caption'>");
			out.println("                                <h2 style='margin-top:-50px;'>Welcome to RFID Based Car Parking System</h2>");
			//out.println("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>");
			out.println("                            </div>");
			out.println("                        </div>");
			out.println("                        <div class='item'>");
			out.println("                            <img src='ui/img/banner/p2.png' alt='...'>");
			out.println("                            <div class='carousel-caption'>");
			out.println("                                <h2 style='margin-top:-50px;'>Welcome to RFID Based Car Parking System</h2>");
			out.println("                            </div>");
			out.println("                        </div>");
			out.println("                    </div>");
			out.println("                    <a  class='left carousel-control' href='#mega-slider' role='button' data-slide='prev'>");
			out.println("                    </a>");
			out.println("                    <a  class='right carousel-control' href='#mega-slider' role='button' data-slide='next'>");
			out.println("                    </a>");
			out.println("                </div>");
			out.println("            </section>");
		
			out.println("            <section class='home-main-contant-style2 dip-bg-style dip-style bg-white' >");
			//out.println("                    <h1>WELCOME HAVE A NICE DAY</h1> ");
			out.println("                        <div class='text-right' class='w-100 p-3'> ");
			  out.println("                         <img src='https://media.giphy.com/media/BFczswnHUAi40/giphy.gif' class='img-fluid' alt='WELCOME'> <h1 style='color:#006400;'><b> HAVE A NICE DAY</b></h1>");
				out.println("                        </div>");
		/*	out.println("                <div class='container'>");
			                                   out.println("                    <div class='widget'>");
			out.println("                    <div class='widget'>");
			out.println("                    <br>    <h5 class='text-uppercase bottom-line'>Visitor Identification System</h5>");
			out.println("                    </div>");
			out.println("                    <div class='row'>");
			out.println("                        <div class='new-product slider'>");
*/
			 out.println("<script src='asset/jquery-2.2.1.min.js'></script>");
			 out.println("<script src='asset/events.js'></script>");
	/*			
			 out.println("<center><table class='table table-bordered' style='width:80%; font-size:12px;'>");
			 out.println("<tr><td><input type='text' size='80' class='form-control' placeholder='Search Event Here....' id='event'></td><td><input type='button' class='btn btn-info btn-block' id='btn' value='Search'></td></tr></table><br>");
			 out.println("<div id='result'></div></center>");
			   
			   
			out.println("                            </div>");
			out.println("                        </div>");
			out.println("                    </div>");
			out.println("                </div>");
			*/
	out.println("            </section>");
			out.println("            <div class='news-subscribe'>");
			out.println("                <div class='container'>");
			out.println("<center> <p style='color:#FFFFFF;'>© All Rights Reserved @ RFID Based Car Parking System </p></center>");

			out.println("                </div>");
			out.println("            </div>");
			out.println("        </div>");

			out.println("<script src='asset/jquery-ui.js'></script>");
		//	out.println("        <script type='text/javascript'  src='ui/js/jquery.min.js'></script>");
			out.println("        <script type='text/javascript' src='ui/js/bootstrap.min.js'></script>");
			out.println("        <script type='text/javascript' src='ui/plugins/owl-carousel/owl.carousel.min.js'></script>");
			out.println("        <script type='text/javascript' src='ui/plugins/FlexSlider/jquery.flexslider-min.js'></script>");
			out.println("        <script type='text/javascript' src='ui/js/plugins.min.html'></script>");
			out.println("        <script type='text/javascript' src='ui/js/custom.js'></script>");
			out.println("    </body>");
			out.println("</html>");
		  
		 
		   out.flush(); 
		   
	}

}
