// 사용자로부터 2개의 정수를 입력받는다. 
// 가령 2와 6을 입력받았다면 2+3+4+5+6을 구하는 프로그램 을 작성하라.
// 단 6과 2를 입력받는다면 6+5+4+3+2를 구해야 한다.

import java.util.Scanner;

public class Q12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 < num2)
		{
			for(int i = num1; i < num2; ++i)
			{
				System.out.printf("%d + ", i);
				sum = sum + i;
			}			
			sum = sum + num2;
			System.out.printf("%d = %d", num2, sum);
		}
		else
		{
			for(int i = num1; i > num2; --i)
			{
				System.out.printf("%d + ", i);
				sum = sum + i;
			}			
			sum = sum + num2;
			System.out.printf("%d = %d", num2, sum);
		}		
	}	
}		
	
			