import java.util.Scanner;

public class Ex05_Exception // 모든 예외 (최상위 클래스를 이용해서) 한 번에 처리하기
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int num1 = sc.nextInt();
			int num2 = 10 / num1;
			System.out.println(num2);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("예외 발생");
		}
		System.out.println("Good bye~~!!");

	}

}
