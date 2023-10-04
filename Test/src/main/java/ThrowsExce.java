import java.io.IOException;

public class ThrowsExce {
public void add() 
throws IOException{
	
	throw new ArithmeticException(" execption");
}
public void meth() throws IOException {
	this.add();
}
public void meth1() {
	try {
		meth();
	}
	catch(Exception e) {
		System.out.println("Exception");
	}
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ThrowsExce obj =new ThrowsExce();
obj.add();
	}
}
