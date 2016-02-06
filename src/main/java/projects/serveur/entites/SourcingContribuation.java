package projects.serveur.entites;

import java.io.Serializable;

public class SourcingContribuation extends Contribuation implements Serializable {

	private String idea ;
	public SourcingContribuation(int id, Participant participant, Project project,String idea) {
		super(id, participant, project);
		this.idea=idea ;
		
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	
	

}
