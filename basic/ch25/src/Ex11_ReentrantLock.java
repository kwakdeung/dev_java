import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// synchronized(동기화)를 대신하는 ReentrantLock
// ReentrantLock 클래스를 사용하면 시작점과 끝점을 명백히 명시
// 선생님 - 사실 별 차이 없음, 별로 안쓰임
// lock, unlock - 명시적으로 밝힌다고 함.
class BankAccount
{
	ReentrantLock myLock = new ReentrantLock();
	int money = 0;
	
	public void deposit()
	{
		myLock.lock();
		money++;
		myLock.unlock();
	}
	
	public void withdraw()
	{
		myLock.lock();
		money--;
		myLock.unlock();
	}
	
	public int balance()
	{
		return money;
	}
	
	
}
public class Ex11_ReentrantLock 
{
	public static BankAccount account = new BankAccount();
	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () -> {
			for (int i = 0; i < 10000; i++)
				account.deposit();
		};
		Runnable task2 = () -> {
			for (int i = 0; i < 10000; i++)
				account.withdraw();
		};
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(task1);
		pool.submit(task2);
		
		pool.shutdown();
		pool.awaitTermination(100, TimeUnit.SECONDS);
		
		System.out.println(account.balance());

	}

}
