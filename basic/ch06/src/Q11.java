//1부터 100까지 정수중에서 짝수의 합을 구하라. 
//단 do~while문을 이용하라

public class Q11 {

	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		
		do
		{
			if( num % 2 == 0 )
			{
				sum = sum + num;	
			}
			num++;
			
		} while(num <= 100);
		
		System.out.println("1~100 정수 중 짝수의 합: " + sum);
	}

}
