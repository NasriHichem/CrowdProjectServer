package projects.serveur.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity

public class Project implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String name;
	private String title ;
	private String short_presentation;
	private int  duration ;
	private float turget_funding ;
	private String picture_project ;
	private String location ;
	private int  is_confirmed ;
	private int is_validate ;
	@ManyToOne
	private Creator creator ;
	@ManyToOne
	private Category category ;
	@OneToMany(mappedBy="project")
	private List<Contribuation>contribuations;
	
	public Project() {
		super();
	}

	public Project(int id, String name, String title, String short_presentation, int duration,
			float turget_funding, String picture_project, String location,int is_confirmed,
		    int is_validate,Creator creator,Category category) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.short_presentation = short_presentation;
		this.duration = duration;
		this.turget_funding = turget_funding;
		this.picture_project = picture_project;
		this.location = location;
		this.is_confirmed=is_confirmed ;
		this.is_validate=is_validate ;
		this.creator=creator ;
		this.category=category ;
	
	}
	public Project(String name, String title, String short_presentation, int duration,
	   float turget_funding, String location,
	    Creator creator,Category category) {
		super();		
		this.name = name;
		this.title = title;
		this.short_presentation = short_presentation;
		this.duration = duration;
		this.turget_funding = turget_funding;		
		this.location = location;	
		this.creator=creator ;
		this.category=category ; }
	

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
	public double getTurget_funding() {
		return turget_funding;
	}
	public void setTurget_funding(float turget_funding) {
		this.turget_funding = turget_funding;
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

	public int isIs_confirmed() {
		return is_confirmed;
	}

	public void setIs_confirmed(int is_confirmed) {
		this.is_confirmed = is_confirmed;
	}
	
	public int isIs_validate() {
		return is_validate;
	}

	public void setIs_validate(int is_validate) {
		this.is_validate = is_validate;
	}

	
	public Creator getCreator() {
		return creator;
	}
	public void setCreator(Creator creator) {
		this.creator = creator;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Contribuation> getContribuations() {
		return contribuations;
	}

	public void setContribuations(List<Contribuation> contribuations) {
		this.contribuations = contribuations;
	}
	
	
	
	

}
