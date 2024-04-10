package MyJavaWorkspace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionList {
	
	static void list() {		
		arrayList();
		linkedList();
		}
	
	public static void arrayList() {
		/*
		 * Java ArrayList class can contain duplicate elements. Java ArrayList class
		 * maintains insertion order. Java ArrayList class is non synchronized. Java
		 * ArrayList allows random access because the array works on an index basis. In
		 * ArrayList, manipulation is a little bit slower than the LinkedList in Java
		 * because a lot of shifting needs to occur if any element is removed from the
		 * array list. We can not create an array list of the primitive types, such as
		 * int, float, char, etc. It is required to use the required wrapper class Java
		 * ArrayList gets initialized by the size. The size is dynamic in the array
		 * list, which varies according to the elements getting added or removed from
		 * the list.
		 */

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Mango");
		alist.add(null);
		alist.add("Apple");
		alist.add("Orange");
		System.out.println("COLLECTIONS ---> ARRAYLIST");
		System.out.println("TOTAL LIST OF ITEMS :: " + alist);
		Iterator itr = alist.iterator();
		System.out.println("Iterator(or next) functionality using WHILE LOOP ::");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Iterator using FOR LOOP");
		for (String fruit : alist) {
			System.out.println(fruit);
		}
	}

	public static void vectorList() {
		System.out.println("Vector List");

	}

	public static void linkedList() {
		/*
		 * Java LinkedList class can contain duplicate elements. Java LinkedList class
		 * maintains insertion order. Java LinkedList class is non synchronized. In Java
		 * LinkedList class, manipulation is fast because no shifting needs to occur.
		 * Java LinkedList class can be used as a list, stack or queue.
		 */

		LinkedList<String> LList = new LinkedList<String>();
		LList.add("Red");
		LList.add("Black");
		LList.add("Blue");
		LList.add(null);
		System.out.println("Linked List values :" + LList.get(1));
		Iterator<String> itr = LList.iterator();
		while (itr.hasNext()) {
			System.out.println("Value :" + itr.next());
		}
		for (String al : LList) {
			System.out.println("Value :" + al);
		}

	}
}
