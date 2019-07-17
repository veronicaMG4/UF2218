package com.ipartek.formacion.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetPostController
 */
@WebServlet("/getpost")
public class GetPostController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetPostController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String parametroNombre = request.getParameter("nombre");
		  response.getWriter().append("bienvenido " + parametroNombre);
		

		/*doProcess(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametroNombre = request.getParameter("nombre");
		response.getWriter().append("bienvenido " + parametroNombre);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = "maribel";
		String apellido = "lopez";
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido", apellido);
		request.getRequestDispatcher("ejemplos/basico4.jsp").forward(request, response);

	}
}
