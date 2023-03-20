package rodriguezLab19;

import java.util.ArrayList;

public class Queue <T>{
	protected ArrayList<T> queue;
	
	public Queue() {
		queue = new ArrayList<T>();
	}
	
	public void enqueue(T value) {
		queue.add(value);
	}
	
	public T dequeue() {
		T value = queue.get(0);
		queue.remove(0);
		return value;
	}
	
	public boolean isEmpty() {
		return (queue.size() == 0);
	}
}
