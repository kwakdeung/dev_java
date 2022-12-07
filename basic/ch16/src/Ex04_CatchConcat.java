import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex04_CatchConcat // 예외처리 합치기
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
		catch(ArithmeticException | InputMismatchException e) // 여기 구별만 잘하면 됨
		{
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("예외 발생");
		}
		System.out.println("Good bye~~!");
	}

}
