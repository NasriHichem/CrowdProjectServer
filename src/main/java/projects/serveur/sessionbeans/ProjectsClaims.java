package projects.serveur.sessionbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import projects.serveur.entites.Claim;
import projects.serveur.entites.Project;
import projects.serveur.entites.Subscriber;

@Stateless
public class ProjectsClaims implements IProjectsClaimsRemote{
	 @PersistenceContext
		EntityManager em ;
	 
	 @Override
		public void update(Claim c) {
			em.merge(c);

	 }

	@Override
	public ArrayList<Claim> getListclaim() {
		return (ArrayList<Claim>) em.createQuery("select c from Claim c  ").getResultList();
		
	}

	@Override
	public ArrayList<Claim> findClaimById(int id) {
		Query queryfindById = em.createNamedQuery("select c from Claim c");
		queryfindById.setParameter("id",id);
		return (ArrayList<Claim>) queryfindById.getResultList();
	






}

	@Override
	public ArrayList<Claim> getListclaimconfirmed(int value) {
		Query queryfindclaimsconfirmed = em.createNamedQuery("findclaimsconfirmed");
		queryfindclaimsconfirmed.setParameter("value",value);
		return (ArrayList<Claim>)queryfindclaimsconfirmed.getResultList();
	}

	@Override
	public void validateSubscriber(Subscriber s, int state_claim) {
				s.setId(state_claim); 
				em.merge(s);		 	}

	@Override
	public ArrayList<Claim> getListAccountActivate(int value) {
		Query queryfindclaimsconfirmed = em.createNamedQuery("findaccountactivate");
		queryfindclaimsconfirmed.setParameter("value",value);
		return (ArrayList<Claim>)queryfindclaimsconfirmed.getResultList();
		
	}

	@Override
	public ArrayList<Claim> getListAccountDeactivate(int value) {
		Query queryfindclaimsconfirmed = em.createNamedQuery("fndaccountdeactivate");
		queryfindclaimsconfirmed.setParameter("value",value);
		return (ArrayList<Claim>)queryfindclaimsconfirmed.getResultList();
		
	}

	
	
	@Override
	public Long getNumberClaimsnoconfirmed(int value) {
		
		Query querygetprojectsnoconfirmed= em.createNamedQuery("getcountclaimsconfirmed");
		querygetprojectsnoconfirmed.setParameter("value",value);
		return  (Long) querygetprojectsnoconfirmed.getSingleResult();
		
	}

	@Override
	public ArrayList<Claim> findClaimByClamingId(int claming_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	










	
}

