// 파이프라인(Pipeline) - 스트림 연산을 연결해 구성
// 파이프라인(Pipeline) = 스트림 생성 + 중간 연산 + 최종 연산
import java.util.Arrays;
public class Ex02_Pipeline
{

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};	// 배열
		
		// Pipeline 구성
		int sum = Arrays.stream(arr)	// 스트림 생성
				.filter(n -> n%2 == 1)	// + 중간 연산
				.sum();					// + 최종 연산
		System.out.println(sum);
	}

}
