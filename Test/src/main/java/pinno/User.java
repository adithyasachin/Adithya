package pinno;

import java.util.Scanner;

public class User {

	private static Scanner num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter pin: ");
num = new Scanner(System.in);

Bank pin = new Bank();
pin.setter(num.nextInt());
pin.getter();
	}

}
