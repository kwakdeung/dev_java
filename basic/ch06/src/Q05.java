// 사용자로부터 계속해서 정수를 입력받는다.
// 단 0을 입력받게되면 기존에 입력받은 모든 정수를 더한 후 결과를 출력하시오.
import java.util.Scanner;

public class Q05 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		{
			int sum = 0;
			while(true)
			{
			System.out.println("정수를 입력하시오. (단, 0입력시 결과값 도출) ");
			int num = sc.nextInt();
			
			if(num == 0)
			{
				break;
			}
			sum = sum + num;
			}
			System.out.printf("결과 값 : %s" , sum);	
		}   
	}
}	