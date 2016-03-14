package controle;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.*;
import dao.*;
import meserreurs.*;

/**
 * Servlet implementation class Controleur
 */ 
@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ACTION_TYPE = "action";
	// Revoir si utile ou non 
	
	private static final String listerAdherent = "listerAdherent";
	private static final String listerProprietaires = "listerProprietaires";
	private static final String ajouterAdherent = "ajouterAdherent";
	private static final String insererAdherent = "insererAdherent";
	private static final String modifierAdherent = "modifierAdherent";
	private static final String supprimerAdherent = "supprimerAdherent";
	private static final String supprimerProprietaire = "supprimerProprietaire";
	private static final String ajouterOeuvreVente = "ajouterOeuvreVente";
	private static final String insererOeuvreVente = "insererOeuvreVente";
	private static final String listerOeuvreVente = "listerOeuvreVente";
	private static final String listerOeuvrePret = "listerOeuvrePret";
	private static final String modifierOeuvre = "modifierOeuvre";
	private static final String supprimerOeuvreVente = "supprimerOeuvreVente";
	private static final String supprimerOeuvrePret = "supprimerOeuvrePret";
	private static final String listerReservation = "listerReservation";
	private static final String ajouterReservation = "ajouterReservation";
	private static final String insererReservation = "insererReservation";
	private static final String supprimerReservation = "supprimerReservation";
	//
	private static final String ERROR_KEY = "messageErreur";
	private static final String ERROR_PAGE = "/error404.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controleur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processusTraiteRequete(request, response);
		} catch (MonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processusTraiteRequete(request, response);
		} catch (MonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void processusTraiteRequete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, MonException {
		String idAdherent;
		String idOeuvreVente;
		String action = request.getParameter(ACTION_TYPE);
		System.out.println(action);
		String destinationPage = ERROR_PAGE;
		ServiceAdherent unServiceAdherent;
		ServiceOeuvreVente unServiceOeuvreVente;
		ServiceOeuvrePret unServiceOeuvrePret;
		ServiceProprietaire unServiceProprietaire;
		ServiceReservation unServiceReservation;
		// execute l'action
		System.out.println(action);
		switch(action){
		
			case listerAdherent :
				
				unServiceAdherent = new ServiceAdherent();
				request.setAttribute("mesAdherents", unServiceAdherent.consulterListeAdherents());
				destinationPage = "/listerAdherent.jsp";
				break;
			
			case ajouterAdherent :
				
				destinationPage = "/ajouterAdherent.jsp";
				
				break;
				
			case insererAdherent : 
				
				Adherent unAdherent = new Adherent();
				unAdherent.setNomAdherent(request.getParameter("txtnom"));
				unAdherent.setPrenomAdherent(request.getParameter("txtprenom"));
				unAdherent.setVilleAdherent(request.getParameter("txtville"));
				unServiceAdherent = new ServiceAdherent();
				unServiceAdherent.insertAdherent(unAdherent);
				destinationPage = "/index.jsp";
				
				break;
				
			case modifierAdherent : 
				
				// To be completed
				
				break;
				
			case supprimerAdherent : 
				
				unServiceAdherent = new ServiceAdherent();
				idAdherent = request.getParameter("idAdherent");
				unServiceAdherent.supprimerAdherent(idAdherent);
				destinationPage = "/Controleur?action=listerAdherent"; 
				
				break;
				
			case supprimerProprietaire : 
				
				unServiceProprietaire = new ServiceProprietaire();
				idAdherent = request.getParameter("idProprietaire");
				unServiceProprietaire.supprimerProprietaire(idAdherent);
				request.setAttribute("mesProprietaires", unServiceProprietaire.getProprietaires());
				destinationPage = "/listerProprietaire.jsp";
				break;
				
			case listerProprietaires : 	
				
				unServiceProprietaire = new ServiceProprietaire();
				request.setAttribute("mesProprietaires", unServiceProprietaire.getProprietaires());
				destinationPage = "/listerProprietaire.jsp";
				break;
			
			case ajouterOeuvreVente :
				
				unServiceProprietaire = new ServiceProprietaire();
				request.setAttribute("mesProprietaires", unServiceProprietaire.getProprietaires());
				destinationPage = "/ajouterOeuvreVente.jsp";
				break;
				
			case insererOeuvreVente : 
				
				OeuvreVente uneOeuvreVente = new OeuvreVente();
				uneOeuvreVente.setTitreOeuvreVente(request.getParameter("txtTitre"));
				uneOeuvreVente.setPrixOeuvreVente((Float.parseFloat(request.getParameter("numberPrix"))));
				String idProprietaire = request.getParameter("proprietaire");
				unServiceProprietaire = new ServiceProprietaire();
				Proprietaire p = unServiceProprietaire.getProprietaire(idProprietaire);
				uneOeuvreVente.setProprietaire(p);
				unServiceOeuvreVente = new ServiceOeuvreVente();
				unServiceOeuvreVente.insertOeuvreVente(uneOeuvreVente);
				destinationPage = "/index.jsp";
				break;
				
			case listerOeuvreVente :
				
				unServiceOeuvreVente = new ServiceOeuvreVente();
				request.setAttribute("mesOeuvreVente", unServiceOeuvreVente.consulterListeOeuvresVentes());
				destinationPage = "/testOeuvreVente.jsp";
				break;
				
			case listerOeuvrePret :
				
				unServiceOeuvrePret = new ServiceOeuvrePret();
				request.setAttribute("mesOeuvrePret", unServiceOeuvrePret.consulterListeOeuvresPrets());
				destinationPage = "/listerOeuvrePret.jsp";
				break;
			
				
			case ajouterReservation : 
				
				unServiceOeuvreVente = new ServiceOeuvreVente();
				request.setAttribute("mesOeuvresVentes", unServiceOeuvreVente.consulterListeOeuvresVentes());
				unServiceAdherent = new ServiceAdherent();
				request.setAttribute("mesAdherents", unServiceAdherent.consulterListeAdherents());
				destinationPage = "/ajouterReservation.jsp";
				
				break;
				
			case insererReservation :
				
				unServiceReservation = new ServiceReservation();
				Reservation uneReservation = new Reservation();				
				Adherent adherent = new ServiceAdherent().consulterAdherent(Integer.parseInt(request.getParameter("adherent")));
				uneReservation.setAdherent(adherent);
				OeuvreVente oeuvre = new ServiceOeuvreVente().consulterOeuvreVente(request.getParameter("oeuvreVente"));
				uneReservation.setOeuvreVente(oeuvre);
				String s = request.getParameter("txtdate");
				
				String[] dateTab = s.split("-");	
				Date d = new Date();
				d.setDate(Integer.parseInt(dateTab[2]));
				d.setMonth(Integer.parseInt(dateTab[1]));
				d.setYear(Integer.parseInt(dateTab[0]));
				uneReservation.setDate(d);
				unServiceReservation.insererReservation(uneReservation);
				
				
		//		unServiceAdherent.insertAdherent(unAdherent);
				destinationPage = "/index.jsp";
				
			case modifierOeuvre : 
				
				// To be completed
				
				break;
				
			case supprimerOeuvreVente : 
				
				unServiceOeuvreVente = new ServiceOeuvreVente();
				idOeuvreVente = request.getParameter("idOeuvreVente");
				unServiceOeuvreVente.supprimerOeuvreVente(idOeuvreVente);
				request.setAttribute("mesOeuvreVente", unServiceOeuvreVente.consulterListeOeuvresVentes());
				destinationPage = "/listerOeuvreVente.jsp";
				break;
				
			case supprimerOeuvrePret : 
				
				unServiceOeuvrePret = new ServiceOeuvrePret();
				String idOeuvrePret = request.getParameter("idOeuvrePret");
				unServiceOeuvrePret.supprimerOeuvrePret(idOeuvrePret);
				request.setAttribute("mesOeuvrePret", unServiceOeuvrePret.consulterListeOeuvresPrets());
				destinationPage = "/listerOeuvrePret.jsp";
				break;
				
			case listerReservation : 
				
				unServiceReservation = new ServiceReservation();
				request.setAttribute("mesReservations", unServiceReservation.listerReservations());
				destinationPage = "/listerReservations.jsp";
				break;
			
			case supprimerReservation : 
				unServiceReservation = new ServiceReservation();
				idAdherent = request.getParameter("idAdherent");
				String dateReservation = request.getParameter("dateReservation");
				idOeuvreVente = request.getParameter("idOeuvreVente");
				unServiceReservation.supprimer(idOeuvreVente,dateReservation,idAdherent);
				request.setAttribute("mesAdherents", unServiceReservation.listerReservations());
				destinationPage = "/listerReservations.jsp";
				break;
				
			default : 
				
				String messageErreur = "[" + action + "] n'est pas une action valide.";
				request.setAttribute(ERROR_KEY, messageErreur);

		}
		
		// Redirection vers la page jsp appropriee
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
		dispatcher.forward(request, response);

	}

}
