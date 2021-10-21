package StackAndQueue;

import org.junit.Test;

import JavaPractice.INode;
import JavaPractice.MyNode;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MyStackTest {
	@Test
	public void given3NumberWhenAddedToStackshouldHavaLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack= new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}
	
}

