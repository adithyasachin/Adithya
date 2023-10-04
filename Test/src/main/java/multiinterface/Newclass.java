package multiinterface;

public class Newclass implements Newinterface,Multiinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Newclass object=new Newclass();
object.display();
object.print();
object.add();

	}
public void display() {
	System.out.println("hello");
}
public void print() {
	System.out.println("hee");
}
public void add() {
	System.out.println("add");
}

}
