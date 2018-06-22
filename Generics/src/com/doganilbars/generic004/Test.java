package com.doganilbars.generic004;

public class Test {
	public static void main(String[] args) {
		GenericStack<String> stack1=new GenericStack<String>();
		stack1.push("Adana");
		stack1.push("Ankara");
		stack1.push("Osmaniye");
		stack1.push("Ýstanbul");
		stack1.push("Mardin");
		System.out.println(stack1.toString());
		stack1.pop();
		System.out.println(stack1.peek());
		
		
		
		GenericStack< Integer> stack2=new GenericStack<Integer>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		
		System.out.println(stack2.toString());
		
	}

}
