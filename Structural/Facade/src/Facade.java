
class Facade {
	
	private SubsistemaUm sis1;
	private SubsistemaDois sis2;
	private SubsistemaTres sis3;
	
	public Facade(){
		sis1 = new SubsistemaUm();
		sis2 = new SubsistemaDois();
		sis3 = new SubsistemaTres();
	}
	
	public void metodoA(){
		sis1.metodoUm(); //subsistema 1
		sis2.metodoDois(); //subsistema 2
		sis3.metodoTres(); //subsistema 3
	}
	
	public void metodoB(){
		sis3.metodoTres(); //subsistema 3
		sis2.metodoDois(); //subsistema 2
		sis1.metodoUm(); //subsistema 1
	}
}