// 중복되지 않는 3개의 정수를 생성한다. 중복?
// 사용자는 3개의 숫자를 입력한다.
// 생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
// 위치?
// 숫자는 맞지만 위치가 틀렸다면 ball로 판정한다.
// 숫자3개가 모두 일치하지 않으면  out으로 판정한다. 
// 3 strike 가 되면 게임은 종료된다.
// 시도한 횟수를 표시한다


import java.util.Random;
import java.util.Scanner;

public class PR 
{

		
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int ran1, ran2, ran3;
		ran1 = rand.nextInt(9)+1;
		ran2 = rand.nextInt(9)+1;
		ran3 = rand.nextInt(9)+1;
		
		if (ran1 != ran2 && ran2 != ran3 && ran3 != ran1)
		{
			break;
		}
			
		while(true)
		{	
			int num = 0;
			int result = 0;
			int strike = 0;
			int ball = 0;
			
			System.out.println("숫자로 하는 야구게임시작");
			System.out.println("세자리 숫자를 입력하세요.");	
		    int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			if(num1 == ran1) 
			{
				strike++;
			}
				else if(num1 == ran2 | num1 == ran3)
				{
					ball++;
				}	
			if(num2 == ran2) 
			{
				strike++;
			}
				else if(num2 == ran1 | num2 == ran3)
				{
					ball++;
				}		
			if(num3 == ran3) 
			{
				strike++;
			}
				else if(num3 == ran1 | num3 == ran1)
				{
					ball++;
				}	
			
			if(strike == 3) 
			{
				System.out.println("정답!");
				break;
			}
			else if (strike==0 && ball==0)
			{
				System.out.println("아웃!");
			}
			else
			{
				System.out.println(strike + "Strike " + ball + "Ball " );
			}
			
		}
		
			
	}	
}





