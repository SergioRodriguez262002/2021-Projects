package rodriguezLab19;

public class RodriguezLab19 {

	public static void main(String[] args) {
		Queue fifoQueue = new Queue<Integer>();
		fifoQueue.enqueue(5);
		fifoQueue.enqueue(10);
		fifoQueue.enqueue(15);

		System.out.println("\nDequeue demo");
		System.out.println(fifoQueue.dequeue());
		System.out.println(fifoQueue.dequeue());
		System.out.println(fifoQueue.dequeue());
		System.out.println("Is empty " + fifoQueue.isEmpty());

		fifoQueue = new Queue<String>();
		fifoQueue.enqueue("First added");
		fifoQueue.enqueue("Second added");
		fifoQueue.enqueue("Third added");

		System.out.println("\nDequeue demo");
		System.out.println("\n" + fifoQueue.dequeue());
		System.out.println(fifoQueue.dequeue());
		System.out.println(fifoQueue.dequeue());

		System.out.println("Is empty " + fifoQueue.isEmpty());

		Stack lifoStack = new Stack<Integer>();
		lifoStack.push(5);
		lifoStack.push(10);
		lifoStack.push(15);

		System.out.println("\nPop demo");
		System.out.println("\n" + lifoStack.pop());
		System.out.println(lifoStack.pop());
		System.out.println(lifoStack.pop());
		
		System.out.println("Is empty "+lifoStack.isEmpty());
		
		lifoStack = new Stack<String>();
		lifoStack.push("First added");
		lifoStack.push("Second added");
		lifoStack.push("Third added");

		System.out.println("\nPop demo");
		System.out.println("\n" + lifoStack.pop());
		System.out.println(lifoStack.pop());
		System.out.println(lifoStack.pop());
		
		System.out.println("Is empty "+lifoStack.isEmpty());
		
		System.out.println("\nPriority Queue test");
		Queue priorityQ = new Queue<Integer>();
		//priorityQ.queue(5)

	}

}
