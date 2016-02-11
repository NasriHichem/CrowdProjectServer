package projects.serveur.entites;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("modirator")
public class Modirator extends Adminstrator implements Serializable {

}
