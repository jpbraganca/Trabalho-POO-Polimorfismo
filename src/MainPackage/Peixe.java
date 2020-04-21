package MainPackage;

public class Peixe extends Animal{
	//Attributes
	private String corEscama;
	
	//Getters & Setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	//Extended Methods
	@Override
	public void movimentacao() {
		// TODO Auto-generated method stub
		System.out.println("Nadando...");		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo algas / outros peixes ...	");		
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Peixe nao faz som.");
	}
	
	//Other Methods
	public void soltarBolha() {
		System.out.println("Soltou uma bolha...\n Glub!!");
	}
	
	
}
