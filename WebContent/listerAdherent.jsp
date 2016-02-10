<%@include file="include/header.jsp" %>
	
<h2>Listing des Adh�rents</h2>

<TABLE BORDER="1" class="table table-striped table-bordered">
	<CAPTION>Tableau des Adh�rents</CAPTION>
	<TR>
		<TH>Numero</TH>
		<TH>Nom</TH>
		<TH>Pr�nom</TH>
		<TH>Ville</TH>

	</TR>

	<c:forEach items="${mesAdherents}" var="item">
		<tr>
			<td>${item.idAdherent}</td>
			<td>${item.nomAdherent}</td>
			<td>${item.prenomAdherent}</td>
               <td>${item.villeAdherent}</td>
		</tr>
	</c:forEach>
</TABLE>

<a class="btn btn-default" href="index.jsp"><FONT face="Arial" color="#004080">Retour Accueil</FONT></a>

<%@ include file="include/footer.jsp" %>