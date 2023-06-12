
public abstract class NotaMusical implements Cloneable {
	
	public NotaMusical clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return (NotaMusical) clone;
	}
	
	public abstract void desenha();
	
}
