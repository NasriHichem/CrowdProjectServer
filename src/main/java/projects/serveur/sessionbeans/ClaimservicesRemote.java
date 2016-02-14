package projects.serveur.sessionbeans;

import java.util.ArrayList;

import javax.ejb.Remote;

import projects.serveur.entites.Claim;;

@Remote
public interface ClaimservicesRemote {
	public void removeClaim(Claim c);
	public ArrayList<Claim> getListclaim();

}
