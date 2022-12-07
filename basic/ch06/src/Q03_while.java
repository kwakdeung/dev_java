import java.util.Scanner;

public class Q03_while
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한 개를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		
		int result = 1;
		while (num1 > 0) //2. while문 사용
		{
			result = result * num1;
			if(num1 > 1)
				{
				System.out.println(num1 + " * ");
				}
			else
			{
				System.out.print(num1 + " = ");
			}
			num1--;
		}
			
		System.out.println("팩토리얼 함수의 값은 :" + result);
	}

}
