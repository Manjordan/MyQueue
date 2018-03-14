public class MyQueue {

	private int maxSize;
	private int noOfElem;
	int[] queue;

	public MyQueue(int maxSize) {
		this.maxSize = maxSize;
		this.noOfElem = 0;
		this.queue = new int[maxSize];
	}

	public boolean isEmpty() {
		if (noOfElem == 0)
			return true;
		return false;
	}

	public int length() {
		return noOfElem;
	}

	public void push(int element) {
		if (noOfElem >= maxSize)
			throw new RuntimeException("Queue Overflow!! Can't perform PUSH operation");
		else {
			queue[noOfElem++] = element;
			System.out.println("Pushed " + element );
		}
	}

	public int pop() {
		if (noOfElem == 0)
			throw new RuntimeException("Queue Empty!! Can't perfrom POP operation");
		else if (noOfElem == 1) {
			int poppedEmelent = queue[0];
			noOfElem--;
			queue[0]=0;
			System.out.println("Popped " + poppedEmelent);
			return poppedEmelent;
		} else {
			int poppedEmelent = queue[0];
			for (int i = 0; i < noOfElem - 1; i++) {
				queue[i] = queue[i + 1];
			}
			noOfElem--;
			queue[noOfElem] = 0;
			System.out.println("Popped " + poppedEmelent);
			return poppedEmelent;

		}

	}

	@Override
	public String toString() {
		if(this.isEmpty())
			return "[]";
		StringBuilder s=new StringBuilder("[");
		for(int i = 0; i < noOfElem ; i++) {
			s.append(+queue[i]+",");
		}
		return s.toString().substring(0, s.toString().length()-1)+"]";
	}

	public static void main(String[] args) {

		MyQueue queue1 = new MyQueue(3);
		System.out.println("length of queue: " + queue1.length());
		System.out.println("is empty: " + queue1.isEmpty());
		// queue1.pop(3);
		queue1.push(4);
		System.out.println("length of queue: " + queue1.length());
		System.out.println("is empty: " + queue1.isEmpty());
		queue1.pop();
		System.out.println(queue1.toString());
		System.out.println("length of queue: " + queue1.length());
		System.out.println("is empty: " + queue1.isEmpty());
		queue1.push(6);
		queue1.push(9);
		queue1.push(83);
		System.out.println(queue1.toString());
		System.out.println("length of queue: " + queue1.length());
		System.out.println("is empty: " + queue1.isEmpty());
		queue1.pop();
		System.out.println(queue1.toString());
	}

}
