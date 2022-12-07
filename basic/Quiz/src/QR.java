import java.util.Random;

public class QR 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		while (true)
		{	
		// 102 ~ 987 -> 100 ~ 999
		int num1 = rand.nextInt(9) + 1;	// 1~9
		int num2 = rand.nextInt(10);	// 0~9
		int num3 = rand.nextInt(10);	//	0~9
		
		if (num1 != num2 && num2 != num3 && num3 != num1 )
		{
			System.out.printf("%d%d%d", num1, num2, num3);
			break;
		}
		}
	}
}


	

