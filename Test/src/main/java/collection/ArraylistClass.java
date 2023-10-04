package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>arrayobj=new ArrayList<Integer>();
arrayobj.add(1);
arrayobj.add(2);
arrayobj.add(3);
arrayobj.add(4);		
	System.out.println(arrayobj);	
	
	arrayobj.remove(0); //to remove
	System.out.println("after remove from"+arrayobj);
	int a=arrayobj.size();
	System.out.println(a);
	arrayobj.removeAll(arrayobj); // remove 
	System.out.println("remove"+arrayobj);
	boolean present=arrayobj.contains(7);
	System.out.println("present"+arrayobj);
	Iterator obj=arrayobj.iterator();
	while(obj.hasNext()) {
		System.out.println(obj.next());
	}
	ArrayList<String> objString=new ArrayList<String>();// string
	objString.add("aaa");
	objString.add("boo");
	objString.add("ccc");
	System.out.println(objString);
	}

}
