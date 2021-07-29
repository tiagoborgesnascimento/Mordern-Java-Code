
public class Consumer implements Runnable {

	Queue q;
	Thread t;
	
	public Consumer(Queue q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		this.t = new Thread(this);
	}
	
	@Override
	public void run() {
		while(true) {
			q.get();
		}
	}

}
