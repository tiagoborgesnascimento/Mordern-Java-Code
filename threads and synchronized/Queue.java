
public class Queue {
	
	int n = 0;
	boolean valueSet = false;
	
	public synchronized void put(int n) {
		/* there is a possibility that in very rare cases the waiting thread could be 
		 * awakened due to a spurious wakeup because of this 
		 * remote possibility, the Java API documentation recommends that calls to wait( )
		 * should take place within a loop that checks the condition on which the thread is waiting 
		 */
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
		/* there is a possibility that in very rare cases the waiting thread could be 
		 * awakened due to a spurious wakeup because of this 
		 * remote possibility, the Java API documentation recommends that calls to wait( )
		 * should take place within a loop that checks the condition on which the thread is waiting 
		 */
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
