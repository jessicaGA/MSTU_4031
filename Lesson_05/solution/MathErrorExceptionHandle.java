public class MathErrorExceptionHandle
{
	public static void main(String[] args)
	{
		int num = 13, denom = 0, result;
		try
		{
			result = num / denom;
		}
		catch(ArithmeticException mistake)
		{
			System.out.println("Attempt to divide by Zero");
		}
	}
}