package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Claim implements Serializable{
	
	private int id ;
	private Subscriber  claimer ;// cheki
	private Subscriber claming ;//li chkina bih 
	private String object ;// objet recalamation
	private String cause ;// sabab
	private int etat_claim ;
	
	public Claim() {
		super();
	}
	public Claim(int id, Subscriber claimer, Subscriber claming, String object, String cause,int etat_claim) {
		super();
		this.id = id;
		this.claimer = claimer;
		this.claming =claming;
		this.object = object;
		this.cause = cause;
		this.etat_claim=etat_claim ;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	public Subscriber getClaimer() {
		return claimer;
	}
	public void setClaimer(Subscriber claimer) {
		this.claimer = claimer;
	}
	@ManyToOne
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
	public int getEtat_claim() {
		return etat_claim;
	}
	public void setEtat_claim(int etat_claim) {
		this.etat_claim = etat_claim;
	}
	
	
	

}
