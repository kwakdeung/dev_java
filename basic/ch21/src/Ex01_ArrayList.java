import java.util.ArrayList;	// ArrayList 불러오기
import java.util.List;

public class Ex01_ArrayList // 배열 기반 자료구조, 배열을 이용하여 인스턴스 저장
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>(); // String - orange, ...
		
		// 객체 저장 : 순서 있음. 중복 허용.
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		// 객체 참조
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
		
		// 첫 번째 객체 삭제(0)
		list.remove(0);
		
		// 삭제 후 객체 참조
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
	}

}
