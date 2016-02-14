package projects.serveur.sessionbeans;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projects.serveur.entites.Claim;


@Stateless
public class Claimservices implements ClaimservicesRemote {
	
@PersistenceContext
   EntityManager em;
    public Claimservices() {
        
    }

	@Override
	public void removeClaim(Claim c) {
		em.remove(em.merge(c));
		
	}

	@Override
	public ArrayList<Claim> getListclaim() {
		
		return (ArrayList<Claim>) em.createQuery("select c from Claim c ").getResultList();
	}

}
