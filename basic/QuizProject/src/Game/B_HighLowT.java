package Game;

import java.util.Random;
import java.util.Scanner;

public class B_HighLowT 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 컴퓨터가 문제를 낸 것...
		while(true)
		{
			System.out.println("나는 지금 0부터 100 사이의 값 중에 하나를 생각하겠습니다.");
			System.out.println("당신은 그 숫자를 6회안에 맞추시면 됩니다.");
			
			int com = rand.nextInt(101);
			
			for(int i = 0; i < 6; i++)
			{
					if  (com < user) System.out.println(user + "는 제가 정한 숫자보다 큽니다.");
					else if  (com > user) System.out.println(user + "는 제가 정한 숫자보다 작습니다.");
					else if  (com == user) 
						{
						System.out.println(user + "정답입니다.");
						break;
						}
					
					if (i<5)
						System.out.println( ( 6 - i - 1) + "회 남았습니다.");
					else
						System.out.println("모든 기회를 다 사용했습니다.");
			}		
			System.out.println("게임을 더 진행하시겠습니까?다시하시겠습니까?");
			
			count--;
			
			
			}

	}

}
