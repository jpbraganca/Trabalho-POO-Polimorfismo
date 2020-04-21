package MainPackage;

public class Reptil extends Animal{
	//Attributes
	private String corEscama;

	//Getters & Setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	//Methods
	@Override
	public void movimentacao() {
		// TODO Auto-generated method stub
		System.out.println("Rastejando...");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo animais menores...");
		
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Som de Reptil");
		
	}
	
	
	
}
