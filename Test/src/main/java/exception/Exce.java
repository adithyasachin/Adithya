package exception;

public class Exce {
public void add() {
	try {
	int a=10/0;
	System.out.println("a");
}
	catch(Exception e) {
	System.out.println(e+" "+"exception handling");
	}	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exce ob=new Exce ();
		ob.add();
		
	}

}
