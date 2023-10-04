package interface1;

public class Example2 implements Interface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example2 i=new Example2();
i.print();
i.read();
System.out.println(i.b);
	}

	@Override
	public void print() {
		System.out.println("a");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		System.out.println("b");
		// TODO Auto-generated method stub
		
	}

}
