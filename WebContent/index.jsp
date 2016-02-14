<%@include file="include/header.jsp" %>

<h1>Gestion de l'exposition 2016 </h1>

<h3>Sélectionnez la fonctionnalité voulue: </h3>

<ul class="list-unstyled">
	<li><a href="Controleur?action=ajouterAdherent"><font
			face="Arial">Ajout Adhérent</font></a></li>
	<li><a href="Controleur?action=listerAdherent"><font
			face="Arial">Lister les adhérents</font></a><font face="Arial"> </font></li>
	<li><a href="Controleur?action=listerOeuvreVente"><font
			face="Arial">Lister les oeuvres en vente</font></a><font face="Arial"> </font></li>
	<li><a href="Controleur?action=listerOeuvrePret"><font
			face="Arial">Lister les oeuvres en pret</font></a><font face="Arial"> </font></li>
	<li><a href="javascript:fermer()"><font face="Arial">Quitter</font></a><font
		face="Arial"> </font></li>
		
</ul>
<%@include file="include/footer.jsp" %>
