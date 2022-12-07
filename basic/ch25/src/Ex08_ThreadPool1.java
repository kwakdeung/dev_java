import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// newSingleThreadExecutor - 풀 안에 하나의 스레드만 생성하고 유지한다. 굳이 만들 필요X, 다른 것은 막으려는 용도.

public class Ex08_ThreadPool1
{
	public static int money = 0;

	public static void main(String[] args) 
	{
		Runnable task1 = () -> {	// 스레드에게 시킬 작업
			for (int i = 0; i<10000; i++)
				money++;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + money);
		};
		
		Runnable task2 = () -> {	//스레드에게 시킬 작업
			for (int i = 0; i<10000; i++)
				money++;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + money);
		};
		
		ExecutorService pool = Executors.newSingleThreadExecutor(); // 풀 안에 하나의 스레드만 생성하고 유지한다.
		pool.submit(task1);	// 스레드 풀에 작업을 전달
		pool.submit(task2);	// 스레드 풀에 작업을 전달
		
		System.out.println("End " + Thread.currentThread().getName());
		
		pool.shutdown();	// 스레드 풀과 그 안에 있는 스레드의 소멸

	}

}
