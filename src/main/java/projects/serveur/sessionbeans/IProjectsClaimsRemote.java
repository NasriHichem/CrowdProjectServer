package projects.serveur.sessionbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;


import projects.serveur.entites.Claim;
import projects.serveur.entites.Project;
import projects.serveur.entites.Subscriber;

@Remote
public interface IProjectsClaimsRemote {
	
	
	void update(Claim c);
	
	public ArrayList<Claim> getListclaim();
	public ArrayList<Claim>findClaimById(int id);
	public ArrayList<Claim>findClaimByClamingId(int claming_id);
	public ArrayList<Claim> getListclaimconfirmed(int value);
	public ArrayList<Claim> getListAccountActivate(int value);
	public ArrayList<Claim> getListAccountDeactivate(int value);
	public void  validateSubscriber (Subscriber s,int  state_claim);
	public Long getNumberClaimsnoconfirmed(int value);

	

}
