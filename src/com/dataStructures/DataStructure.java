package com.dataStructures;

public class DataStructure {
	// method: push element
	public static void pushElement() {
		// object creation
		StackAndQueue<Integer> stack = new StackAndQueue<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();

	}

	// method: peek element
	public static void peekElement() throws Exception {
		// object creation
		StackAndQueue<Integer> stack = new StackAndQueue<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peek();
		System.out.println("------------------");
	}

	// method: peek element
	public static void popElement() throws Exception {
		// object creation
		StackAndQueue<Integer> stack = new StackAndQueue<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.pop();
		stack.print();
		System.out.println("------------------");
	}

	// method: enqueue element in Queue
	public static void enqueueElement() {
		// object creation
		StackAndQueue<Integer> stack = new StackAndQueue<Integer>();
		stack.enqueue(56);
		stack.enqueue(30);
		stack.enqueue(70);
		stack.print();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Stack and Queue");
		System.out.println("Push element in stack ");
		pushElement();

		System.out.println("Peek element in stack ");
		peekElement();

		System.out.println("Pop element in stack ");
		popElement();

		System.out.println("enqueue element in Queue ");
		enqueueElement();

	}

}
