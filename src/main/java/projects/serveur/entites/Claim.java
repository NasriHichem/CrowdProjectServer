package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Claim implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	@ManyToOne
	private Subscriber claming ;
	private String object ;
	private String cause ;
	private int state_claim ;
	
	public Claim() {
		super();
	}
	public Claim(int id, Subscriber claming, String object, String cause,int state_claim) {
		super();
		this.id = id;
		this.claming =claming;
		this.object = object;
		this.cause = cause;
		this.state_claim=state_claim ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
	public Subscriber getClaiming() {
		return claming;
	}
	public void setClaiming(Subscriber claming) {
		this.claming = claming;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public int getState_claim() {
		return state_claim;
	}
	public void setState_claim(int state_claim) {
		this.state_claim =state_claim;
	}
	
	
	

}
