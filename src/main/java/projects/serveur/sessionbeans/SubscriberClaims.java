package projects.serveur.sessionbeans;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projects.serveur.entites.Claim;
import projects.serveur.entites.Creator;
import projects.serveur.entites.Subscriber;

@Stateless
public class SubscriberClaims implements ISubscriberClaimsRemote{
    @PersistenceContext
    EntityManager em ;
    
    
    public void  updateStateClaim(Creator c) {
      
       em.merge(c);   		
	}

    public Subscriber findByIdSubscriber (int id){
    	return em.find(Subscriber.class,id);
    }

	@Override
	public void removeSubscriber(Subscriber s) {
		em.remove(em.merge(s));
		
	}

    
    
}
