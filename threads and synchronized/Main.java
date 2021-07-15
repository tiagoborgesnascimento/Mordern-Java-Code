public class Main {

	public static void main(String[] args) {
		
		TesteSync testeSync = new TesteSync();
		
		CarregaDadosThread t1 = new CarregaDadosThread(testeSync);
		MostraDadosThread t2 = new MostraDadosThread(testeSync);
		
		t1.thread.start();
		t2.thread.start();
		
	}
}
