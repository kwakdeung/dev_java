import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

public class Ex05_FileCopy1 // 바이트 단위 입력 및 출력 스트림 이용 파일 복사
{
	public static void main(String[] args)
	{
		String src = "./src/Ex04_FileRead.java";
		String dst = "FileRead1.txt";
		
		try (InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst))
		{
			Instant start = Instant.now();
			
			int data;
			while(true)
			{
				data = in.read();
				if(data == -1)
					break;
				out.write(data);
			}
			Instant end = Instant.now();
			System.out.println("복사에 걸린 시간: " +
				Duration.between(start, end).toMillis());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
