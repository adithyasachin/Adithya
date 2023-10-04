package pinno;

public class Bank {
	private int PIN;
	public void getter() {
		switch(PIN)
		{
		case 1001:
			System.out.println("valid ");
			break;
		case 1212:
			System.out.println("vaild");
			break;
			
			default:
				System.out.println("invalid");
				break;
		}
	
	
	}
public void setter(int PIN) {
	this.PIN=PIN;
}
}
