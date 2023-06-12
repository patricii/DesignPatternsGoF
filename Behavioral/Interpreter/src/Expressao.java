
//AbstractExpression
public abstract class Expressao {
	
	public void Interpret(Contexto context)
    {
      if (context.getInput().length() == 0)
        return;
 
      if (context.getInput().startsWith(Nove()))
      {        
        context.setOutput(context.getOutput() + (9 * Multiplicador()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(Quatro()))
      {
    	context.setOutput(context.getOutput() + (4 * Multiplicador()));  
    	context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(Cinco()))
      {
    	context.setOutput(context.getOutput() + (5 * Multiplicador()));  
      	context.setInput(context.getInput().substring(1));
      }
 
      while (context.getInput().startsWith(Um()))
      {
    	context.setOutput(context.getOutput() + (1 * Multiplicador()));  
      	context.setInput(context.getInput().substring(1));
      }
    }
 
    public abstract String Um();
    public abstract String Quatro();
    public abstract String Cinco();
    public abstract String Nove();
    public abstract int Multiplicador();
}
