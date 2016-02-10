package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.*;
import dao.ServiceAdherent;
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
	private static final String ajouterAdherent = "ajouterAdherent";
	private static final String insererAdherent = "insererAdherent";
	private static final String modifierAdherent = "modifierAdherent";
	private static final String supprimerAdherent = "supprimerAdherent";
	private static final String listerOeuvre = "listerOeuvre";
	private static final String reserverOeuvre = "reserverOeuvre";
	private static final String modifierOeuvre = "modifierOeuvre";
	private static final String supprimerOeuvre = "supprimerOeuvre";
	
	
	//
	private static final String ERROR_KEY = "messageErreur";
	private static final String ERROR_PAGE = "/erreur.jsp";

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
		String actionName = request.getParameter(ACTION_TYPE);
		String destinationPage = ERROR_PAGE;
		ServiceAdherent unServiceAdherent;
		// execute l'action
		switch(actionName){
		
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
				
				// To be completed
				
				break;
				
			case listerOeuvre :
				
				// To be completed
				
				break;
				
			case reserverOeuvre : 
				
				// To be completed
				
				break;
				
			case modifierOeuvre : 
				
				// To be completed
				
				break;
				
			case supprimerOeuvre : 
				
				// To be completed
				
				break;
				
			default : 
				
				String messageErreur = "[" + actionName + "] n'est pas une action valide.";
				request.setAttribute(ERROR_KEY, messageErreur);
		}
		
		// Redirection vers la page jsp appropriee
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
		dispatcher.forward(request, response);

	}

}
