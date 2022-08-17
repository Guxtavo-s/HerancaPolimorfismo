
public class Teste {
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Bethoven",2);
		Cavalo c2 = new Cavalo("Pé-de-Pano",3);
		Preguica p1 = new Preguica("Sloth",4);
		
		c1.correr();
		c1.emitirSom();
		c1.vizualizar();
		c2.correr();
		c2.emitirSom();
		c2.visualizar();
		p1.correr();
		p1.emitirSom();
		p1.visualizar();
	}

}
