package papetri;

public class RamettePapper extends Article {
 public int ramette ;
 
 
	
	
	
	public int getRamette() {
	return ramette;
}





public void setRamette(int ramette) {
	this.ramette = ramette;
}


RamettePapper(int ref, String dexriptif, String marque,double prix, int ramette)
{
	super(ref, dexriptif,marque,prix);
	this.ramette=ramette;
	
	
}

public String toString ()
{
	return super.toString() + this.ramette ; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
