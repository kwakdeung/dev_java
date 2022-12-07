package Game;

import java.util.Random;
import java.util.Scanner;

//게임설명 : 입력, 반복, 비교
//컴퓨터가 낸 숫자를 맞춘다.
//기회는 6회 주어진다. (5회로 하면 난이도 상승)
//숫자를 맞추거나 기회를 다 소진하면 다시 할 것인가를 물어본다.


public class B_HighLow 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(101);
		int user = -1;
		while(user!=num)
		{
			System.out.println("몇이라고 생각하십니까? <0 to 100>");
			user = sc.nextInt();
		
		
		if (user==num) 
		{
			System.out.println("정답입니다! 다시하시겠습니까?");
			return;
		}
		else if (user > num)
		{
			System.out.printf("%d 는제가 정한 숫자보다 작습니다.", user);
		}
		else
		{	
			System.out.printf("%d 는제가 정한 숫자보다 큽니다.", user);
		}
		System.out.println("다시하시겠습니까?");
		
		}

	}

}
