package StackAndQueue;

import JavaPractice.INode;
import JavaPractice.MyLinkedListTest;

public class MyStack {
	private final MyLinkedListTest myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedListTest();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public INode peak() {
		return myLinkedList.head;
	}
}


