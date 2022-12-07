// ObjectInputStream - 인스턴스를 입력하는 스트림 : 인스턴스 직렬화
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex14_ObjectInputStream 
{
	public static void main(String[] args)
	{
		try (ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("Object.bin")))
		{
			Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();
			System.out.println(unit1.getName());
			
			Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
			System.out.println(unit2.getName());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
