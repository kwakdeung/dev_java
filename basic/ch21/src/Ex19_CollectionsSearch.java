// 이진 탐색 기능을 이용하여 리스트 안에 데이터가 있는지 확인할 수 있다.
// 다만 이진 탐색을 이용하기 위해서는 데이터가 먼저 정렬이 되어 있어야 한다.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex19_CollectionsSearch // 찾기
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		
		// 정렬
		Collections.sort(list);
		
		// 탐색
		int idx1 = Collections.binarySearch(list, "홍길동");
		System.out.println(idx1);
		
		int idx2 = Collections.binarySearch(list, "멀린");
		System.out.println(idx2);
	}
}
