package projects.serveur.sessionbeans;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projects.serveur.entites.Category;
import projects.serveur.entites.Project;


@Stateless

public class Categoryservices implements CategoryservicesRemote {

   
	@PersistenceContext
    EntityManager em; 
    public Categoryservices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ArrayList<Category> getList() {
		return (ArrayList<Category>) em.createQuery("select c from Category c ").getResultList();
		
	}
    

}
