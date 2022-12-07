// 스레드 - 여러 개의 작업을 동시에 수행
public class Ex01_CurrentThread 
{
	public static void main(String[] args)
	{
		String name = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : " + name);
	}
}