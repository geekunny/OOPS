package twenty.april;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("XYZ");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String temp:list) {
			System.out.println(temp);
		}
	}

}
