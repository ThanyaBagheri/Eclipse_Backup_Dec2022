package day37;

import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		// Stack is last in first out (LIFO) data structure	
		// Stack class 
		// Deque (ArrayDeque)
		
		// Stack is LIFO - Last In First Out
		Stack<String> emails = new Stack<>();
		// push(element) adds element to the top of the stack
		emails.push("Email from John");
		emails.push("Email from Alex");
		emails.push("Email from Smith");
		
		// pop() gets element from the top of the stack
		//       and removes it
		String openEmail = emails.pop();
		System.out.println("Reading " + openEmail); // Email from Smith
		System.out.println(emails);
		System.out.println("---");
		
		openEmail = emails.pop();
		System.out.println("Reading " + openEmail); // Reading Email from Alex
		System.out.println(emails);
	}
}
