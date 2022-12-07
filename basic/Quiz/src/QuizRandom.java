//서로다른 3자리의 랜덤숫자 만들기
//QuizRandom

//랜덤한 세자리 수를 표시합니다.
//단 100의 자리와 수와 10의 자리의 수 1의 자리의 수는 같아서는 안됩니다.

//Ex ) 101 등 안됨 : 1이 두개임, 777 등 안됨 : 7이 세개임, 224 등 안됨 : 2가 두개임, 233 등 안됨 : 3이 두개임

import java.util.Random;

public class QuizRandom
{

	public static void main(String[] args)
	{
		Random rand = new Random();
		for (int i=1; i<2; i++)
		{			
			int num = rand.nextInt(900)+100;
			
			int num1 = num / 100;
			int result1 = num % 100;
			int num2 = result1 / 10;
			int result2 = num % 10;
			int num3 = result2 / 1;
			int result3 = num3 % 1;
			
			if(result1 == result2 || result2==result3 || result1==result3)
				continue;
			else	
			{
				System.out.printf("값 : %d", num);
				break;
			}
		}

	}

}
