<%@include file="include/header.jsp" %>
	
<h2>Liste des Adhérents</h2>

<table BORDER="1" class="table table-striped table-bordered">
	<caption>Tableau des Adhérents</caption>
	<tr>
		<th>Oeuvre Vente</th>
		<th>Adhérent</th>
		<th>Date de réservation</th>
		<th>Statut</th>

	</tr>

	<c:forEach items="${mesReservations}" var="item">
		<tr>
			<td>${item.adherent.nomAdherent} ${item.adherent.prenomAdherent}</td>
			<td>${item.oeuvreVente.titreOeuvreVente	}</td>
			<td>${item.date}</td>
            <td>${item.statut}</td>            
            <td class="actions">
            	<button type ="button" class = "btn-primary btn-xs">
            		Modifier
            	</button>
            	<a href="Controleur?action=supprimerReservation&idAdherent=${item.adherent.idAdherent}&dateReservation=${item.date}&idOeuvreVente=${item.oeuvreVente.idOeuvreVente}" >
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