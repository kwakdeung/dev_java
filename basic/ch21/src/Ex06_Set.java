import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06_Set // 중복 저장X, 저장순서 유지 안됨
{

	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<>();
		set.add("orange");
		set.add("apple");
		set.add("banana");
		set.add("orange");
		
		System.out.println("객체 수: " + set.size());
		
		// 반복자를 이용한 전체 출력 - 방법 1
		for(Iterator<String> itr = set.iterator(); itr.hasNext(); )
			System.out.println(itr.next() + '\t');
		System.out.println();
		
		// 향상된 for 문을 이용한 전체 출력 - 방법 2
		for(String s : set)
			System.out.println(s + '\t');
		System.out.println();
	}
}
