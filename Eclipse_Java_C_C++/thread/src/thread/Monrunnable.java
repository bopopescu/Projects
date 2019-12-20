package thread;


public class Monrunnable implements Runnable {

	
	private String texte ;
	private int nb ; 
	public Monrunnable(String texte, int nb)
	{ this.texte= texte;
	this.nb=nb;
	}
	
	@Override
	public void run() {
		for (int i=0;i<nb;i++)
	System.out.println(texte);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monrunnable runn = (new Monrunnable("hello", 3 ));
		Monrunnable runne = new Monrunnable("world", 6 );
		Thread r1= new Thread(runn);
		Thread r2 = new Thread(runne);
		r1.start();
		r2.start();
	}

}
