// Comparator<T> 인터페이스 기반으로 TreeSet<E>의 정렬 기준 제시하기
// Comparator 인터페이스가 없었다면 클래스를 계속 건드려서 사용해야하니까 불편
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyStringComparator implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		// 길이가 동일한 데이터는 추가되지 않는다.
		return s1.length() - s2.length();		
	}
}
public class Ex10_Comparator
{

	public static void main(String[] args)
	{
		// Set<String> tree = new TreeSet<>(); 
		Set<String> tree = new TreeSet<>(new MyStringComparator()); // 정렬 기준 제시		
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("전우치");
		tree.add("멀린");
		tree.add("해리포터");
		
		for(String s : tree)
			System.out.print(s.toString() + '\t');
		
		System.out.println();
	}

}
