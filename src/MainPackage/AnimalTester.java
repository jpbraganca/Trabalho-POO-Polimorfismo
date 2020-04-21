package MainPackage;

public class AnimalTester {

	public static void main(String[] args) {
		
		 Mamifero m = new Mamifero();
		 Canguru k = new Canguru();
		 Ave a = new Ave();
		 Peixe p = new Peixe();
		 Reptil r = new Reptil();
		 
		 System.out.println("Mamifero: \n");
		 m.setPeso(20.50);
		 m.setIdade(8);
		 m.setMembros(4);
		 m.setCorPelo("Pelo marrom");
		 m.movimentacao();
		 m.som();
		 m.alimentar();
		 
		 System.out.println("\n=======================================\n");
		 
		 System.out.println("Canguru: \n");
		 k.setPeso(80);
		 k.setIdade(7);
		 k.setMembros(4);
		 k.setCorPelo("Pelo Beje");
		 k.movimentacao();
		 k.alimentar();
		 k.som();
		 
		 System.out.println("\n=======================================\n");
		 
		 System.out.println("Ave: \n");
		 a.setPeso(0.5);
		 a.setIdade(2);
		 a.setMembros(2);
		 a.alimentar();
		 a.movimentacao();
		 a.som();
		 a.fazerNinho();
		 
		 System.out.println("\n=======================================\n");
		 
		 System.out.println("Peixe: \n");
		 p.setPeso(0.05);
		 p.setIdade(2);
		 p.setMembros(2);
		 p.setCorEscama("Escama Azul");
		 p.alimentar();
		 p.movimentacao();
		 p.som();
		 p.soltarBolha();
		 
		 System.out.println("\n=======================================\n");
		 
		 System.out.println("Reptil: \n");
		 r.setPeso(2);
		 r.setIdade(5);
		 r.setMembros(4);
		 r.setCorEscama("Escama Verde");
		 r.alimentar();
		 r.movimentacao();
		 r.som();
		 
		 System.out.println("\n=======================================\n");
		 System.out.println("Aluno: João Pedro Baptista de Bragança");
		 System.out.println("\n=======================================\n");
	}

}
