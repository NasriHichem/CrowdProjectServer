package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Participant extends Subscriber implements Serializable {
	
	@OneToMany(mappedBy="participant")
	private List<Contribuation>contribuations ;

	public Participant(int id, String firstname, String lastname, String email, String password,
			String secret,int accountnumber,List<Contribuation>contribuations) {
		super(id, firstname, lastname, email,password,secret,accountnumber);
		this.contribuations=contribuations;
	     
	}
	

	public Participant() {
		super();
	}


	public List<Contribuation> getContribuations() {
		return contribuations;
	}

	public void setContribuations(List<Contribuation> contribuations) {
		this.contribuations = contribuations;
	}
	

}
