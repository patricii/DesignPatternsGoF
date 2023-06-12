import java.util.Hashtable;

public class Partitura {
	
	private static Hashtable<String, NotaMusical> notaMap  = new Hashtable<String, NotaMusical>();
	
	public static void carregaNotas() {
		//Adiciona todos os tipos de notas à estrutura hashtable
		Do notaDo = new Do();
		notaMap.put("Do", notaDo);
		
		Re notaRe = new Re();
		notaMap.put("Re", notaRe);
		
		Mi notaMi = new Mi();
		notaMap.put("Mi", notaMi);
		
		Fa notaFa = new Fa();
		notaMap.put("Fa", notaFa);
		
		Sol notaSol = new Sol();
		notaMap.put("Sol", notaSol);
		
		La notaLa = new La();
		notaMap.put("La", notaLa);
		
		Si notaSi = new Si();
		notaMap.put("Si", notaSi);
	}
	
	public static NotaMusical getNota(String nome){
		NotaMusical nota = notaMap.get(nome);
		
		return nota.clone();
	}
	
}
