package collectionJava;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		System.out.println("Size of the stack:"+stk.size());
		stk.push("a");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		System.out.println("element in stack:"+stk);
		System.out.println("size of stack after insert:"+stk.size());
		stk.pop();
		System.out.println("now present stack:"+stk);
		System.out.println("present  value:"+stk.peek());

	}

}
