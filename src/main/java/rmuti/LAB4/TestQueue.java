package rmuti.lab04;

import rmuti.lab04.ArrayListQueue;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListQueue queue = new ArrayListQueue();
		queue.enqueque("macos");
		queue.enqueque("linux");
		queue.enqueque("windows");
		System.out.println(queue);
		
		String data = (String)queue.dequeue();
		System.out.println(queue);

	}

}