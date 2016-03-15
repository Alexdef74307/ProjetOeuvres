<%@include file="include/header.jsp" %>

<form  name='identification' method="post" action="Controleur?action=insererProprietaire" onsubmit="return teste()">

	<h2>Ajouter un proprietaire</h2>

    <div class="form-group">   
		<label for="InputLastName">Nom du proprietaire :</label>
	    <input type="text" required class="form-control" name="txtnom" value=""  id ="nom">
    </div>
    
	<div class="form-group">
		<label for="InputFirstName">Prénom du proprietaire :</label>
        <input type="text" required class="form-control" name="txtprenom"  id ="prenom">
    </div>
         
    <!-- Boutons Ajouter -->       
    <button type="submit" name="bt" class="btn btn-default">Ajouter</button>
</form>

<%@include file="include/footer.jsp" %>