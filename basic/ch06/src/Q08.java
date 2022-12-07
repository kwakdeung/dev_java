// 구구단을 출력하되 짝수단만 출력하도록 프로그램을 작성하라.
// 단, 2단은 2*2까지만, 4단은 4*4까지만....8단은 8*8까지만 출력해야 한다.

public class Q08 
{

	public static void main(String[] args) 
	{
		
		for(int i = 1;  i < 10; i++)
		{
			if(i % 2 == 1)
			{
				continue;				
			}	
			for(int j = 1; j < 10; j++)
			{	
				if(i < j)
				{
					continue;
				}
				System.out.printf("%d * %d = %d",i,j,i*j);
				System.out.println(" ");
			}
		}
	}
}
