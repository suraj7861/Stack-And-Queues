package com.dataStructures;

public class StackAndQueue<E> {
	//variable declaration
	Node<E> head;

	//method: push element
	public void push(E key) {
		//create new node
		Node<E> newNode = new Node<E>(key);
		//check stack is empty or not
		if (isEmpty()) {
			head = newNode;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//check stack is empty or not
	public boolean isEmpty() {
		return head == null;
	}
	
	//method: print stack and queue
	public void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.getKey()+"->");
			temp = temp.next;
		}
	}

}
