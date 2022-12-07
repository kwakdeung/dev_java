import java.util.stream.IntStream;

// sort, map 말고도 최종 연산자

public class Ex06_PreTerminal 
{

	public static void main(String[] args) 
	{
		// 합
		int sum = IntStream.of(1, 3, 5, 7, 9)
							.sum();	// 최종 연산
		System.out.println("sum = " + sum);
		
		// 개수
		long cnt = IntStream.of(1, 3, 5, 7, 9)
							.count(); // 최종 연산
		System.out.println("count = " + cnt);
		
		// 평균
		IntStream.of(1, 3, 5, 7, 9)
				.average()	// 최종 연산
				.ifPresent(avg -> System.out.println("avg = " + avg));
		
		// 최소
		IntStream.of(1, 3, 5, 7, 9)
				.min()	// 최종 연산
				.ifPresent(min -> System.out.println("min = " + min));
		
		// 최대
		IntStream.of(1, 3, 5, 7, 9)
				.max()	// 최종 연산
				.ifPresent(max -> System.out.println("max = " + max));

	}

}
