import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex04_FileRead // 파일 대상 입력 스트림 생성
{

	public static void main(String[] args)
	{
		try (InputStream in = new FileInputStream("data.txt"))
		{
			int dat = in.read();		// ASCII 코드
			System.out.println(dat);	// 65
			System.out.printf("%c \n", dat);	// char - A
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
