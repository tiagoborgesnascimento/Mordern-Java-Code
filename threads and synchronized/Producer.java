
public class Producer implements Runnable {
	
	Queue q;
	Thread t;
	
	public Producer(Queue q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		this.t = new Thread(this);
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) 
		{
			q.put(++i);
		}
	}
	
}
