package rodriguezLab19;

import java.util.ArrayList;

public class Stack<T> {
	private T value;
	private ArrayList<T> stack;
	
	public Stack() {
		stack = new ArrayList<T>();
	}
	
	public void push(T value) {
		stack.add(value);
	}
	
	public T pop() {
		T value = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return value;
	}
	
	public boolean isEmpty() {
		return stack.size() == 0;
	}
	
}
