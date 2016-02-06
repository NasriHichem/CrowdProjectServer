package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

public class Creator extends Subscriber implements Serializable{

	
	private List<Project>projects ;
	
	public Creator(int id, String firstname, String lastname, String email, String number_phone, String password,
			List<Project>projects) {
		super(id, firstname, lastname, email, number_phone, password);
		this.projects=projects;
	    
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	

}
