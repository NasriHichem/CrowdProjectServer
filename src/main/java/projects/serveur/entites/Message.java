package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity 
public class Message implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;  
	@ManyToOne
	private Subscriber reciever ;
	@ManyToOne
	private Adminstrator administrator ;
	private String object_message ;
	private String text_message ;
	private String date_send;
	
	public Message() {
		super();
	}
	public Message(int id,String object_message, String text_message,
	String date_send) {
		super();
		this.id = id;		
		this.object_message = object_message;
		this.text_message = text_message;
		this.date_send = date_send;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Subscriber getReciever() {
		return reciever;
	}
	public void setReciever(Subscriber reciever) {
		this.reciever = reciever;
	}
	public String getObject_message() {
		return object_message;
	}
	public void setObject_message(String object_message) {
		this.object_message = object_message;
	}
	public String getText_message() {
		return text_message;
	}
	public void setText_message(String text_message) {
		this.text_message = text_message;
	}
	public String getDate_send() {
		return date_send;
	}
	public void setDate_send(String date_send) {
		this.date_send = date_send;
	}
	
	

}
