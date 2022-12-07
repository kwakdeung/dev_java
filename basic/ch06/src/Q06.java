import java.util.Scanner;

// 사용자로부터 다음 순서대로 정수를 입력받은 후 평균을 구하여 출력하는 프로그램을 작성하시오.
// 1.몇개의 정수를 입력할 지 사용자로부터 입력받는다.
// 2.입력받은 숫자만큼 정수를 입력받는다.(1번에서 3이라고 입력했다면 3개의 정수를 입력받아야 한다)
// 3.입력받은 숫자들의 평균값을 구하여 출력한다. 평균값은 소수점 이하까지 계산해야 한다.


public class Q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 정수를 입력할 지 입력하세요.");
		int num1 = sc.nextInt();
		double avg = 0;
		
		for (int i = num1 ; i > 0; i--)
		{
		System.out.println("입력 받은 정수만큼 입력하고 엔터를 입력하세요.");
		double num2 = sc.nextDouble();
		avg = avg + num2;
		}
		double result = avg / num1;		
		
		System.out.printf("평균 값 : %f", result);		
	}
}
