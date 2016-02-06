package projects.serveur.entites;

import java.io.Serializable;

public class Claim implements Serializable{
	
	private int id ;
	private Subscriber  complimaint ;
	private Subscriber the_hcomplimaint ;
	private String object ;
	private String cause ;
	public Claim(int id, Subscriber complimaint, Subscriber the_hcomplimaint, String object, String cause) {
		super();
		this.id = id;
		this.complimaint = complimaint;
		this.the_hcomplimaint = the_hcomplimaint;
		this.object = object;
		this.cause = cause;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Subscriber getComplimaint() {
		return complimaint;
	}
	public void setComplimaint(Subscriber complimaint) {
		this.complimaint = complimaint;
	}
	public Subscriber getThe_hcomplimaint() {
		return the_hcomplimaint;
	}
	public void setThe_hcomplimaint(Subscriber the_hcomplimaint) {
		this.the_hcomplimaint = the_hcomplimaint;
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
	

}
