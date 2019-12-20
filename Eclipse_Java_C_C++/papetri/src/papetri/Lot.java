package papetri;

public class Lot implements IFacturable {

	
 public Article tab [] ;
 public int nbarticles;
 
 
 Lot ( Article tab[],int nbarticles)
 {
	 this.tab =tab;
	 this.nbarticles=nbarticles;
 }
 
 public Article getArticle(int i) 
 
 {
	 return tab[i];
 }
 public boolean ajouterArticle(Article a, int indice)
 
 { try 
		 { this.tab[indice]=a;
		 return true ; }
		 catch (Exception e)
 {
	 return false ;
 
 }
 }
 
 public boolean supprimerArticle(int indice)
 
 
 { try {
	 this.tab[indice]= null;
	 return true;
 }
 
 catch(Exception e )
 {
		 return false ;
	 
 } 
	 
	 
 }
	public double calculerFacture()
	{  double Somme =0; 
	for (int i =0; i < this.tab.length; i++)
	{Somme= Somme + this.tab[i].getPrix();
	}
	
	
		return Somme ;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* Article b[] = {new Article(3, "ok", "oki", 12.2),new Article(4,"ok","oki",12.2)};
		Lot a= new Lot(b, 2);
		System.out.println(a.calculerFacture());*/
		
		/*Article c[]= {new Stylo(3, "ok", "oki", 12.2,1),new RamettePapper(3, "ok", "oki", 12.2,1)};
		Lot d = new Lot(c,2);
		System.out.println(d.nbarticles);
		System.out.println(d.calculerFacture());*/
		
		
	}

}
