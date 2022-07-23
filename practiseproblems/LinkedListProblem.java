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
		 * Adding elements to list & then printing
		 */

		list.addFirst(n1);
		list.addFirst(n2);
		list.addFirst(n3);

		System.out.println(list);
		
		

	}
}
