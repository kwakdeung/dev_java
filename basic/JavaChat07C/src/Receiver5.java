import java.io.*;
import java.net.*;
//서버로 메시지를 전송하는 클래스
public class Receiver5 extends Thread
{
	Socket socket;
	BufferedReader in = null;
	
	
	// Socket을 매개변수로 받는 생성자.
	public Receiver5(Socket socket)
	{
		this.socket = socket;
		
		try {
			in = new BufferedReader(new InputStreamReader(
										this.socket.getInputStream() ));
		} catch(Exception e) {
			System.out.println("예외:"+e);
		}
	}
	
	//run()메소드 재정의
	@Override
	public void run() {
		while (in!=null) {
			try {
			// 입력은 main 쓰레드에서 받기 때문에 다음 코드는 작동하지 않는다.
				System.out.println("Thread Receive : " + in.readLine());
			} catch (java.net.SocketException ne) {
				// 여기서 while문을 멈춰 주어야한다.
				 break;				
			} catch (Exception e) {
				System.out.println("예외:"+e);
			}
		}
		try {
			in.close();
		} catch (Exception e) {
			System.out.println("예외3:"+e);			
		}
	}
	

}
