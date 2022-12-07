import java.util.Scanner;

public class Q03_for
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한 개를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		
		int result = 1;
		for (int i = num1; i > 0; i--) //1. for문 사용
		{
			result = result * i;
			if(i > 1)
			{	
				System.out.print(i + " * ");
			}
			else
			{
				System.out.print(i + " = ");
			}
		}
		System.out.println("팩토리얼 함수의 값은 :" + result);
	}
}
