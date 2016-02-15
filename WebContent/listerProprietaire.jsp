<%@include file="include/header.jsp" %>
	
<h2>Liste des Proprietaires</h2>

<table BORDER="1" class="table table-striped table-bordered">
	<caption>Tableau des Adhérents</caption>
	<tr>
		<th>Numero</th>
		<th>Nom</th>
		<th>Prénom</th>

	</tr>

	<c:forEach items="${mesProprietaires}" var="item">
		<tr>
			<td>${item.idProprietaire}</td>
			<td>${item.nomProprietaire}</td>
			<td>${item.prenomProprietaire}</td> 
            <td>
            	<button type ="button" class = "btn-primary btn-xs">
            		Edit
            	</button>
            	<a href="Controleur?action=supprimerProprietaire&idProprietaire=${item.idProprietaire}" >
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