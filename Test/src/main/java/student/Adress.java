package student;

public class Adress {

	int b;NameRoll b1;
	public Adress(int b,NameRoll b1)
	{
		this.b=b;
		this.b1=b1;
		
	}
public void print() {
	System.out.println(b);
	System.out.println(b1.a);
	System.out.println(b1.name);
	
}
	
public static void main(String[] args) {
		NameRoll parent=new NameRoll(20,"adithya");
		Adress child=new Adress(20,parent);
		child.print();
	}

}
