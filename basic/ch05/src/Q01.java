import java.util.Scanner;

public class Q01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num2 = sc.nextInt();

		
		System.out.println("num + num2 = " + (num1 + num2));
		System.out.println("num - num2 = " + (num1 - num2));
		System.out.println("num * num2 = " + (num1 * num2));
		System.out.println("num / num2 = " + (num1 / num2));
		System.out.println("num % num2 = " + (num1 % num2)); 

	}

}
