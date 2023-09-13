package Supr;

public class Childa extends Parent1
{
	int n=10,m=20,d;
	public void sub()
	{
		d=m-n;
		System.out.println("subtraction" +d);
		System.out.println("Parent class variable=" +super.a);
		super.add();
	}
public static void main(String args[])
{
 Childa c=new Childa();
 c.sub();
}
}
