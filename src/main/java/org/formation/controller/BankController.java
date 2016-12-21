package org.formation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.formation.model.Adresse;
import org.formation.model.Banquier;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.ClientService;
import org.formation.service.ConseillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class BankController {
	// Banquier banq = new Banquier();
	Conseiller conseiller = new Conseiller("Dieu", "Notre p�re", "dieu", "dieu");
	String login;
	String password;
	List<Client> listclient = new ArrayList<Client>();

	public List<Client> getListclient() {
		return listclient;
	}

	public void setListclient(List<Client> listclient) {
		this.listclient = listclient;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Autowired
	ConseillerService conseillerService;
	@Autowired
	ClientService clientService;

	// public String seConnecter(Model model) throws Exception {
	// int varpers = 0;
	//
	// // M�thode inachev�e
	//
	// List<Conseiller> conseillers = conseillerService.findAll();
	//
	// for (Conseiller conseiller : conseillers) {
	//
	// if ((conseiller.getLogin().equals(login)) &&
	// (conseiller.getMotDePasse().equals(password))) {
	// HttpSession session = (HttpSession)
	// FacesContext.getCurrentInstance().getExternalContext()
	// .getSession(true);
	// session.setAttribute("ConseillerConnect�", banq);
	// return "acceuil.xhtml";
	// } else {
	// return "home.xhtml";
	// }
	// }
	// return "";
	//
	// }

	// model.addAttribute("conseillerConnect�",new Conseiller("Dieu","Notre
	// p�re","dieu","dieu"));if(varpers==1)
	//
	// {
	// return "acceuil.xhtml";
	// }else if(varpers==2)
	// {
	// return "acceuilGerant.xhtml";
	// }else
	// {
	// return "home.xhtml";
	// }
	// }

	public List<Client> obtenirListeClients() {
		Client client = new Client("Christ", "Jesu", "JesuChrist@paradis.amen",
				new Adresse(7, "rue du paradis", "Ciel", "77777"));
		conseiller.getListClients().add(client);
		listclient = conseiller.getListClients();

		// listclient.add(client);
		return listclient;

	}

	public Integer obtenirNombreCompte() {
		return 0;

	}

}
