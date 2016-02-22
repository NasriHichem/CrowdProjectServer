package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries({@NamedQuery(name = "getcountclaimsconfirmed",
query = "SELECT count(c) FROM Claim c  WHERE c.state_claim =:value "),
	@NamedQuery(name = "findclaimsconfirmed",
	query = "SELECT  c FROM Claim c  WHERE c.state_claim =:value ")	
})
public class Claim implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final FetchType eager = null;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Subscriber claming ;
	private String object ;
	private String cause ;
	private int state_claim ;
	
	private String date_publish ;
	
	public Claim() {
		super();
	}
	public Claim(int id, Subscriber claming, String object, String cause,int state_claim,String date_publish) {
		super();
		this.id = id;
		this.claming =claming;
		this.object = object;
		this.cause = cause;
		this.state_claim=state_claim ;
		this.date_publish= date_publish;
		
	}
	
	

	
	public String getDate_publish() {
		return date_publish;
	}
	public void setDate_publish(String date_publish) {
		this.date_publish = date_publish;
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
