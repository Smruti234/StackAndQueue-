package StackAndQueue;

import org.junit.Test;

import JavaPractice.INode;
import JavaPractice.MyNode;
import junit.framework.Assert;

public class MyStackTest {
	@Test
	public void given3NumberWhenEnqueueToQueueshouldHavaLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyStack myStack= new MyStack();
		myStack.Enqueue(myFirstNode);
		myStack.Enqueue(mySecondNode);
		myStack.Enqueue(myThirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myFirstNode, peak);
		
	}
	
}

