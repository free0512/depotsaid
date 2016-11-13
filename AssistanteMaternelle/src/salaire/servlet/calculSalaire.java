package salaire.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import salaire.bean.calculSalairebean;
import salaire.metier.calculEtVerif;

public class calculSalaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE = "/WEB-INF/calculSalaire.jsp";
	private static final String SALAIRE = "salaire";
	public static final String ERREURS = "erreurs";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		calculEtVerif cev = new calculEtVerif();
		calculSalairebean csb = cev.Verif(request);
		request.setAttribute(SALAIRE, csb);
		request.setAttribute(ERREURS, cev);
	
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
