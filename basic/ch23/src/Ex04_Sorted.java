import java.util.Arrays;
import java.util.List;

// Sort() - 중간 연산에서 "정렬"하는 연산
// 중간 연산 - 스트림을 구성하는 데이터를 "조건"에 따라 정렬하는 연산
public class Ex04_Sorted
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");
		
		// 사전순 정렬
		list.stream()
			.sorted()
			.forEach(n -> System.out.println(n + "\t"));
		
		System.out.println();
		
		// 글자 길이순 정렬
		list.stream()
			.sorted((s1, s2) -> s1.length() - s2.length())
			.forEach(n -> System.out.println(n + "\t"));
		
		System.out.println();

	}

}
