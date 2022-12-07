import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//X 바이트 스트림 - 1바이트씩 제대로 글자 읽기X
//O 문자 스트림 - 2바이트씩 읽어 하나의 글자를 제대로 읽음
public class Ex08_TextWrite	
{
	public static void main(String[] args)
	{
		try (Writer out = new FileWriter("text.txt"))
		{
			for (int ch = (int)'A'; ch < (int)('Z'+1); ch++)
				out.write(ch);
			out.write(13);
			out.write(10);
			
			for(int ch = (int) 'A'+32; ch < (int)('Z'+1+32); ch++)
				out.write(ch);
			
			out.write(13);
			out.write(10);
			
			out.write("동해물과 백두산이 마르고 닳도록");
			out.write("\r\n");
			out.write("하느님이 보우하사 우리나라 만세");
			out.write("\r\n");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
