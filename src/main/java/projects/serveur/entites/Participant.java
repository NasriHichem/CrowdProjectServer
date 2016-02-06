package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

public class Participant extends Subscriber implements Serializable {
	
	private List<Contribuation>contribuations ;

	public Participant(int id, String firstname, String lastname, String email, String number_phone, String password,
			List<Message> messages,List<Contribuation>contribuations) {
		super(id, firstname, lastname, email, number_phone, password);
		this.contribuations=contribuations;
	     
	}

	public List<Contribuation> getContribuations() {
		return contribuations;
	}

	public void setContribuations(List<Contribuation> contribuations) {
		this.contribuations = contribuations;
	}
	

}
