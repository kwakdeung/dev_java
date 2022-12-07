
public class IsNumber2 
{

	public static void main(String[] args) 
	{
		String value = "12o34";
		String ch = "";
		boolean isNumber = true;
		
		for (int i=0; i<value.length(); i++)
		{
			ch = value.substring(i, i+1);
			
			int num1 = ch.compareTo("0");
			int num2 = ch.compareTo("9");
			
			
			if((num1 >= '0' && num2 <= '9'))
			{} else {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber)
		{
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

	}

}