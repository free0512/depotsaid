package salaire.bean;

public class calculSalairebean {
	private String salaireHoraire , nbrHeuresTravaillees, salaireDeBase , nbrSemParAn;
	private String nom, prenom, dateEmbauche, periode ;
	
	public String getNbrSemParAn() {
		return nbrSemParAn;
	}

	public void setNbrSemParAn(String nbrSemParAn) {
		this.nbrSemParAn = nbrSemParAn;
	}
	
	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getSalaireHoraire() {
		return salaireHoraire;
	}
	
	public void setSalaireHoraire(String salaireHoraire) {
		this.salaireHoraire = salaireHoraire;
	}

	public String getNbrHeuresTravaillees() {
		return nbrHeuresTravaillees;
	}

	public void setNbrHeuresTravaillees(String nbrHeuresTravaillees) {
		this.nbrHeuresTravaillees = nbrHeuresTravaillees;
	}

	public String getSalaireDeBase() {
		return salaireDeBase;
	}

	public void setSalaireDeBase(String salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
 
	

}
