package projects.serveur.entites;

import java.io.Serializable;

public class Contribuation implements Serializable{
	
	private int id ;
	private Participant participant ;
	private Project project ;
	public Contribuation(int id, Participant participant, Project project) {
		super();
		this.id = id;
		this.participant = participant;
		this.project = project;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	

}
