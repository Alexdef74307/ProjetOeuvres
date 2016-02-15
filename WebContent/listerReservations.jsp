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

	<c:forEach items="${mesAdherents}" var="item">
		<tr>
			<td>${item.adherent}</td>
			<td>${item.oeuvreVente}</td>
			<td>${item.date}</td>
            <td>${item.statut}</td>            
            <td>
            	<button type ="button" class = "btn-primary btn-xs">
            		Edit
            	</button>
            	<a href="Controleur?action=supprimerAdherent&idAdherent=${item.adherent}" >
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