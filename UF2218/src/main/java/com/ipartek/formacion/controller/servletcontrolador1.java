package com.ipartek.formacion.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletcontrolador1
 */
@WebServlet("/controlador1")
public class servletcontrolador1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		//obtener datos del cliente a traves de la request 
		
		//request.getParameterNames();
		
		
		
		//dar una respuesta a traves de la reponse
		
		PrintWriter out=response.getWriter();
		out.print("<h1>Respuesta desde ServletControlador</h1>");
		out.print("<p>UserAgen<b>" + request.getHeader("user-agent") +"</b></p>");
		out.print("<h2>Parametros</h2>");
		out.print("<ul>");//para que te printe en forma de 
		
		
			Enumeration<String> eParamas = request.getParameterNames();
			while ( eParamas.hasMoreElements() ) {				
				String paramName = eParamas.nextElement();
				String paramValue = request.getParameter(paramName);
				out.print("<li>" + paramName + " <b>"+ paramValue +"</b></li>");					
			 }			
		out.print("</ul>");
		//mirar version http y mas cosas
		//todos los datos de la cabecera
		out.print("<h2>cabecera</h2>");
		Enumeration<String> eHeader = request.getHeaderNames();
		while ( eHeader.hasMoreElements() ) {				
			String headerName = eHeader.nextElement();
			String headerValue = request.getParameter(headerName);
			out.print("<li>" + headerName + " <b>"+ headerValue +"</b></li>");					
		 }			
		
		
		/*
		 * REQUESTGETPARAMETER()
		 * ----------------------------------------------
		 * de basico.jsp
		 */
		
		request.getParameter("param1");
		out.print(request.getParameter("param1"));

		request.getParameter("param2");
		out.print(request.getParameter("param2"));
		
		request.getParameter("p3");
		out.print(request.getParameter("p3"));
		
		request.getParameter("nombreparametro");
		out.print(request.getParameter("nombreparametro"));
		//todos los parametros que envie el usuario
		
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
