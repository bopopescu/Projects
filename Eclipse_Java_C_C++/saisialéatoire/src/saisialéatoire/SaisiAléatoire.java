package saisialéatoire;

import java.util.Scanner;
import java.io.*;

public class SaisiAléatoire{

     public static void main(String []args){
         boolean rejouer=true;
         while (rejouer ==true)
           {    double a = Math.random()*10;
        int b= (int)a;
         System.out.println(b);
       System.out.println("Veuillez saisir un nombre entre 1 et10 : ");
        Scanner sc = new Scanner(System.in);
      int c = sc.nextInt();
     System.out.println("vous avez saisi le nombre : " + c);  
         int nb=0;
         
         if (c==b)

{
    System.out.println("Vous avez reussi");
    System.out.println("veux tu rejouer oui ou non ?");
            Scanner scs = new Scanner(System.in);
            String cs = scs.nextLine();
            System.out.println("vous avez saisi choisi : " + cs);
            if (cs.equals("non"))
            {
             rejouer= false;
            }
}
    else if (c!=b)
       {while (nb<3)
       {

    System.out.println("gameover");
    System.out.println("Veuillez saisir un nombre entre 1 et10 : ");
    Scanner scc = new Scanner(System.in);
     int cc = scc.nextInt();
        System.out.println("vous avez saisi le nombre : " + cc);
        nb++;
      if(nb>=3) 
      {System.out.println("veux tu rejouer oui ou non ?");
            Scanner sca = new Scanner(System.in);
            String ca = sca.nextLine();
            System.out.println("vous avez saisi choisi : " + ca);
            if (ca.equals("non"))
            {
            rejouer= false;
            }
      }
    if (cc==b)

{
    System.out.println("Vous avez reussi");
    nb=3;
    System.out.println("veux tu rejouer oui ou non ?");
            Scanner scss = new Scanner(System.in);
            String css = scss.nextLine();
            System.out.println("vous avez saisi choisi : " + css);
            if (css.equals("non"))
            {
            rejouer= false;
            }
   
}    
}
}
     }
     
     
     }
                  }