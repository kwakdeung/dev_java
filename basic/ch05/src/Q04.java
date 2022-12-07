import java.util.Scanner;

public class Q04
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num2 = sc.nextInt();
		
		
		int big = (num1 > num2) ? num1 : num2; // ? - 맞으면?
		System.out.println("큰 수 : " + big);
		

	}

}
