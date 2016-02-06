package projects.serveur.entites;

import java.io.Serializable;

public class Category implements Serializable{
	
	private int id ;
	private String name_category;
	public Category(int id, String name_category) {
		super();
		this.id = id;
		this.name_category = name_category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName_category() {
		return name_category;
	}
	public void setName_category(String name_category) {
		this.name_category = name_category;
	}
	

}
