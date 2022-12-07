import java.util.Arrays;
import java.util.List;

// map - 조건에 따라 "변환"하는 연산
// 중간 연산은 스트림을 구성하는 데이터를 조건에 따라 변환하는 연산을 한다.
public class Ex05_Map
{
	
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple", "banana", "orange");
		
		list.stream()
			.map(s -> s.toUpperCase()) // 대문자로 변환
			.forEach(n -> System.out.println(n + "\t"));
		
		System.out.println();
	}

}
