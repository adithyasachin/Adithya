package polymorph;

public class ChildPoly extends Parentpoly {
	public void print()
	{
		//super.print();
		System.out.println("child ");
		
		
	}

	public static void main(String[] args)
	{
		ChildPoly ch=new ChildPoly();
	Parentpoly cm=new Parentpoly();
		ch.print();
		cm.print();
	}

}
