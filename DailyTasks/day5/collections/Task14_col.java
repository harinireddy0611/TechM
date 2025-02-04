package day5.collections;

//import java.util.Collections;
//import java.util.Iterator;
import java.util.LinkedList;

public class Task14_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to iterate a linked list in reverse order.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
//		Collections.reverse(list);
//		Iterator<Integer> itr=list.iterator();
//		
		System.out.println("elemnts of linked list are");
//		while(itr.hasNext()) {
//			 System.out.println(itr.next());
//		}
		for(int j=list.size()-1;j>=0;j--) 
		{
			System.out.println(list.get(j));
		}

	}

}
