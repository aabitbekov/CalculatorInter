
public class main {
	public static void main(String[] args) 
    {
		Context context = new Context();
		Expression expr = context.evaluate("1+3*14");
		System.out.println(expr.interpret());;
		
    }
    }

