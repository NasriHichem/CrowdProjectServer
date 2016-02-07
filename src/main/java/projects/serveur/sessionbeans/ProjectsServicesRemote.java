package projects.serveur.sessionbeans;

import java.util.List;

import javax.ejb.Remote;

import projects.serveur.entites.Project;

@Remote
public interface ProjectsServicesRemote {
	
	public void addProject(Project p);
	public List<Project>findProjectsBy(String criteria);

}
