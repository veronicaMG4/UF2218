package com.ipartek.formacion.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.model.dao.VideoDAO;

/**
 * Servlet implementation class CalculadoraController
 */
@WebServlet("/calcular")
public class CalculadoraController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
		
	public static final String OP_SUMAR = "s";
	public static final String OP_RESTAR = "r";
	public static final String OP_MULTIPLICAR = "m";
	public static final String OP_DIVIDIR = "d";
	
	private static String parametroNumero1;
	private static String parametroNumero2;
	//private static int resultado;
	private static float resultado;
	private static String opcion;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public CalculadoraController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//llegan dos parametros del formulario
		 parametroNumero1 = request.getParameter("num1");
		 parametroNumero2 = request.getParameter("num2");
		
	
		//atributo resultado y op
		
		 opcion = request.getParameter("op");
		
		
		switch (opcion) {
		case OP_SUMAR:
			sumar(request, response);
			break;

		case OP_RESTAR:
			restar(request, response);
			break;
			
		case OP_MULTIPLICAR:
			multiplicar(request, response);
			break;
			
		case OP_DIVIDIR:
			dividir(request, response);
			break;		
		
		default:
			sumar(request, response);
			break;
		}
		
		request.setAttribute("resul", resultado);
		request.setAttribute("opc", opcion);
		request.getRequestDispatcher("ejemplos/calculadora.jsp").forward(request, response);
	}
	
	private void sumar(HttpServletRequest request, HttpServletResponse response) {
		//resultado=Integer.parseInt(parametroNumero1) + Integer.parseInt(parametroNumero2);
		
		resultado= (Float.parseFloat(parametroNumero1) + Float.parseFloat(parametroNumero2));
		
		
		
	}
	
	
	private void multiplicar(HttpServletRequest request, HttpServletResponse response) {
		//resultado=Integer.parseInt(parametroNumero1) * Integer.parseInt(parametroNumero2);
		resultado= (Float.parseFloat(parametroNumero1) * Float.parseFloat(parametroNumero2));
	}
	
	private void dividir(HttpServletRequest request, HttpServletResponse response) {
		//resultado=Integer.parseInt(parametroNumero1) / Integer.parseInt(parametroNumero2);
		resultado= (Float.parseFloat(parametroNumero1) / Float.parseFloat(parametroNumero2));
	}
	
	private void restar(HttpServletRequest request, HttpServletResponse response) {
		//resultado=Integer.parseInt(parametroNumero1) - Integer.parseInt(parametroNumero2);
		resultado= (Float.parseFloat(parametroNumero1) - Float.parseFloat(parametroNumero2));
	}
	
	
	}




