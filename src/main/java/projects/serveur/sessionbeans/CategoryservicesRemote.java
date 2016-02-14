package projects.serveur.sessionbeans;

import java.util.ArrayList;

import javax.ejb.Remote;

import projects.serveur.entites.Category;

@Remote
public interface CategoryservicesRemote {
	
	
	public ArrayList<Category>getList();

}
