import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod // 메서드에 예외 선언
{

	public static void myMethod1()
	{
		myMethod2();
	}
	
	public static void myMethod2()
			throws ArithmeticException, InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();	// 에러 발생 지점
		int num2 = 10 / num1;		// 에러 발생 지점
		System.out.println(num2);
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			myMethod1(); 
		}
		catch (ArithmeticException | InputMismatchException e)
		{
			e.printStackTrace();
		}
		System.out.println("-------");

	}

}
