package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("simpleadmin")
public class SimpleAdmin extends Adminstrator implements Serializable {
	
	

}
