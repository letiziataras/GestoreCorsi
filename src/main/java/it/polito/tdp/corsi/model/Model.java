package it.polito.tdp.corsi.model;

import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	//DAO richiamato dal model e model richiamato dal controller
	private CorsoDAO corsoDao;
	
	
	public Model(){
		this.corsoDao = new CorsoDAO();
	}


	public List<Corso> getCorsoByPeriodo(int periodo){
		return this.corsoDao.getCorsoByPeriodo(periodo);
	}
	
}
