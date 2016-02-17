package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	    name="type"
	    
	)

public class Adminstrator implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String login ;
	private String password ;
	private String secret ;
	@OneToMany(mappedBy="administrator")
	private List<Message>messages ;
	
	public Adminstrator() {
		super();
	}
	


	public Adminstrator(int id, String login, String password,String secret) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.secret=secret ;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	public String getSecret() {
		return secret;
	}



	public void setSecret(String secret) {
		this.secret = secret;
	}



	public List<Message> getMessages() {
		return messages;
	}



	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}



	
	
	
	
	

}
