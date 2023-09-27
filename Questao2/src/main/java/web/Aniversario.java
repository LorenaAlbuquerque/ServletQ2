package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Aniversario")
public class Aniversario extends HttpServlet {
	private static final long serialVersionUID = 1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String anoNascimentoString = request.getParameter("anoNascimento");
			String opcaoJaAniversario = request.getParameter("opcaoJaAniversario");

			int anoNascimento = Integer.parseInt(anoNascimentoString);
			Calendar cal = Calendar.getInstance();
			int anoAtual = cal.get(Calendar.YEAR);

			PrintWriter writer = response.getWriter();

			writer.append(" <HTML>  <BODY> ");
			if (opcaoJaAniversario.equals("Sim")) {
				writer.append("Idade: " + (anoAtual - anoNascimento));
			} else {
				writer.append("Idade: " + (anoAtual - anoNascimento - 1));
			}
			writer.append("</BODY>  </HTML>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}