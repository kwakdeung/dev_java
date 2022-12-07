// try{} catch{} finally{} 쓴 이유는? close를 안해줘도 되서
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_FileWrite3 // 입출력 스트림 예외 처리 개선
{

	public static void main(String[] args) 
	{
		try (OutputStream out = new FileOutputStream("data.txt"))
		{
			out.write(65);	// ASCII 코드 65 = 'A'
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
