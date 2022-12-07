// 스트림(Stream) - 데이터의 흐름을 반복적으로 처리하는 기능
// 1. 기존자료 변경X 2. 중간연산, 최종연산 3. 재사용X

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_Stream1 
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		
		// 스트림 생성
		IntStream stm1 = Arrays.stream(arr);
		
		// 중간 연산
		IntStream stm2 = stm1.filter(n -> n%2 == 1);
		
		
		int sum = stm2.sum(); // 최종 연산
		
		System.out.println(sum);
	}
}
