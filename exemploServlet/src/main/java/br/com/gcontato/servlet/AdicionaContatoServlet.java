package br.com.gcontato.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdicionaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdicionaContatoServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("tel");
		
		out.println("<h1>Informacoes preenchidas</h1>");
		out.println("<p>Nome: "+nome+"</p>");
		out.println("<p>Endereco: "+endereco+"</p>");
		out.println("<p>Telefone "+telefone+"</p>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}