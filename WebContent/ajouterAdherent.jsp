<%@include file="include/header.jsp" %>

<form  name='identification' method="post" action="Controleur?action=insererAdherent" onsubmit="return teste()">

    <div class="form-group">   
		<label for="InputLastName">Nom de l'adh�rent :</label>
	    <input type="text" class="form-control" name="txtnom" value=""  id ="nom">
    </div>
    
	<div class="form-group">
		<label for="InputFirstName">Pr�nom de l'adh�rent :</label>
        <input type="text" class="form-control" name="txtprenom"  id ="prenom">
    </div>
    
    <div class="form-group">
    	<label for="InputCity">Ville de l'adh�rent :</label>   
        <INPUT type="text" class="form-control" name="txtville" id ="ville">
    </div>
         
    <!-- Boutons Ajouter -->       
    <button type="submit" name="bt" class="btn btn-default">Ajouter</button>
</form>

<%@include file="include/footer.jsp" %>