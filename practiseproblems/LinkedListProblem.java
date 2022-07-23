package practiseproblems;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProblem {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		/*
		 * Using scanner to take inputs from the user
		 */

		System.out.println("Enter three numbers....");
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		/*
		 * Adding three numbers to create list Printing the list
		 */

		// list.addFirst(n1);
		// list.addFirst(n2);
		// list.addFirst(n3);

		// System.out.println(list);

		/*
		 * Adding last element to list at first & then added other two. Printing the
		 * list
		 */

		// list.addLast(n1);
		// list.addFirst(n2);
		// list.addFirst(n3);

		// System.out.println(list);
		
		/*
		*Added the first element & appending the other two
		*Printing the list
		*removing first & last element
		*printing the list
		*adding first and last element
		*using pop method
		*removing last element
		*printing the list
		*defining index variable
		*printing index of the 30
		*/
		
		
		list.addFirst(n1);
		list.addLast(n2);
		list.addLast(n3);

		System.out.println(list);
		
		//list.removeFirst();
		//System.out.println(list);
		
		//list.removeLast();
		//System.out.println(list);
		
		//list.addFirst(n1);
		//list.addLast(n3);
		//System.out.println(list);
		
		//list.pop();
		//System.out.println(list);
		
		//list.removeLast();
		//System.out.println(list);

		int index = list.indexOf(30);
		System.out.println("Index of the number = "+index);
	}
}
