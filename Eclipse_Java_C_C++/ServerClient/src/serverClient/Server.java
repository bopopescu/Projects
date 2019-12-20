package serverClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server  {

  private static Map<String , ServerThread > clients = new HashMap<String, ServerThread>();
	
	public static Map<String, ServerThread> getclients() {
	return clients;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ServerSocket server = null;
	BufferedReader BufReader = null;
	String str = null;
	try {
		server = new ServerSocket(12345);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	while(true){
	try {
	Socket client	= server.accept() ;
		ServerThread thread= new ServerThread (client) ;
				
		System.out.println("Demand reçue");
		
		thread.start();
		clients.put(client.getInetAddress().toString() + ":"+client.getPort(),thread);
		
		System.out.println("client num" + clients.size()+ " accecpted " + client);
		System.out.println("Boucle for:");
       
	
		} 
	
	
		
		catch (IOException ioe) {}
		

	}
	}
}


class ServerThread extends Thread {
	
	private BufferedReader	streamIn =null;
	private PrintWriter streamOut ;
	String	id;
	public ServerThread(Socket client)
	{
		
		try {
				streamIn = new BufferedReader(new InputStreamReader(client.getInputStream()));
			streamOut= new PrintWriter(client.getOutputStream());
			id = client.getInetAddress().toString() + ":"+client.getPort();
	//	Server.getclients().put(id,this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public PrintWriter getStreamOut() {
		return streamOut;
	}

	public void run ()
	{
		boolean running=true;
	while(running)
	{try {


		String str = streamIn.readLine();
		if (str!=null)
		{System.out.println(str);
		
		 for (Map.Entry<String, ServerThread> mapentry : Server.getclients().entrySet()) {
			 
			 if  (! mapentry.getValue().id.equals  (id  ))
			 
			 {//	System.out.println("clé : "  +mapentry.getKey() + " | valeur: " + mapentry.getValue());
			 	mapentry.getValue().getStreamOut().println( id + "says : " + str);
	        	mapentry.getValue().getStreamOut().flush();
	        	
	        }}
		
		}
		else 
			
			running=false; 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		running=false; 
	}
	}
	}
}


