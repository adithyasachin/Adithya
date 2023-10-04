package collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arrayobj=new ArrayList<Integer>();
		arrayobj.add(1);
		arrayobj.add(2);
		arrayobj.add(3);
		arrayobj.add(4);		
			System.out.println(arrayobj);	
			for(int a:arrayobj) {
				System.out.println(a);
			}
	}

}
