package com.demo.collection;

import java.util.Stack;

public class StackDemoEx {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(101);
		stk.push(23);
		stk.push(67);
		stk.push(101);
		System.out.println("before pop :"+stk);
		System.out.println("peek:"+stk.peek());
		stk.pop();
		System.out.println("after pop :"+stk);
	}
}
