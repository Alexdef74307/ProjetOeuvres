<%@include file="include/header.jsp" %>

<h2>Ajouter une &oelig;uvre en vente</h2>    
    
<form name='identification' method="post" action="Controleur?action=insererOeuvreVente" onsubmit="return teste()">
    
    
    
    <div class="form-group">
        <label for="InputTitre">Titre de l'oeuvre</label>
        <input type="text" class"form-control" name="txtTitre" id="titre">
    </div>
    
    <div class="form-group">
        <label for="InputPrix">Prix de l'oeuvre</label>
        <input type="number" class"form-control" name="numberPrix" id="prix">
    </div>
    <div class="form-group">
        <label for="InputProprietaire">Propri&eacute;taire de l'oeuvre</label>
         <select name="proprietaire">
            <c:forEach items="${mesProprietaires}" var="proprietaires">
                <option value ="${proprietaires.idProprietaire}"> ${proprietaires.prenomProprietaire} ${proprietaires.nomProprietaire}</option>
         	</c:forEach>
         </select>
    </div>
        
        
    <button type="submit" name="bt" class="btn btn-default">Ajouter</button>   
    
    
</form>