package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("creator")
public class Creator extends Subscriber implements Serializable{

	
	private List<Project>projects ;
	
	public Creator(){
			
	    
	}
	public Creator(int id, String firstname, String lastname, String email, String number_phone, String password,
			List<Project>projects) {
		super(id, firstname, lastname, email, number_phone, password);
		this.projects=projects;
	    
	}
	
	@OneToMany(mappedBy="creator")
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	

}
