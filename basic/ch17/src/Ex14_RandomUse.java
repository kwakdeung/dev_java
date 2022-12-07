import java.util.Random;

public class Ex14_RandomUse // 난수 생성, 임의의 랜덤 값을 만들어 낼 때 사용하는 클래스
{

	public static void main(String[] args) 
	{
		// 매번 다른 수가 나옴
		Random rand1 = new Random();
		
		for(int i = 0; i < 10; i++)
			System.out.print(rand1.nextInt(10) + " ");
		System.out.println();
		
		// 매번 같은 순으로 값이 나옴
		Random rand2 = new Random(12); // (12)숫자를 작성한 경우 랜덤 값이 매번 같은 숫자로 나옴.
		
		for(int i = 0; i < 10; i++)
			System.out.print(rand2.nextInt(10) + " ");
		System.out.println();

	}

}
