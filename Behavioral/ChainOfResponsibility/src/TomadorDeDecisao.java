
//Handler
public abstract class TomadorDeDecisao {
	protected TomadorDeDecisao sucessor;

	public void setSucessor(TomadorDeDecisao sucessor) {
		this.sucessor = sucessor;
	}

	public abstract void aprova(Compra compra);
}
