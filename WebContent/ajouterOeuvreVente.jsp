<%@include file="include/header.jsp" %>

<h2>Ajouter une &oelig;uvre en vente</h2>    
    
<form name='identification' method="post" action="Controleur?action=insererOeuvreVente" onsubmit="return teste()">
    
    
    
    <div class="form-group">
        <label for="InputTitre">Titre de l'oeuvre</label>
        <input type="text" class"form-control" name="txtTitre" id="titre">
    </div>
    
    <div class="form-group">
        <label for="InputPrix">Etat de l'oeuvre</label>
        <input type="number" class"form-control" name="numberPrix" id="prix">
    </div>
    <div class="form-group">
        <lavel for="InputProprietaire">Propri&eacute;taire de l'oeuvre</lavel>
         <select name="cars">
            <c:forEach items="${mesProprietaires}" var="proprietaires">
                <option value =${item.idProprietaire}> ${item.prenomProprietaire} ${item.nomProprietaire}</option>
         	</c:forEach>
         </select>
    </div>
        
        
    <button type="submit" name="bt" class="btn btn-default">Ajouter</button>   
    
    
</form>