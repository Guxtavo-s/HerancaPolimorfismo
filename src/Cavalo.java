
public class Cavalo extends Animal {
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	public void correr() {
		System.out.println("Correndo... (pocot� pocot�)");
	}
	@Override
	public void emitirSom() {
		System.out.println("Relinchando... (iiirrrr�)");
	}
	public void visualizar() {
		System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " anos");
	}
	
}
