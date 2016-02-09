package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	    name="type"
	    
	)
@DiscriminatorValue("subscriber")
public class Subscriber implements Serializable {
	private int id ;
	private String firstname ;
	private String lastname ;
	private String email ;
	private String number_phone;
	private String password ;
	private List<Message>messages ;
	private List<Claim>claims;
	
	
	
	public Subscriber() {
		super();
	}
	public Subscriber(int id, String firstname, String lastname, String email, String number_phone,
			String password,List<Message>messages,List<Claim>claims) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.number_phone = number_phone;
		this.password = password;
		this.messages=messages;
		this.claims=claims;
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber_phone() {
		return number_phone;
	}
	public void setNumber_phone(String number_phone) {
		this.number_phone = number_phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToMany(mappedBy="sender")
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	@OneToMany(mappedBy="claimer")
	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}
	
	
	

}
