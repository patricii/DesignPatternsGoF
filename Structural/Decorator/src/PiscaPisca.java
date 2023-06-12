
//ConcreteDecorator
public class PiscaPisca extends Decoracao{
		
	public PiscaPisca(Arvore a) {
		super(a);
	}

	public void showEnfeites() {
		super.showEnfeites();
		System.out.print("Pisca-pisca, ");
	}
}
