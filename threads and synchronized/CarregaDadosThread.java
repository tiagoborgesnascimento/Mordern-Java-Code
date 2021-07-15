
public class CarregaDadosThread implements Runnable{

	Thread thread = new Thread(this);
	
	TesteSync testeSync;
	
	public CarregaDadosThread(TesteSync testeSync) {
		this.testeSync = testeSync;
	}
	
	@Override
	public void run() {
		try 
		{
			testeSync.lerDados();
			printarStadoThread();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printarStadoThread() {
		System.out.println("[ESTADO DO CARREGA DADOS DA THREADH]: " + this.thread.getState().toString());
	}


}
