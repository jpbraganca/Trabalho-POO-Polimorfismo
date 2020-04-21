package MainPackage;

public class Mamifero extends Animal {
	
	//Attributes
	private String corPelo;
	
	//Methods
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void movimentacao() {
		// TODO Auto-generated method stub
		System.out.println("Correndo...");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando...");
		
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Som de mamifero...");
		
	}
	
	
	
	
}
