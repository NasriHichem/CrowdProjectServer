package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Project implements Serializable{
	
	private int id ;
	private String name;
	private String title ;
	private String short_presentation;
	private int  duration ;
	private double objecif_financmant ;
	private String picture_project ;
	private String location ;
	private boolean is_confirmed ;
	private boolean is_validate ;
	private Creator creator ;
	private Category category ;
	
	public Project() {
		super();
	}

	public Project(int id, String name, String title, String short_presentation, int duration,
			double objecif_financmant, String picture_project, String location,boolean is_confirmed,
		    boolean is_validate,Creator creator,Category category) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.short_presentation = short_presentation;
		this.duration = duration;
		this.objecif_financmant = objecif_financmant;
		this.picture_project = picture_project;
		this.location = location;
		this.is_confirmed=is_confirmed ;
		this.is_validate=is_validate ;
		this.creator=creator ;
		this.category=category ;
	
	}
	public Project(String name, String title, String short_presentation, int duration,
		double objecif_financmant, String location,
	    Creator creator,Category category) {
		super();		
		this.name = name;
		this.title = title;
		this.short_presentation = short_presentation;
		this.duration = duration;
		this.objecif_financmant = objecif_financmant;		
		this.location = location;	
		this.creator=creator ;
		this.category=category ; }
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShort_presentation() {
		return short_presentation;
	}
	public void setShort_presentation(String short_presentation) {
		this.short_presentation = short_presentation;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getObjecif_financmant() {
		return objecif_financmant;
	}
	public void setObjecif_financmant(double objecif_financmant) {
		this.objecif_financmant = objecif_financmant;
	}
	public String getPicture_project() {
		return picture_project;
	}
	public void setPicture_project(String picture_project) {
		this.picture_project = picture_project;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isIs_confirmed() {
		return is_confirmed;
	}

	public void setIs_confirmed(boolean is_confirmed) {
		this.is_confirmed = is_confirmed;
	}
	
	public boolean isIs_validate() {
		return is_validate;
	}

	public void setIs_validate(boolean is_validate) {
		this.is_validate = is_validate;
	}

	@ManyToOne
	public Creator getCreator() {
		return creator;
	}
	public void setCreator(Creator creator) {
		this.creator = creator;
	}
	@ManyToOne
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	

}
