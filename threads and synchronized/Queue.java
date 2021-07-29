
public class Queue {
	
	int n = 0;
	boolean valueSet = false;
	
	public synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		this.n = n;
		valueSet = !valueSet;
		System.out.println("Inteiro produzido na fila: " + n);
		notify();
	}
	
	public synchronized void get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = !valueSet;
		System.out.println("Inteiro consumido na fila: " + n);
		notify();
	}
}
