package projects.serveur.sessionbeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projects.serveur.entites.Project;


@Stateless
public class ProjectsServices implements ProjectsServicesRemote {

	@PersistenceContext
    EntityManager em; 
    public ProjectsServices() {
       
    }

	@Override
	public List<Project> findProjectsBy(String criteria) {
		
		return null;
	}

	@Override
	public void addProject(Project p) {
		em.persist(p);
		
	}

}
