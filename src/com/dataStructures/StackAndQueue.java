package com.dataStructures;

public class StackAndQueue<E> {
	// variable declaration
	Node<E> head;
	Node<E> rear;

	// method: push element
	public void push(E key) {
		// create new node
		Node<E> newNode = new Node<E>(key);
		// check stack is empty or not
		if (isEmpty()) {
			head = newNode;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// check stack is empty or not
	public boolean isEmpty() {
		return head == null;
	}

	// get peek element
	public void peek() throws Exception {
		Node<E> temp = head;
		if (temp == null) {
			throw new Exception("cannot peek last element from empty stack");
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println(temp.getKey());
	}

	// pop element
	public void pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("popping from empty stack is not allowed");
		}
		Node<E> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	// enqueue element in Queue
	public void enqueue(E key) {
		Node<E> newNode = new Node<E>(key);
		if (head == null) {
			head = newNode;
			rear = newNode;
		}
		rear.next = newNode;
		rear = rear.next;
	}

	// method: dequeue element form Queue
	public E dequeue() {
		if (head == null) {
			return null;
		}
		Node<E> temp = head;
		head = head.next;

		if (head == null) {
			rear = null;
		}
		return temp.getKey();
	}

	// method: print stack and queue
	public void print() {
		Node<E> temp = head;
		while (temp.next != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.next;
		}
		System.out.println(temp.getKey());
		System.out.println("---------------");
	}

}
