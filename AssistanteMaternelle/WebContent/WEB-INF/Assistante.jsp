<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
<title>Fiche Assistante Maternelle</title>
</head>
<body>
	<h1 id="titre" class="centrer"> Fiche assistante maternelle</h1>
	<form action="ficheAssistante"  method="post">
		<fieldset>
			<legend> Identification de l'assistante maternelle</legend>
			<label class="saisie"> Nom </label>
			<input type = "text" id="nom" name = "nom" 
				   value='<c:out value="${fiche.nom}"/>' 
			       size="50" maxlength="50" autofocus/>
			<br> <br>
	       <label class="saisie"> Prénom</label>
	       <input type="text" id="prenom" name="prenom"
	       		  value='<c:out value="${fiche.prenom}"/>'
	       		  size="50" maxlength="50" />
	       <br> <br>		  
	       <label class="saisie"> Adresse</label>
	       <input type="text" id="adresse" name="adresse"
	       	 	  value='<c:out value="${fiche.adresse}"/>'
	       	 	  size="70" maxlength="70" />	
	       <br>
	       <label class="saisie"> Ville</label>
	       <input type="text" id="cp" name="cp" 
	       	 	  value='<c:out value="${fiche.cp}"/>'
	       	 	  size="5" maxlength="5" />	
	       <input type="text" id="ville" name="ville" 
	       	 	  value='<c:out value="${fiche.ville}"/>'
	       	 	  size="50" maxlength="50" />	
	       <br> <br>
	       <label class="saisie"> Date de naissance</label>
	       <input type="text" id="dateNaissance" name="dateNaissance" 
	       	 	  value='<c:out value="${fiche.dateNaissance}"/>'
	       	 	  size="10" maxlength="10" />	
	      <br> <br>
	      <input type="submit" value="Valider" class="decaler"> 	 	  
	       
	    </fieldset>
	</form>
</body>
</html>