import java.util.Scanner;
public class Ex07_CatchThrowable // 던져진 예외를 처리하려면 catch문 에서 Throwable 클래스를 이용해야 함.
{
	public static void myMethod1()
	{
		myMethod2();
	}
	
	public static void myMethod2()
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
			myMethod1();	// 여기로 myMethod1으로부터 예외가 넘어옴
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			// System.out.println(e.getMessage());
		}

	}

}
