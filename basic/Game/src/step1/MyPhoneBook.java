package step1;

public class MyPhoneBook
{

	public static void main(String[] args) 
	{
		PhoneInfo pInfo1 = new PhoneInfo("손오공", "010-1234-5678", "test1@test.com");
		PhoneInfo pInfo2 = new PhoneInfo("손오공", "010-1234-5678");
		
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();

	}

}
