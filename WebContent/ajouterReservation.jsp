<%@include file="include/header.jsp" %>

<form  name='identification' method="post" action="Controleur?action=insererReservation" onsubmit="return teste()">

	<h2>Ajouter une reservation</h2>


	<div class="form-group">
        <label for="InputProprietaire">Adh&eacute;rant souhaitant r&eacute;server</label>
         <select name="adherent">
            <c:forEach items="${mesAdherents}" var="adherent">
                <option value ="${adherent.idAdherent}"> ${adherent.idAdherent} ${adherent.prenomAdherent} ${adherent.nomAdherent}</option>
         	</c:forEach>
         </select>
    </div>
    
    <div class="form-group">
        <label for="InputProprietaire">Oeuvre à r&eacute;server</label>
         <select name="oeuvreVente">
            <c:forEach items="${mesOeuvresVentes}" var="oeuvreVente">
                <option value ="${oeuvreVente.idOeuvreVente}"> ${oeuvreVente.idOeuvreVente} ${oeuvreVente.titreOeuvreVente}</option>
         	</c:forEach>
         </select>
    </div>

    <div class="form-group">
    	<label for="InputCity">Date de réservation :</label>   
        <INPUT type="date" class="form-control" name="txtdate" id ="date">
    </div>
         
    <!-- Boutons Ajouter -->       
    <button type="submit" name="bt" class="btn btn-default">Ajouter</button>
</form>

<%@include file="include/footer.jsp" %>