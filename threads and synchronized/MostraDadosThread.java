
public class MostraDadosThread extends Thread {
	
	Thread thread = new Thread(this);
	
	TesteSync testeSync;
	
	public MostraDadosThread(TesteSync testeSync) {
		this.testeSync = testeSync;
	}
	
	@Override
	public void run() {
		try 
		{
			testeSync.mostrarDados();
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
