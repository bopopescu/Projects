package PappetriCorrection;



public class StyloC extends AritcleC {
	private int couleur;




	public StyloC(int ref, String desciption, String marque, double prix, int couleur) {
		super(ref, desciption, marque, prix);
		this.couleur=couleur;
		// TODO Auto-generated constructor stub
	}




	public int getCouleur() {
		return couleur;
	}




	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}


	@Override
	public String toString() {
		return "StyloC [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
