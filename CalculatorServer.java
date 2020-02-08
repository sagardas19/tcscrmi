import java.rmi;
public class CalculatorServer
{
	public CalculatorServer()
	{
	try
	{
		CalculatorImp1 c = new CalculatorImp1();
		Naming.rebind("rmi://localhost:1099/CalculatorService,c");
	}
		catch (Exception e)
	{
		System.out.println("Trouble: " + e);
	}
	}
		public static void main(String args[])
	{
		new CalculatorServer();
	}
	}