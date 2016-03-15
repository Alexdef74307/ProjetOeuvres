<%@include file="include/header.jsp" %>

<h2>Ajouter une &oelig;uvre en pret</h2>    
    
<form name='identification' method="post" action="Controleur?action=insererOeuvrePret" onsubmit="return teste()">
    
    
    
    <div class="form-group">
        <label for="InputTitre">Titre de l'oeuvre</label>
        <input type="text" required class"form-control" name="txtTitre" id="titre">
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