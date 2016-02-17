package projects.serveur.sessionbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import projects.serveur.entites.Adminstrator;


@Stateless
public class AdminstratorServices implements AdminstratorServicesRemote {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public boolean addAdminstrator(Adminstrator adminstrator) {
		try {
			entityManager.persist(adminstrator);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	public Adminstrator authentificate(String login, String password) {
		Adminstrator adminstrator =null;
		Query query = entityManager.createQuery("select a from Adminstrator a where a.login=:l and a.password=:p");  
		query.setParameter("l", login).setParameter("p", password);
		try {
			adminstrator =(Adminstrator) query.getSingleResult();
		} catch (Exception e) {
			adminstrator = null;
		}
		
		
		return adminstrator;
	}
}
