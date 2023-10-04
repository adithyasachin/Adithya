package fin;

public class FinVari extends FinMeth {
 final int age=10;
  public void print()
  {
	 // age=10;
   System.out.println("Age");
  }
  
// public final void display()
// {
	// System.out.print("dis");
// }//
  public static void main(String[] args) {

		// TODO Auto-generated method stub
		
FinVari s= new FinVari();
s.print();
s.display();
FinCls b=new FinCls();
b.disp();
System.out.println(s.age);
	}

}
