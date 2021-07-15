import java.util.Date;

public class TesteSync {
	
	public synchronized void lerDados() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Carregando os dados...");
			System.out.println("Lendo dados... " + new Date());
			Thread.sleep(1000);
		}
	}
	
	public synchronized void mostrarDados() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Iniciando o processo de print de dados...");
			System.out.println("Mostrando dados... " + new Date());
			Thread.sleep(1000);
		}
	}
}
