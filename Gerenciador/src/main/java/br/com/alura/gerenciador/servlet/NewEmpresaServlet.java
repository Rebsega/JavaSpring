package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewEmpresaServlet
 */
@WebServlet("/newEmpresa")
public class NewEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost, ou doGet, restringe a classe a aceitar somente requisições deste tipo
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nova Empresa cadastrada");
		String param = request.getParameter("nome");
		Empresa emp = new Empresa();
		emp.setNome(param);
		
		
		Banco banco = new Banco();
		banco.adiciona(emp);
		
		//PrintWriter out = response.getWriter();
		//out.println("<html><body>EMPRESA "+param+" CADASTRADA!</body></html>");
		////PARA NÃO TRABALHAR COM HTML E OUT.PRINTLN
		//Chama o JSP (Java Server Page)
		RequestDispatcher rd = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");
		request.setAttribute("empresa", emp.getNome());
		rd.forward(request, response);
		
	}

}
