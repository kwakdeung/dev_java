public class Q04 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int sum = 0;
		
		do
		{
			num++;
			sum = sum + num;
			System.out.println(num);	
		} while(num < 1000);
		
		System.out.printf("1+2+3+.......+1000  = %d  ", sum);
	}
}
