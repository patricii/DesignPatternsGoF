
public class MinhaApp {

	public static void main(String[] args) {
		Arvore a = new ArvoreNatal();
		
		a = new Estrela(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new PiscaPisca(a);
		
		a.showEnfeites();
	}

}
