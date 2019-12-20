package thread;

public class MonThread extends Thread{

	private String texte ; 
	private  int nb ; 
	public MonThread(String texte, int nb)
	{
		this.texte = texte;
		this.nb= nb;
		
	}
	
	public void run ()
	{
		for (int i=0;i<nb;i++)
			System.out.println(texte);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonThread thread = new MonThread("hello", 3 );
		MonThread threade = new MonThread("world", 6 );
		thread.start();
		threade.start();
	}

	
}
