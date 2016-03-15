<%@include file="include/header.jsp" %>

<h2>Listes des Oeuvres en Pret</h2>

<table BORDER="1" class="table table-striped table-bordered">
	<caption>Tableau des Oeuvre en pret</caption>
	<tr>
		<th>Numero</th>
		<th>Titre</th>
		<th>Proprietaire</th>

	</tr>

	<c:forEach items="${mesOeuvrePret}" var="item">
		<tr>
			<td>${item.idOeuvrePret}</td>
			<td>${item.titreOeuvrePret}</td>
            <td>${item.proprietaire.nomProprietaire} ${item.proprietaire.prenomProprietaire}</td>
            <td class="actions">
            	<a href="Controleur?action=supprimerOeuvrePret&idOeuvrePret=${item.idOeuvrePret}" >
            		<button type ="button" class = "btn-danger btn-xs"> 
             			Supprimer
             		</button>
               	</a>
             	
             </td>
		</tr>
	</c:forEach>
</TABLE>







<a class="btn btn-default" href="index.jsp"><FONT face="Arial" color="#004080">Retour Accueil</FONT></a>

<%@ include file="include/footer.jsp" %>