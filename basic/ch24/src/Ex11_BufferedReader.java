import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// public void write(String s, int off, int len) throws IOException // BufferedWriter의 메소드
// → 문자열 s를 인덱스 off에서부터 len개의 문자까지 저장
public class Ex11_BufferedReader  // 문자 기반 버퍼 입력 스트림
{

	public static void main(String[] args) 
	{
		try (BufferedReader br = new BufferedReader(new FileReader("text2.txt")))
		{
			String str;
			
			while (true)
			{
				str = br.readLine();
				if (str == null)
					break;
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
