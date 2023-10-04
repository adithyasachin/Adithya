package exception;

public class Multicatch {


public void print() {
try {
	int b[]=new int[2];
	b[3]=5;
 }

		catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("exception "+x);
		}
       finally {
	System.out.println("finally");
}//
}
 


public static void main(String[] args) {
		// TODO Auto-generated method stub
Multicatch ob=new Multicatch();
ob.print();
	}

}
