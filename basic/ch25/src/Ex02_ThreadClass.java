// 스레드의 생성과 실행
// Thread 클래스를 상속 받아 run() 메서드를 오버라이딩

class MyThread2 extends Thread // Thread 클래스를 상속
{
	public void run() //run() 메서드를 오버라이딩
	{
		int sum = 0;
		for (int i=0; i<10; i++)
			sum = sum + i;
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + sum);
	}
}

public class Ex02_ThreadClass
{

	public static void main(String[] args) 
	{
		MyThread2 t = new MyThread2();
		t.start(); // 스레드 실행
		System.out.println("main: " + Thread.currentThread().getName());

	}

}
