package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@Entity 
@NamedQueries({
	@NamedQuery(name = "getcountofmessagesbyadminbydate",
	query = "SELECT count(m) FROM Message m WHERE m.date_send BETWEEN :date1 AND :date2"
			+ " and m.administrator.id=1"),
	@NamedQuery(name = "getcountofmessagesbymodiratorbydate",
	query = "SELECT count(m) FROM Message m WHERE m.date_send BETWEEN :date1 AND :date2"
			+ " and m.administrator.id=2")
	
  })
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
	private String name_sender;
		
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
	   
	public Message(String object_message, String text_message,
		String date_send,String name_sender) {
			super();
			this.object_message = object_message;
			this.text_message = text_message;
			this.date_send = date_send;
			this.name_sender= name_sender;
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
	public Adminstrator getAdministrator() {
			return administrator;
		}
	public void setAdministrator(Adminstrator administrator) {
			this.administrator = administrator;
	}
	public String getName_sender() {
			return name_sender;
		}
	public void setName_sender(String name_sender) {
			this.name_sender = name_sender;
		}
		
		
}
