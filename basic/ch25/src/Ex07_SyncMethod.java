// 동기화(Synchronization) 메소드 - 같이 하는 것
// 스레드에서 동기화를 사용하여 이런 문제를 해결한다.
// 동기화 시키는 방법 2가지
// 1. 메서드에 synchronized 키워드를 지정 
// 2. 코드의 일부에 동기화 블럭을 지정한다.
public class Ex07_SyncMethod
{
	public static int money = 0;
	
	public static void deposit()
	{
		money++;
	}
	public static void withdraw()
	{
		money--;
	}

	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () ->
		{
			for (int i = 0; i<10000; i++)
				deposit();
		};
		Runnable task2 = () ->
		{
			for (int i = 0; i<10000; i++)
				withdraw();
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();	// t1이 참조하는 스레드의 종료를 기다림
		t2.join();	// t2이 참조하는 스레드의 종료를 기다림
		
		// 스레드가 종료되면 출력을 진행함. 위 join의 영향
		System.out.println(money);
	}

}
