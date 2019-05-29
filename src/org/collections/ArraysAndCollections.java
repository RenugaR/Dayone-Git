package org.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysAndCollections {
	public static void main(String[] args) {
		List<Integer> L=new ArrayList<Integer>();
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(90);
		L.add(10);
		L.add(10);
		L.add(40);
		L.add(50);
		Object object = L.get(4);
		System.out.println(L);
		System.out.println(object);
	}

}
