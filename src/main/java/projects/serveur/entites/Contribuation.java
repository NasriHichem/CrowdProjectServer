package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contribuation implements Serializable{
	
	@EmbeddedId
	private ContribuationPk pk ;
	@JoinColumn(name="id_participant",insertable=false,updatable=false)
	@ManyToOne
	private Participant participant ;
	@JoinColumn(name="id_project",insertable=false,updatable=false)
	@ManyToOne
	private Project project ;
	
	public Contribuation(ContribuationPk pk, Participant participant, Project project) {
		super();
		this.pk = pk;
		this.participant = participant;
		this.project = project;
	}
	
	public Contribuation() {
		super();
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
