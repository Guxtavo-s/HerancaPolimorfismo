
public class Cachorro extends Animal {
		public Cachorro(String nome, int idade) {
			super(nome, idade);
		}
		public void correr() {
			System.out.println("Correndo...");
		}
		@Override
		public void emitirSom() {
			System.out.println("Latindo... (AU AU AU)");
		}
		public void vizualizar () {
			System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " anos");
		}
		

}
