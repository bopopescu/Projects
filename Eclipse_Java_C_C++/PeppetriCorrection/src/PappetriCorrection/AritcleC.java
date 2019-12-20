package PappetriCorrection;

public class AritcleC {

	private int ref;
	private String desciption;
	private String marque;
	private double prix;
	
	
	public AritcleC(int ref, String desciption, String marque, double prix) {
		super();
		this.ref = ref;
		this.desciption = desciption;
		this.marque = marque;
		this.prix = prix;
	}

	
	

	public int getRef() {
		return ref;
	}




	public void setRef(int ref) {
		this.ref = ref;
	}




	public String getDesciption() {
		return desciption;
	}




	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}




	public String getMarque() {
		return marque;
	}




	public void setMarque(String marque) {
		this.marque = marque;
	}




	public double getPrix() {
		return prix;
	}




	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "AritcleC [ref=" + ref + ", desciption=" + desciption + ", marque=" + marque + ", prix=" + prix + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}






	
	
}
