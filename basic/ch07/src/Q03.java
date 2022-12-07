public class Q03
{
	public static void main(String[] args)
	{	
		int nMin = getMin(90, 80, 100);
		System.out.println(nMin);
	}	
		
	public static int getMin(int n1, int n2, int n3)	
	{
		int result = 0;
		
		if (n1 < n2)
		{
			result = n1;
		}	
		else
		{
			result = n2;
		}
		
		if (n1 < n2)
		{
			
		}	
		
		if (result < n3)
		{
			result = result;
		}
		
		return result;
	}	
}