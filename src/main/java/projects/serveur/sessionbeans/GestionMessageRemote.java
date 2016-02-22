package projects.serveur.sessionbeans;

import java.util.ArrayList;

import javax.ejb.Remote;

import projects.serveur.entites.Message;



@Remote
public interface GestionMessageRemote {
	
	public void SendMessageByModerator( Message M);
	public ArrayList<Message> FindAllMessageofModirator();
	public void removeMessage(Message m);
	public ArrayList<Message> FindAllMessageofAdmin();
	public int  getNumberofmessagesbyadminbydate(String date1,String date2 );
	public int  getNumberofmessagesbymodiratorbydate(String date1,String date2 );
	
	
}
