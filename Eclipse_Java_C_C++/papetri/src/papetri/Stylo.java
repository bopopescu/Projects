package papetri;

public class Stylo extends Article {
	private int couleur ;
	
public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
Stylo (int ref, String dexriptif, String marque, double prix, int couleur)
{
	super(ref,dexriptif,marque,prix);
	this.couleur=couleur;
	
}
	
public 	String toString()
{
	
	
	return super.toString() +  "la couleur est " + this.couleur ;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
