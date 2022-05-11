package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Mapeamento da classe para web
@WebServlet(urlPatterns = "/index")
public class OiMundoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html><body>BOOORA DE JAVA!</body></html>");
		System.out.println("Servlet foi chamado");
	}
}
