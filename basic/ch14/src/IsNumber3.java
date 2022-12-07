
public class IsNumber3 {

	public static void main(String[] args) 
	{
		String value = "12o34";
		boolean isNumber = true;
		
		try	{
			int num = Integer.parseInt(value);
		} catch (Exception e) {
			isNumber = false;
		}		
		if (isNumber)
		{
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

	}


}
