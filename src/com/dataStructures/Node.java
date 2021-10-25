package com.dataStructures;

public class Node<E> {
	//variable declaration
	public E key;
	public Node<E> next;
	
	//constructor
	public Node(E key) {
		this.key = key;
		this.next = null;
	}

	//getter and setter
	public E getKey() {
		return key;
	}

	public void setKey(E key) {
		this.key = key;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}
