
import java.util.Scanner;

public class MyCalculator
{
	public static void printMenu()
	{
		System.out.println("=============================");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("5.종료");
		System.out.println("=============================");
	}

	public static void addNum(int n1, int n2)
	{
		int result = n1 + n2;
		System.out.printf( "%d + %d = %d \n", n1,n2, result);
	}
	
	public static void minusNum(int n1, int n2)
	{
		int result = n1- n2;
		System.out.printf( "%d - %d = %d \n", n1,n2, result);
	}
	
	public static void multiplyNum(int n1, int n2)
	{
		int result = n1 * n2;
		System.out.printf( "%d * %d = %d \n", n1,n2, result);
	}
	
	public static void divideNum(int n1, int n2)
	{
		if (n2 == 0)
		{
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		int result = n1 / n2;
		System.out.printf( "%d / %d = %d \n", n1,n2, result);
		
		result = n1 % n2;
		System.out.printf( "%d %% %d = %d \n", n1,n2, result); //%을 %%로 써야 함. 그래야 에러 안걸리고 인식이 됨
		
	}
	
	public static boolean checkNum(char ch)
	{
		if (ch >= '0' && ch <= '9')
		{
			return true;
		}	
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			// 메뉴 출력
			printMenu();

			// 사용자 입력받가

			int selectMenu = sc.nextInt();
			
			// 종료 처리
			if (selectMenu == 5)
				break;
			
			if (selectMenu > 5)
				System.out.println("메뉴를 잘 못 고르셨습니다.");
				continue;
		

			System.out.println("첫 번째 숫자를 입력하고 엔터를 치세요.");
			int num1 = sc.nextInt();
			System.out.println("두 번째 숫자를 입력하고 엔터를 치세요.");
			int num2 = sc.nextInt();
			// 사칙연산 수행
		
			if (selectMenu == 1)
				
				addNum(num1,num2);
			else if (selectMenu == 2)
				minusNum(num1,num2);
			else if (selectMenu == 3)
				multiplyNum(num1,num2);
			else if (selectMenu == 4)
				divideNum(num1,num2);			
		}
	}
}
//-------------------------------------

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			showMenu(); //메뉴 출력
			
			//int num = sc.nextInt();
			char myChar = sc.next(),charAt(0);
			if ( !checkNum(myChar)) {
				System.out.println("메뉴를 잘못 선택했습니다.1");
				continue;
			}
			//int num = (int)myChar;
			//System.out.println(num);
			//int num =Character.getNumericValue(myChar);
			int num = myChar - '0';
			System.out.println(num);
			if (num == 0)
			{
				break;
			} 