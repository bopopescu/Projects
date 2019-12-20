package lambda;

public class A {
public int a;
public int b ;
	
A(int a, int b )
{
	this.a=a;
	this.b=b;
}
	
	public int Apply(OperationMatch O )
	{
		return O.operation(a, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A pf= new A(4,5);
		OperationMatch addition=(int a, int b )-> a+b ;
		OperationMatch produit = (int a, int b)->a*b;
		OperationMatch substraction=(int a, int b ) -> a-b;
		int s =pf.Apply( addition);
		int l =pf.Apply(produit);
		System.out.println(s );
		System.out.println(l );
	}

}
