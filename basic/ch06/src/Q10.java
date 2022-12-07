// 사용자로부터 5개의 정수를 입력받아서 합을 구하여 출력한다.
// 만약 입력받는 숫자가 1미만의 숫자라면 재입력을 요구해야 한다. 그래서 1이상의 정수 5개를 입력받아야 프로그램이 완성된다.
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("5개의 정수를 입력하세요.");
		for(int i  = 0; i<5; i++)
		{
			int num  = sc.nextInt();
			if(num < 1)
			{
				System.out.println("1미만의 숫자는 입력하실 수 없습니다. 다시 입력하세요.\n");
				num = sc.nextInt();
			}
			if(num > 0)
			{
				sum = sum + num;
			}
		}		
		System.out.printf("입력한 정수의 합 : %d", sum);
	}
}
