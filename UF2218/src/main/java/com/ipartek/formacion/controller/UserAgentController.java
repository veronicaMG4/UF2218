package com.ipartek.formacion.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserAgentController
 */
@WebServlet("/useragent")
public class UserAgentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
/*String useragent=request.getHeader("useragent");*/
		
	
		
		/*
		request.setAttribute(navegador,"navegador");
		request.setAttribute("movil",false);
		request.getRequestDispatcher("ejemplos/basico2.jsp").forward(request, response);
		*/
		

String userAgent = request.getHeader("user-agent").toLowerCase();
		
		if ( userAgent.contains("mobile") ) {
			request.setAttribute("movil", true );	
		}else {
			request.setAttribute("movil", false );
		}
				
		String navegadorname = "";
		
		
		if ( userAgent.contains("trident") ) {
			navegadorname = "internet explorer";
		}else if (userAgent.contains("opr")) {
			navegadorname = "opera";
		}else if (userAgent.contains("chrome")) {
			navegadorname = "chrome";
		}else if (userAgent.contains("firefox")) {
			navegadorname = "firefox";
		}else {
			navegadorname = "otro";
		}
		
		
		request.setAttribute("navegador", navegadorname);
		
		String nombre="maribel";
		
		request.setAttribute("nombre", nombre);
		
		
		request.getRequestDispatcher("ejemplos/basico2.jsp").forward(request, response);
		
	}
		



}

