package MainPackage;

public class Canguru extends Mamifero{
	
	@Override
	public void movimentacao() {
		System.out.println("Saltando...");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo plantas e vegetais...");
	}
	
	@Override
	public void som() {
		System.out.println("Som de Canguru...");
	}
}
