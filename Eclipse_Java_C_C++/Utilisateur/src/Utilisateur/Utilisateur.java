package Utilisateur;
import java.util.Scanner;


public class Utilisateur {
	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Veuillez saisir un nombre entre 1 et 10 :");
	    int str = sc.nextInt();
	    System.out.println("Vous avez saisez le nombre :"+ str );
	   
	    int d =Math.floor(Math.random() * 11); 
	     int c= (int) d;
	  
	    System.out.println(c );
	    
	   if ((str<10)&(str>1))
	    {
		   if (c==str)
		   {
			   System.out.println("Good");
		   }
		   
	    }
	  int nb=0;
	   if (str!=c)
	{
		 while (nb <3)
	{ Scanner scc = new Scanner(System.in);
		   System.out.println("est ce que vous voulez rejouez oui ou non ");
		   String strr = scc.nextLine();
		if  (strr.equals("oui")  )
		{
			nb=nb+1 ;
			Scanner scs = new Scanner(System.in);
			 
			System.out.println("Veuillez saisir un nombre entre 1 et 10 :");
		    int strs = scs.nextInt();
		    System.out.println("Vous avez saisez le nombre :"+ strs );
		    if ((strs<10)&(strs>1))
		    {
			   if (c==strs)
			   {
				   System.out.println("Good");
			   }
		}
		    
	   } 
	   }
		 }
	   
		 if (nb>3)  
		 { 
			 System.out.println("Gameover");
			 }
	}
}
