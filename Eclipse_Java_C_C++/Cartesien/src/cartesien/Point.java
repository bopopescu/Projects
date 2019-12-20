package cartesien;

public class Point {
	private int x  ;
 private int  y ;
	
	
	 Point() {
		 
	 }
	Point(int x, int y)
	{
	  this.x = x;
	  this.y=y;
	}
	
	public int getX()
	{
		return x; 
	}
	public int getY()
	{
		return y; 
	}
  public	String toString () 

	{
		return "x="+ this.x + " y="+ this.y ;
	}
	
	public static void main(String []args){
		Point P =new Point(15,7);
		System.out.println(P);
		Point A=new Point(20,21);
		System.out.println(A);
		
	}
}