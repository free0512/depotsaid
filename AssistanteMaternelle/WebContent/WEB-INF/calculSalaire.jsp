<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
<script src="jquery/jquery.min.js"></script>
<script src="jquery/calculSalaire.js"></script>
<title>Assistante Maternelle</title>
</head>
<body>
	<h1 id="titre" class="centrer">Calcul du salaire mensuel</h1>
	<form action="salaire" method="post">
		<fieldset>
			<legend> L'assistante Maternelle</legend>
			<label class="saisie"> Nom :</label>
			<input type = "text" id="nom" name = "nom" 
				   value='<c:out value="${salaire.nom}"/>' 
			       size="40" maxlength="40" autofocus/>
			<label id="nomErreur" class="rouge"> ${erreurs.erreur['nom']}</label>
			<br>
			<label id="labPrenom" class="saisie"> <c:out value="Prénom :"></c:out> </label>
			<input type="text" id="prenom" name = "prenom"
			       value='<c:out value="${salaire.prenom}"/>'
			       size="40" maxlength="40"/> 
			<label class="rouge"> <c:out value="${erreurs.erreur['prenom']}"/> </label>       
			<br>
			<label class="saisie">Date d'embauche :</label>
			<input type="text" id="dateEmbauche" name="dateEmbauche"
				   size="10" maxlength="10"/>
			<br>	   
			<label class="saisie"> l'accueil s'effectue sur une année </label>
				<input type="radio" name="periode"  value="1" id="radio1"
				   ${(salaire.periode != '2')? 'checked="checked"' : ''}  />
				 complète   
				<input type="radio" name="periode"  value="2" id="radio2"
				${(salaire.periode ==  '2')? 'checked="checked"' : ''}  /> incomplète  
			
		</fieldset>
		<fieldset>
			<legend> Entrer le salaire horaire et le nombre d'heures travaillées par semaine</legend>
			<br>
			<label id="salaireHoraireLabel" class="saisie"> Salaire horaire de base : </label>
			<input type = "text" id="salaireHoraire" 
				   value='<c:out value="${salaire.salaireHoraire }"/>'
			   	name="salaireHoraire" size="20" maxlength="20" autofocus/>
			<label class="rouge">
			 	<c:out value="${erreurs.erreur['salaireHoraire'] }"/>
			</label>
			<br><br>
			<label class="saisie" for="nbrHeuresTravaillees"
				id="nbrHeuresTravailleesLabel"	> Nombre d'heures travaillées par semaine :</label>
			<input type = "text" id="nbrHeuresTravaillees" class="saisieVar" 
				   value='<c:out value="${salaire.nbrHeuresTravaillees }"/>' 
			      	name="nbrHeuresTravaillees" size="5" maxlength="5"/> 
			<label class="rouge">
			   	<c:out value="${erreurs.erreur['nbrHeuresTravaillees'] }"/>
		   	</label> 
		   	
		   	<label class="saisie" for="nbrSemaineAcceuilParAn"
		   	       id="nbrSemaineAcceuilParAnLabel"> Nombre de semaine d'acceuil dans l'anneé :
		    </label>  
		   	<input type="text" id="nbrSemaineAcceuilParAn" class="saisieVar"
		   		   value='<c:out value="${salaire.nbrSemParAn}"/>' 
		   	       name="nbrSemaineAcceuilParAn" size="5" maxlength="5"/>  
		   	<br><br>
		   	
			<label class="saisie"> Salaire de base mensuel :</label>
			<input type="text" id="salaireDeBase" name="salaireDeBase"
				   value='<c:out value="${salaire.salaireDeBase}"/>'
				   size="10" maxlength="10" disabled />
			       
<!-- 			<label class="commentaire"> -->
<%-- 				<c:out value="${erreurs.commentaire['csm'] }"/> --%>
<!-- 			</label>        -->
			<br><br>
			<input type="submit" value= "Calculer" class="decaler"/>
			<input type="reset"  value= "Initialiser" class="decaler"/>
		</fieldset>
	</form>
	<span class="commentaire" id="commentaire">
		<c:out value="${erreurs.commentaire['csm'] }"/>
	</span>
</body>
</html>