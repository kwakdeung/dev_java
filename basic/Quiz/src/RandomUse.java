import java.util.Random;

public class RandomUse
{

	public static void main(String[] args)
	{
		Random rand = new Random();
		//rand.setSeed(10);
		for (int i=0; i<5; i++)
		{			
			int num = rand.nextInt(10); // 0 ~ 9
			System.out.println(num);
		}

	}

}
+
