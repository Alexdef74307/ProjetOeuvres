<%@include file="include/header.jsp" %>

<h1>Bienvenue sur l'application de gestion des &oelig;uvres de la m�diath�que Polytech 2016</h1>

<h3>S�lectionnez la fonctionnalit� voulue: </h3>

<div class="col-md-4">
	<a href="Controleur?action=ajouterAdherent">
		<img src="img/add_user.png" class="icon" alt="Ajouter adh�rent"/>
		<p class="indication">Ajouter un adh�rent</p>
	</a>
</div>
<div class="col-md-4">
	<a href="Controleur?action=listerAdherent">
		<img src="img/list_users.png" class="icon" alt="Lister adh�rents"/>
		<p class="indication">Lister les adh�rents</p>
	</a>
</div>
<div class="col-md-4">
	<a href="Controleur?action=listerProprietaires">
		<img src="img/list_owners.png" class="icon" alt="Lister propri�taires"/>
		<p class="indication">Lister les propri�taires</p>
	</a>
</div>

<div class="col-md-4">
	<a href="Controleur?action=ajouterOeuvreVente">
		<img src="img/add_artwork.png" class="icon" alt="Ajouter &oelig;uvres en vente"/>
		<p class="indication">Ajouter une &oelig;uvre en vente</p>
	</a>
</div>

<div class="col-md-4">
	<a href="Controleur?action=listerOeuvreVente">
		<img src="img/list_artworks.png" class="icon" alt="Lister &oelig;uvres en vente"/>
		<p class="indication">Lister les &oelig;uvres en vente</p>
	</a>
</div>
<div class="col-md-4">
	<a href="Controleur?action=listerOeuvrePret">
		<img src="img/list_lended_artworks.png" class="icon" alt="Lister &oelig;uvres en pr�t"/>
		<p class="indication">Lister les &oelig;uvres en pr�t</p>
	</a>
</div>
<div class="col-md-4">
	<a href="Controleur?action=listerReservation">
		<img src="img/list_reservations.png" class="icon" alt="Lister r�servations"/>
		<p class="indication">Lister les r�servations</p>
	</a>
</div>

<div class="col-md-4">
	<a href="javascript:fermer()">
		<img src="img/quit.png" class="icon" alt="Quitter"/>
		<p class="indication">Quitter l'application</p>
	</a>
</div>

<!--  
<ul class="list-unstyled">
	<li>
		<a href="Controleur?action=ajouterAdherent"><font face="Arial">Ajout Adh�rent</font></a>
	</li>
	<li>
		<a href="Controleur?action=listerAdherent"><font face="Arial">Lister les adh�rents</font></a>
	</li>
	<li>
		<a href="Controleur?action=listerProprietaires"><font face="Arial">Lister les proprietaires</font></a>
	</li>
	<li>
		<a href="Controleur?action=listerOeuvreVente"><font face="Arial">Lister les &oelig;uvres en vente</font></a>
	</li>
	<li>
		<a href="Controleur?action=listerOeuvrePret"><font face="Arial">Lister les &oelig;uvres en pret</font></a>
	</li>
	<li>
		<a href="Controleur?action=listerReservation"><font face="Arial">Lister les reservations</font></a>
	</li>
	<li>
		<a href="javascript:fermer()"><font face="Arial">Quitter</font></a>
	</li>		
</ul> -->
<%@include file="include/footer.jsp" %>
