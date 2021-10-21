package StackAndQueue;

import org.junit.Test;

import JavaPractice.INode;
import JavaPractice.MyNode;
import junit.framework.Assert;

public class MyStackTest {
	@Test
	public void given3NumberInStackWhenPopedshouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack= new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode,pop);
	}
	
}

