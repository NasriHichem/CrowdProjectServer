package projects.serveur.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

@NamedQueries( { @NamedQuery(name="Findbyclaiming",query="select c from Claim c , Subscriber s  where c.claming.id=s.id  and   c.claming.firstname like :txtclaiming"),
		@NamedQuery(name="Findbymonth",query="select count(c) from Claim c where c.date_publich between :date1 and :date2")})
public class Claim implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	@ManyToOne
	private Subscriber claming ;
	private String object ;
	private String cause ;
	private int state_claim ;
	private String date_publich;
	
	
	public Claim() {
		super();
	}
	
	public Claim(Subscriber claming, String object, String cause, int state_claim, String date_publich) {
		super();
		this.claming = claming;
		this.object = object;
		this.cause = cause;
		this.state_claim = state_claim;
		this.date_publich = date_publich;
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

	public String getDate_publich() {
		return date_publich;
	}
	public void setDate_publich(String date_publich) {
		this.date_publich = date_publich;
	}


}
