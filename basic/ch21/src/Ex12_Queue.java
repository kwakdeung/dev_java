// 선입선출, 사실 보통 굳이 Queue, Deque를 사용하지 않고 List를 사용해도됨.
import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Queue // FIFO 먼저 저장된 데이터가 먼저 빠져나간다.
{
	public static void main(String[] args) 
	{
		Queue<String> que = new LinkedList<>();
		
		// 데이터 저장
		que.offer("A");
		que.offer("B");
		que.offer("C");
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		
		// 첫 번째 객체 꺼내기
		System.out.println(que.poll());
		System.out.println(que.size());
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		// 두 번째 객체 꺼내기
		System.out.println(que.poll());
		System.out.println(que.size());
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		// 마지막 객체 꺼내기
		System.out.println(que.poll());
		System.out.println(que.size());
	}
}
