import java.util.Scanner;

public class Q00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 < num2)
		{
			for(int i = num1; i < num2; ++i)
			{
				System.out.printf("%d + ", i);
				sum = sum + i;
			}			
			sum = sum + num2;
			System.out.printf("%d = %d", num2, sum);
		}
		else
		{
			for(int i = num1; i > num2; --i)
			{
				System.out.printf("%d + ", i);
				sum = sum + i;
			}			
			sum = sum + num2;
			System.out.printf("%d = %d", num2, sum);
		}		
	}

}
