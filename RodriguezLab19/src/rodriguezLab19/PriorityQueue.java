package rodriguezLab19;

import java.util.ArrayList;

public class PriorityQueue<T extends Comparable<T>> extends Queue<T> {
	
	public PriorityQueue() {
		super();
	}
	
	
	public T dequeue() {
		// traverse the queue and find the first instance of the max
		T priorityT = super.queue.get(0);
		int indexPT = 0;
		for(int i = 0; i < super.queue.size(); i++) {
			if(super.queue.get(i).compareTo(priorityT) > 0) {
				indexPT = i;
				priorityT = super.queue.get(i);
			}
		}
		
		priorityT = super.queue.get(indexPT);
		super.queue.remove(indexPT);
		return priorityT;
	}
	
	public <T extends Comparable<T>> T dequeue(ArrayList<T> list) {
		T temp;
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size() - 1; j++) {
				if(list.get(j).compareTo(list.get(j+1)) > 0) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		T hp = 
		
		
	}
	
}
