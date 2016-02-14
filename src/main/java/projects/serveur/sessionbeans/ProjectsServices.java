package projects.serveur.sessionbeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import projects.serveur.entites.Project;


@Stateless
public class ProjectsServices implements ProjectsServicesRemote {

	@PersistenceContext
    EntityManager em; 
    public ProjectsServices() {
       
    }

	@Override
	public ArrayList<Project> findProjectsByCategory(String category) {
		
		Query queryfindByCategory = em.createNamedQuery("findByCategory");
		queryfindByCategory.setParameter("category",category);
		return (ArrayList<Project>) queryfindByCategory.getResultList();
	}

	@Override
	public void addProject(Project p) {
		em.persist(p);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Project> getListProjects() {
		return (ArrayList<Project>) em.createQuery("select p from Project p ").getResultList();
	}

	@Override
	public ArrayList<Project> getProjectsnoConfirmed(int value) {
		Query querygetprojectsnoconfirmed= em.createNamedQuery("getprojectsnoconfirmed");
		querygetprojectsnoconfirmed.setParameter("value",value);
		return (ArrayList<Project>)querygetprojectsnoconfirmed.getResultList();
	}

	@Override
	public void removeProject(Project p) {
		em.remove(em.merge(p));
		
	}

}
