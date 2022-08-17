
public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	public void correr() {
		System.out.println("Subindo na árvore... bem len..ta..mente...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Gritando... AAAAAAAAAAAAAa");
		
	}
	public void visualizar() {
		System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " anos");
	}
	

}
