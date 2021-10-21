package StackAndQueue;

import org.junit.Test;

import JavaPractice.INode;
import JavaPractice.MyNode;
import junit.framework.Assert;

public class MyStackTest {
	@Test
	public void given3NumberWhenDequeueToQueueshouldHaveBeginningNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyStack myStack= new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode dequeue = myStack.dequeue();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, dequeue);
		
	}
}
	


