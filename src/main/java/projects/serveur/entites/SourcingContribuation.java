package projects.serveur.entites;

import java.io.Serializable;

public class SourcingContribuation extends Contribuation implements Serializable {

	private String idea ;
	public SourcingContribuation(ContribuationPk pk, Participant participant, Project project,String idea) {
		super(pk, participant, project);
		this.idea=idea ;
		
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	
	

}
