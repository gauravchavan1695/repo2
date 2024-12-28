package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class e_javaCollections_ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration..............................................................................................
		ArrayList<object> mylist = new ArrayList<object>();
		//List mylist = new ArrayList();
		
		
		//Add data in arraylist....................................................................................
		mylist.add(100);
		mylist.add("Welcome");
		mylist.add(10.5);
		mylist.add('B');
		mylist.add(true);
		mylist.add(true);
		mylist.add(10.5);
		mylist.add(null);
		System.out.println("Array mylist = "+ mylist);
		
		//Size of an arraylist......................................................................................
		System.out.println("Size of an arraylist = "+ mylist.size());
		
		//Remove specific element from arraylist --> say removing element at 4th index..............................
		mylist.remove(4);
		System.out.println("Array After removing element: " + mylist);
		
		//Insert any value in between an array. -->say inserting string after 10.5..................................
		mylist.add(3, "Java");
		System.out.println("Array After inserting new element: " + mylist);
		
		//Modify/replace/change element in an arraylist -->ex. Replace Java with Python................................
		mylist.set(3, "Python");
		System.out.println("Array After replacing an element: " + mylist);
		
		//Access every data/value from array list...................................................................
		//METHOD 1 --> Normal for loop
		
		for(int i=0; i<mylist.size(); i++)
		{
			System.out.println("Accessing data from arraylist using for loop: "+ mylist.get(i));
		}
		
		//METHOD 2
		//Using for..each loop
		for(Object newList:mylist)
		{
			System.out.println("newList: " + newList);
		}
		
		//METHOD 3
		// Using iterator method from collection
		Iterator it = mylist.iterator();
		while (it.hasNext())
		{
			Object obj=it.next();
			System.out.println("Accessing data with iterator method: "+ obj);
		}
		
		//Checking if array list is empty or not .......................................................................
		boolean bl = mylist.isEmpty();
		System.out.println("List is empty: "+ bl);
		
		//Remove multiple elements from array list......................................................................
		List mylist2 = new ArrayList();
		mylist2.add("Welcome");
		mylist2.add("Python");
		
		mylist.removeAll(mylist2);
		System.out.println("Array after removing multiple elements: "+ mylist);
		mylist.add(true);
		System.out.println(mylist);
		
		//remove duplicate elements from an array list
		Set myset = new HashSet(mylist);
		System.out.println(myset);
		
	}

}
