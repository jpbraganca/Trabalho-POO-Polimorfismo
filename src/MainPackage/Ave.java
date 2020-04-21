package MainPackage;

public class Ave extends Animal{
	//Attributes
	private String corPena;
	
	//Getters & Setters
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	//Extended Methods
	@Override
	public void movimentacao() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo frutas ou insetos...");
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Som de ave");
	}
	
	//Other Methods
	public void fazerNinho() {
		System.out.println("Construindo ninho...");
	}
	
}
