package PappetriCorrection;

public class RamettePappierC extends AritcleC {

	private int gramage ; 


	public RamettePappierC(int ref, String desciption, String marque, double prix, int gramage) {
		super(ref, desciption, marque, prix);
		this.gramage=gramage;
		// TODO Auto-generated constructor stub
	}


	public int getGramage() {
		return gramage;
	}


	public void setGramage(int gramage) {
		this.gramage = gramage;
	}



	@Override
	public String toString() {
		return "RamettePappierC [gramage=" + gramage + ", toString()=" + super.toString() + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
