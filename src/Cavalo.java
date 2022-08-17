
public class Cavalo extends Animal {
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	public void correr() {
		System.out.println("Correndo... (pocotó pocotó)");
	}
	@Override
	public void emitirSom() {
		System.out.println("Relinchando... (iiirrrrí)");
	}
	public void visualizar() {
		System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " anos");
	}
	
}
