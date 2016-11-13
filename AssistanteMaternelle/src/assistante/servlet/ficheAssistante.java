package assistante.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assistante.bean.assistantebean;
import assistante.metier.assistanteMetier;

public class ficheAssistante extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE = "/WEB-INF/Assistante.jsp";
	private static final String FICHE = "fiche";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		assistanteMetier am = new assistanteMetier () ;
		assistantebean ab = am.assistanteMetierMethode(request);
		request.setAttribute(FICHE, ab);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
