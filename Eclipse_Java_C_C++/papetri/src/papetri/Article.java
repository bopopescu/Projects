package papetri;

public class Article {

	
	private int reference;
	private String dexriptif;
	private String marque;
	private double prix;
	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	 public Article ()
	 {
		 
	 }
	
	public Article ( int reference, String dexriptif, String marque, double prix)
	 {
		 this.reference=reference ;
		 this.dexriptif= dexriptif;
		 this.marque=marque;
		 this.prix= prix;
		 
	 }
	
	public double getPrix() 
	{return prix; 
	}
	public String  toString()
	{
		return "la reference =" + this.reference +"le dexriptif ="+ this.dexriptif+"la marque ="+ this.marque+"le prix ="+this.getPrix();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
