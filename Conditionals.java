public class Conditionals
{
	public static void main(String[] args)
	{
		int a, b;
		a = 10;
		b = 10;
		if (a == Integer.parseInt(args[0]))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println(args[0]);
		}
	}
}
