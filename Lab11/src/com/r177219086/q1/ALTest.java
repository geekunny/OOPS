package com.r177219086.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ALTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1=list;
		Collections.reverse(list1);
		Iterator<Integer> it=list1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
