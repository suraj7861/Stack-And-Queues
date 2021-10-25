package com.dataStructures;

public class StackAndQueue<E> {
	Node<E> head;

	public void push(E key) {
		Node<E> newNode = new Node<E>(key);
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

	public boolean isEmpty() {
		return head == null;
	}
	public void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.getKey()+"->");
			temp = temp.next;
		}
	}

}
