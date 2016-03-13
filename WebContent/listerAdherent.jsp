<%@include file="include/header.jsp" %>
	
<h2>Liste des Adh�rents</h2>

<table BORDER="1" class="table table-striped table-bordered">
	<caption>Tableau des Adh�rents</caption>
	<tr>
		<th>Numero</th>
		<th>Nom</th>
		<th>Pr�nom</th>
		<th>Ville</th>

	</tr>

	<c:forEach items="${mesAdherents}" var="item">
		<tr>
			<td>${item.idAdherent}</td>
			<td>${item.nomAdherent}</td>
			<td>${item.prenomAdherent}</td>
            <td>${item.villeAdherent}</td>            
            <td class="actions">
            	<button type ="button" class = "btn-primary btn-xs">
            		Modifier
            	</button>
            	<a href="Controleur?action=supprimerAdherent&idAdherent=${item.idAdherent}" >
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