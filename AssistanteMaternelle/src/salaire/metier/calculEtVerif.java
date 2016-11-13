package salaire.metier;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import salaire.bean.calculSalairebean;

public class calculEtVerif {
	private static final String SALAIRE_HORAIRE = "salaireHoraire";
	private static final String NBR_HEURE_TRAVAILE = "nbrHeuresTravaillees";
	private static final String SALAIRE_DE_BASE = "salaireDeBase" ;
	private static final String NOM = "nom" ;
	private static final String COMM_SALAIRE_MENSUEL = "csm";
	private static final String PRENOM = "prenom" ;
	private static final String DATE_EMBAUCHE = "dateEmbauche";
	private static final String PERIODE = "periode";
	private static final String NBR_SEM_ACC_PAR_AN = "nbrSemaineAcceuilParAn";
	private Map <String, String> erreur = new HashMap<String, String>() ;
	private Map <String, String> commentaire = new HashMap<String, String>() ;
	
	public calculSalairebean Verif (HttpServletRequest request)
	{
		String salaireHoraire = request.getParameter(SALAIRE_HORAIRE) ;
		String nbrHeureTravaille = request.getParameter(NBR_HEURE_TRAVAILE);
		String salaireDeBase = request.getParameter(SALAIRE_DE_BASE) ;
		String nom = request.getParameter(NOM);
		String prenom = request.getParameter(PRENOM);
		String dateEmbauche = request.getParameter(DATE_EMBAUCHE);
		String periode = request.getParameter(PERIODE);
		String nbrSemAccParAn = request.getParameter(NBR_SEM_ACC_PAR_AN);
		String texte;
		Double    salaireDeBaseINT  ;
		
		int periode_num = Integer.parseInt(periode);
		calculSalairebean csb = new calculSalairebean();
		
		try { validationSaisie (salaireHoraire) ; }
			catch (Exception e) {
				setErreur(SALAIRE_HORAIRE, e.getMessage());
			}
		csb.setSalaireHoraire(salaireHoraire);
		
		try {validationSaisie(nbrHeureTravaille); }
			catch (Exception e) {
				setErreur(NBR_HEURE_TRAVAILE, e.getMessage());
			}
		
		csb.setNbrHeuresTravaillees(nbrHeureTravaille);
		if (erreur.isEmpty())		
		{ 
			if (periode_num == 1)
			{	salaireDeBaseINT = (Double.parseDouble(salaireHoraire) * Integer.parseInt(nbrHeureTravaille) * 52) / 12 ;
				salaireDeBase = String.valueOf(salaireDeBaseINT) ;
				texte = "Le salaire mensuel brut = salaire horaire brut de base x nombre d'heures d'accueil par semaine x 52 semaines / 12 ";
				setCommentaire(COMM_SALAIRE_MENSUEL , texte);
			}
			if (periode_num == 2)
			{
				salaireDeBaseINT =(Double.parseDouble(salaireHoraire) *	Integer.parseInt(nbrHeureTravaille) * Integer.parseInt(nbrSemAccParAn)) / 12 ;
				salaireDeBase = String.valueOf(salaireDeBaseINT) ;
				texte = "Le salaire mensuel brut = salaire horaire brut de base x nombre d'heures d'accueil par semaine x nombre de semaines programmées / 12 ";
				setCommentaire(COMM_SALAIRE_MENSUEL , texte);
			}
		
		}
		else
			salaireDeBaseINT = null;
		
		try {ValidationNomPrenom (nom) ; }
		catch (Exception e) {
			setErreur(NOM, e.getMessage());
		}
		try {ValidationNomPrenom(prenom);}
		catch (Exception e) {
			setErreur(PRENOM, e.getMessage());
		}
		csb.setNom(nom);
		csb.setPrenom(prenom);
		csb.setNbrSemParAn(nbrSemAccParAn);
		csb.setSalaireDeBase(salaireDeBase);
		csb.setPeriode(periode);		
		return csb;
	}
	
	public void validationSaisie (String SalaireHoraire) throws Exception
	{
		if (!numerique(SalaireHoraire)) 
			throw new Exception ("La valeur saisie n'est pas numérique !") ;
	}
	
	public static boolean numerique(String valeur)
	{ return valeur.matches("-?\\d+(\\,\\d+)?");}
		
	public Map<String, String> getCommentaire() { return commentaire; }

	public void setCommentaire(String cle, String valeur) 
		{ commentaire.put(cle, valeur); }

	public void setErreur(String cle, String Valeur)
	{ erreur.put(cle, Valeur); }
	public Map<String, String> getErreur()
	{return erreur; }
	
	public void ValidationNomPrenom (String valeur) throws Exception
	{
		if (numerique(valeur))
			throw new Exception ("Valeur incorrecte!!!") ; 
	}
}
