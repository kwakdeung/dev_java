import java.util.Scanner;

// 사용자로부터 정수 하나를 입력받은 후 
// 그 수에 해당하는 구구단을 역순으로 출력하시오.		
public class Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		for (int i = 9; i >= 1; i--) 
		{
			System.out.printf("%d * %d= %d\n", num , i , num * i);
		}
		

	}

}
