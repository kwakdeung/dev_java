import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03_CollectionVsStream 
{

	public static void main(String[] args)
	{
		int[] arr = {1, 5, 3, 2, 4};
		List<Integer> list = new ArrayList<>();
		
		// 컬렉션 프레임워크를 이용한 방식
		for(int i : arr)
		{
			if (i%2 == 1)
			{
				list.add(i);
			}
		}
		Collections.sort(list);
		
		for (int i : list)
		{
			System.out.println(i + "\t");
		}
		
		System.out.println();
		
		// Stream을 이용한 방식(Pipeline)
		Arrays.stream(arr)	// 스트림 생성
			.filter(n -> n%2 == 1)	// + 중간 연산
			.sorted() // + 중간 연산
			.forEach(n -> System.out.println( n + "\t")); // + 최종 연산
		
		System.out.println();

	}

}
