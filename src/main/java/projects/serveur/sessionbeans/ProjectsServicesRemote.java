package projects.serveur.sessionbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import projects.serveur.entites.Project;

@Remote
public interface ProjectsServicesRemote {
	
	public void addProject(Project p);
	public void removeProject(Project p);
	public ArrayList<Project> getListProjects();
	public ArrayList<Project>findProjectsByCategory(String category);
	public ArrayList<Project>getProjectsnoConfirmed(int value);
	public int getNumberProjectsByDate(String date1, String date2 );

}
