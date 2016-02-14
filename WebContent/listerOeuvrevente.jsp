<%@include file="include/header.jsp" %>

<h2>Listes des Oeuvres en vente</h2>

<table BORDER="1" class="table table-striped table-bordered">
	<caption>Tableau des Oeuvre en vente</caption>
	<tr>
		<th>Numero</th>
		<th>Titre</th>
		<th>Etat</th>
		<th>Prix</th>
		<th>Proprietaire</th>

	</tr>

	<c:forEach items="${mesOeuvreVente}" var="item">
		<tr>
			<td>${item.idOeuvreVente}</td>
			<td>${item.titreOeuvreVente}</td>
			<td>${item.etatOeuvreVente}</td>
            <td>${item.prixOeuvreVente} &euro;</td>
            <td>${item.proprietaire.nomProprietaire} ${item.proprietaire.prenomProprietaire}</td>
            <td>
            	<button type ="button" class = "btn-primary btn-xs">
            		Edit
            	</button>
            	<a href="Controleur?action=supprimerOeuvreVente&idOeuvreVente=${item.idOeuvreVente}" >
            		<button type ="button" class = "btn-danger btn-xs"> 
             			Delete
             		</button>
               	</a>
             	
             </td>
		</tr>
	</c:forEach>
</TABLE>







<a class="btn btn-default" href="index.jsp"><FONT face="Arial" color="#004080">Retour Accueil</FONT></a>

<%@ include file="include/footer.jsp" %>