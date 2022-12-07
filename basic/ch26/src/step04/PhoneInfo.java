package step04; // 04.연락처 출력(조회)하기

public class PhoneInfo 
{
	String name;
	String phoneNumber;
	String email;
	
	public PhoneInfo(String name, String phoneNumber) 
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneInfo(String name, String phoneNumber, String email) 
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getName()
	{
		return name;
	}
	
	public void showPhoneInfo() 
	{
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : " + phoneNumber);
		if (email != null && !email.equals(""))
			System.out.println("Email : " + email);
		System.out.println("-------------------------------------");
	}
	

	
}
