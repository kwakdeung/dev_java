//1,2,3 중 하나의 숫자를 난수로 생성한다.
//사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
//승부를 판단하여 출력한다. ???
//1,2,3,0 이외의 숫자를 입력하면 잘못된 입력을 알려준다.
//게임을 반복하다 0을 내면 종료한다.


package Game;

import java.util.Random;
import java.util.Scanner;

public class A3_RPSGame {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int user = 0;
		int com = (int)(rand.nextInt(3) + 1);
				
		while (true)
		{
		System.out.println("무엇을 내겠습니까?(1:가위, 2:바위, 3:보, 0:종료)");
							
		user = sc.nextInt();
		if(user >= 3)
		{
			System.out.println("1~3 중에 입력해주세요.");
		}
		if(user < 3)
		{
			break;
		}
		}
			System.out.println("컴퓨터 : " + com);		
			if(user==com )
				System.out.println("비겼습니다.");
			else if(user==1&&com==3 )
				System.out.println("사용자가 이겼습니다.");
			else if(user==2&&com==1 )
				System.out.println("사용자가 이겼습니다.");
			else if(user==3&&com==2 )
				System.out.println("사용자가 이겼습니다.");
			
			else if(user!=0)
				System.out.println("사용자가 졌습니다.");
	
			}	
	
	
	

	
	

}
