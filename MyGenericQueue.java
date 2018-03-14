
public class MyGenericQueue<T> {

	private int maxSize;
	private int noOfElem;
	private T queue[] ;


	public MyGenericQueue(int maxSize) {
		this.maxSize = maxSize;
		this.noOfElem = 0;
		this.queue = <T>[maxSize];
	}

	public boolean isEmpty() {
		if (noOfElem == 0)
			return true;
		return false;
	}

	public int length() {
		return noOfElem;
	}

	public void push(T element) {
		if (noOfElem >= maxSize)
			throw new RuntimeException("Queue Overflow!! Can't perform PUSH operation");
		else {
			queue[noOfElem++] = element;
			System.out.println("Pushed " + element );
		}
	}

	public T pop() {
		if (noOfElem == 0)
			throw new RuntimeException("Queue Empty!! Can't perfrom POP operation");
		else if (noOfElem == 1) {
			noOfElem--;
			System.out.println("Popped " + queue[0]);
			return queue[0];
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
		StringBuilder s=new StringBuilder("[");
		for(int i = 0; i < noOfElem ; i++) {
			s.append(+queue[i]+",");
		}
		return s.toString().substring(0, s.toString().length()-1)+"]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
