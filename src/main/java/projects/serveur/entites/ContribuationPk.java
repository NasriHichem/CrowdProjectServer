package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class ContribuationPk implements Serializable {
	
	private int id_participant ;
	private int id_project ;
	public ContribuationPk() {
		super();
	}
	public ContribuationPk(int id_participant, int id_project) {
		super();
		this.id_participant = id_participant;
		this.id_project = id_project;
	}
	public int getId_participant() {
		return id_participant;
	}
	public void setId_participant(int id_participant) {
		this.id_participant = id_participant;
	}
	public int getId_project() {
		return id_project;
	}
	public void setId_project(int id_project) {
		this.id_project = id_project;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_participant;
		result = prime * result + id_project;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContribuationPk other = (ContribuationPk) obj;
		if (id_participant != other.id_participant)
			return false;
		if (id_project != other.id_project)
			return false;
		return true;
	}
	
    
}
