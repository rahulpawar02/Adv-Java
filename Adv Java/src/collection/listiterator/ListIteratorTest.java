package collection.listiterator;

import java.util.*;
public class ListIteratorTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList listObj =  new ArrayList();
		
		for(int i=1;i<=10;i++) {
			
			listObj.add(i);
		}
		System.out.println(listObj);
		
		//ListIterator
		
		@SuppressWarnings("rawtypes")
		ListIterator litr = listObj.listIterator();
		
		System.out.println("forword dir:");
		while(litr.hasNext()) {
			System.out.println(litr.next());
			
			//set method
			int i =(Integer)litr.next();
			litr.set(i+1);
		}
		System.out.println("reverse dir:");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}

}
