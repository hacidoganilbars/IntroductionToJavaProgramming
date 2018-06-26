package com.doganilbars.collections008;

import java.util.Stack;

public class EvaluateExpression {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: Java EvaluateExpression \"expression\"");
			System.exit(1);
		}

		try {
			System.out.println(evaluateExpression(args[0]));
		} catch (Exception ex) {
			System.out.println("Wrong expression: " + args[0]);
		}
	}

	private static int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		expression = insertBlanks(expression);

		String[] tokens = expression.split(" ");
		for (String token : tokens) {
			if (token.length() == 0) {
				continue;
			} else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-'
						|| operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			} else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			} else if (token.trim().charAt(0) == '(') {
				operatorStack.push('(');
			} else if (token.trim().charAt(0) == ')') {
				while (operatorStack.peek() != '(') {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.pop();
			} else {
				operandStack.push(new Integer(token));
			}

		}

		while (!operatorStack.isEmpty()) {
			processAnOperator(operandStack, operatorStack);
		}
		return operandStack.pop();

	}

	private static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
		char op = operatorStack.pop();
		int op1 = operandStack.pop();
		int op2 = operandStack.pop();

		if (op == '+') {
			operandStack.push(op2 + op1);
		} else if (op == '-') {
			operandStack.push(op2 - op1);
		} else if (op == '*') {
			operandStack.push(op2 * op1);
		} else if (op == '/') {
			operandStack.push(op2 / op1);
		}
	}

	private static String insertBlanks(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-'
					|| s.charAt(i) == '*' || s.charAt(i) == '/') {
				result += " " + s.charAt(i) + " ";
			} else {
				result += s.charAt(i);
			}
		}
		return result;
	}

}
