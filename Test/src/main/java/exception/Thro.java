package exception;

public class Thro {
	public void voting()
	{
	int age = 20;
    
    if (age >= 18) {
        System.out.println("You are eligible to vote.");
    } else {
        throw new ArithmeticException("not eligible");
         	
}
    System.out.println("You are not eligible to vote.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thro ob=new Thro();
ob.voting();
			}

}
