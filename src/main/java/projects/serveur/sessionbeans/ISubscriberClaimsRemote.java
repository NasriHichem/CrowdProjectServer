package projects.serveur.sessionbeans;

import javax.ejb.Remote;

import projects.serveur.entites.Creator;
import projects.serveur.entites.Subscriber;

@Remote
public interface ISubscriberClaimsRemote {
	Subscriber findByIdSubscriber (int id);
	void  updateStateClaim(Creator cr);
	public void removeSubscriber(Subscriber s);

}
