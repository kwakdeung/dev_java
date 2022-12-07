import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03_IteratorUse	// 저장된 인스턴스의 순차적 접근방법
{


	public static void main(String[] args) 
	{
		List<String> list = new LinkedList<>(); // String - orange, ..., 반복자 획득
		
		// 객체 저장 : 순서 있음. 중복 허용.
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		// 향상된 for문으로 객체 참조
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
		
		// 반복자 획득
		Iterator<String> itr = list.iterator();
		
		// 반복자를 이용한 순차적 참조
		String str;
		// 반복자를 이용한 참조 과정 중 인스턴스의 삭제
		while(itr.hasNext())
		{
			str = itr.next();
			System.out.println(str + '\t');
			
			if(str.equals("orange"))
				itr.remove();	// 위에서 next 메소드가 반환한 인스턴스 삭제
		}
		System.out.println();
		
		// 반복자 다시 획득
		itr = list.iterator();
		
		// 삭제 후 결과 확인
		while(itr.hasNext())
			System.out.println(itr.next() + '\t');
		
		System.out.println();
	}

}
