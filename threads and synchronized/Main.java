public class Main {

	public static void main(String[] args) {
		
	//Runnable, Thread e Synchronized
		
	/*
		TesteSync testeSync = new TesteSync();
		
		CarregaDadosThread t1 = new CarregaDadosThread(testeSync);
		MostraDadosThread t2 = new MostraDadosThread(testeSync);
		
		t1.thread.start();
		t2.thread.start();
		
	*/
	
	//notify() e wait()
	
		Queue queue = new Queue();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		producer.t.start();
		consumer.t.start();
		
	}
}
