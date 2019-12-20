package exception;

public class DevisionParZero {

	int d = 0;
	int devision =50/d; 
 
	
	public DevisionParZero(int d, int devision) {
		super();
		this.d = d;
		this.devision = devision;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int d = 0;
		int devision =50/d;
		}
		catch(exception e )
		{
			devision=50;
		}
		
	}

}
