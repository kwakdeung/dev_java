import java.util.Scanner;

public class Q03
{

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num2 = sc.nextInt();
		
		System.out.println("num1 나누기 num2의 몫은 " + (num1 / num2));
		System.out.println("num1 나누기 num2의 나머지는 " + (num1 % num2));
		

	}

}
