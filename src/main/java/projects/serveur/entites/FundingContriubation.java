package projects.serveur.entites;

import java.io.Serializable;

public class FundingContriubation  extends Contribuation implements Serializable{

	private int sum_fundings;
	public FundingContriubation(ContribuationPk pk, Participant participant, Project project
			,int sum_fundings) {
		super(pk, participant, project);
		this.sum_fundings=sum_fundings;
		
	}
	public int getSum_fundings() {
		return sum_fundings;
	}
	public void setSum_fundings(int sum_fundings) {
		this.sum_fundings = sum_fundings;
	}
	

}
