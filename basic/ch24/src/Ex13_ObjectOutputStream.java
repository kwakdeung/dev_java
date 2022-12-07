// 직렬화 (serialization)
// 객체의 상태를 그대로 저장 하거나 다시 복원하는  방식
// ObjectOutputStream - 인스턴스를 출력하는 스트림 : 인스턴스 역직렬화

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex13_ObjectOutputStream 
{
	public static void main(String[] args)
	{
		Ex12_Unit unit1 = new Ex12_Unit("Marine");
		Ex12_Unit unit2 = new Ex12_Unit("Medic");
		
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("Object.bin")))
		{
			oos.writeObject(unit1);
			oos.writeObject(unit2);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
