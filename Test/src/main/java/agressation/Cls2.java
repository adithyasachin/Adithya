package agressation;

public class Cls2 {
	int b;Cls1 n;
	public Cls2(int b,Cls1 n)
	{
this.b=b;
this.n=n;
	}
	public void print() {
		System.out.println(b);
		System.out.println(n.a);
		System.out.println(n.name);
	}
		public static void main(String[] args) {
		Cls1 parent=new Cls1(5,"adithya");
		Cls2 child=new Cls2(5,parent);
child.print();
	}

}
