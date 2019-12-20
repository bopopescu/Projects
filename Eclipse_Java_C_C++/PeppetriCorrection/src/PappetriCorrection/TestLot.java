package PappetriCorrection;

public class TestLot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lot a =new Lot(10);
    try {
    	
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 0);
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 1);
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 2);
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 3);
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 4);
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 5);
    	a.ajouterArticle(new StyloC(1,"stylo","bic ",1.0,5), 6);
    	a.ajouterArticle(new RamettePappierC(2,"RamettePapper","Paperus",6.0,3), 7);
    	a.ajouterArticle(new RamettePappierC(2,"RamettePapper","Paperus",6.0,3), 8);
    	a.ajouterArticle(new RamettePappierC(2,"RamettePapper","Paperus",6.0,3), 9);
    }
    catch(ArticleException e )
    {
    	System.out.println(e.getMessage());
    }
    
    
    
    System.out.println(a.calculerFacture());
	

	try 
	{a.supprimerArticle(8);
	
	}
	catch(ArticleException e )
	{
		System.out.println(e.getMessage());
	}
	
	System.out.println(a.calculerFacture());
}
}