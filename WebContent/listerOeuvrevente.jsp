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

	<c:forEach items="${mesOeuvrevente}" var="item">
		<tr>
			<td>${item.idOeuvrevente}</td>
			<td>${item.titreOeuvrevente}</td>
			<td>${item.etatOeuvrevente}</td>
            <td>${item.prixOeuvrevente} €</td>
            <td>${item.proprietaire.nomProprietaire}</td>
		</tr>
	</c:forEach>
</TABLE>







<a class="btn btn-default" href="index.jsp"><FONT face="Arial" color="#004080">Retour Accueil</FONT></a>

<%@ include file="include/footer.jsp" %>