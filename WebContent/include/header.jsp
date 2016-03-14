<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
   	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   	<link href="css/style.css" rel="stylesheet">
	

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="refresh" content="0;URL=javascript:fermer();">
	<title>Expo : Médiathèque De POLYTECH</title>
</head>


<script>
	function fermer() {
		if (confirm("Voulez-vous quitter?")) {
		    window.close();
		  }
	}
</script>

<body>
	<header>
		
		<!-- Static navbar -->
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">Médiathèque Polytech</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="index.jsp">Accueil</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                Adhérents <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="Controleur?action=listerAdherent">Liste</a>
                                </li>
                                <li>
                                    <a href="Controleur?action=ajouterAdherent">Ajout</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                Oeuvre<span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                            	<li>
                                    <a href="Controleur?action=ajouterOeuvreVente">Ajout d'une oeuvre en vente</a>
                                </li>
                                <li>
                                    <a href="Controleur?action=listerOeuvreVente">Liste des oeuvres en vente</a>
                                </li>
                                <li>
                                    <a href="Controleur?action=listerOeuvrePret">Liste des oeuvres en prêt</a>
                                </li>
                                <li>
                                    <a href="Controleur?action=listerProprietaires">Liste des propriétaires</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                Réservations<span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                            	<li>
                                    <a href="Controleur?action=ajouterReservation">Ajout d'une réservation</a>
                                </li>
                                <li>
                                    <a href="Controleur?action=listerReservation">Liste des réservations</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <!-- <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#contact">Contact</a>
                        </li>
                    </ul> -->
                </div><!--/.nav-collapse -->
            </div>
        </nav>
	</header>
	
	<div class="container">