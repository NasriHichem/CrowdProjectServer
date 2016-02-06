package projects.serveur.entites;

import java.io.Serializable;

public class Message implements Serializable{
	
	private int id ;
	private Subscriber sender ;
	private Subscriber reciever ;
	private String object_message ;
	private String text_message ;
	public Message(int id, Subscriber sender, Subscriber reciever,String object_message, String text_message) {
		super();
		this.id = id;
		this.sender = sender;
		this.reciever = reciever;
		this.object_message = object_message;
		this.text_message = text_message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Subscriber getSender() {
		return sender;
	}
	public void setSender(Subscriber sender) {
		this.sender = sender;
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
	

}
