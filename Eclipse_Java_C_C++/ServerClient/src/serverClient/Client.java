package serverClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import  java.io.PrintWriter; 

public class Client {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  boolean running =true;
  Scanner in =new Scanner (System.in);
 
  int i = 0 ; 
		try {
			Socket s = new Socket ("localhost",12345);
			PrintWriter out  =  new PrintWriter(s.getOutputStream());
			ClientThread clientThread = new ClientThread (s);
			clientThread.start();
			//System.out.print(out);
			
		while(running)
			{
			System.out.println("taper votre message ");
			
			String str = in.nextLine();
			if (str.equals(".exit"))
			running =false; 
			out.write(str+ "\n");
			out.flush();
			
				
			//out.write("bonjour!!!!!" + i +"\n");
			//out.flush();
			//System.out.println ("j envoie le bonjour n " + i++);
		//	Thread.sleep(2000);
			
			
		}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			running =false ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			running =false ; 
		}
		
	}

	
}
class ClientThread extends Thread {
	private BufferedReader	streamIn =null;
	private Socket socket = null;
	public ClientThread(Socket socket)
	{
		
		try {
				streamIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
	
	public void run ()
	{
		boolean running=true;
	while(running)
	{try {


		String str = streamIn.readLine();
		if (str!=null)
		{System.out.println(str);
		
		
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
