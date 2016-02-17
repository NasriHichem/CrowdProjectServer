package projects.serveur.sessionbeans;

import javax.ejb.Remote;

import projects.serveur.entites.Adminstrator;


@Remote
public interface AdminstratorServicesRemote {
	boolean addAdminstrator(Adminstrator adminstrator);
	Adminstrator authentificate(String login, String password);
}
