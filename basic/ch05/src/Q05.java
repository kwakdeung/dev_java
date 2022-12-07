import java.util.Scanner;

public class Q05
{

	public static void main(String[] args)
	{
     Scanner sc = new Scanner(System.in);
		
     System.out.println("숫자를 입력하고 엔터를 입력하세요.");
	 int num1 = sc.nextInt();
	 System.out.println("숫자를 입력하고 엔터를 입력하세요.");
	 int num2 = sc.nextInt();
	 int result = num1 * num2;
	 int result2 = (result > 0) ? result : -result; 
	 System.out.printf(" 두 수의 곱의 절대값은 %d입니다.", result2);
	 }
	


}
