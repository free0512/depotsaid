package assistante.metier;

import javax.servlet.http.HttpServletRequest;

import assistance.bean.assistantebean;

public class assistanteMetier {
	
	private static final String NOM = "nom";
	private static final String PRENOM = "prenom";
	private static final String ADRESSE = "adresse";
	private static final String CP = "cp";
	private static final String VILLE ="ville" ;
	private static final String DATE_NAISSANCE = "dateNaissance" ;
		
	public assistantebean assistanteMetierMethode (HttpServletRequest req) {
		String nom = req.getParameter(NOM);
		String prenom = req.getParameter(PRENOM);
		String adresse = req.getParameter(ADRESSE);
		String cp = req.getParameter(CP);
		String ville = req.getParameter(VILLE);
		String dateNaissance = req.getParameter(DATE_NAISSANCE);
		assistantebean ab = new assistantebean ();
		
		ab.setNom(nom);
		ab.setPrenom(prenom);
		ab.setAdresse(adresse);
		ab.setCp(cp);
		ab.setVille(ville);
		ab.setDateNaissance(dateNaissance);
		return ab ;
	}	
}
