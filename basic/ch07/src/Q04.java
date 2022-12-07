
public class Q04
{

	public static void main(String[] args)
	{
		
		//섭씨(Celsius) = (화씨 - 32) / 1.8
		//화씨Fahrenheit) = 1.8 * 섭씨 + 32
		double nFahrenheit = getFahrenheit(90); //float
		System.out.println(nFahrenheit);
		//System.out.prinf("섭씨 90.0도는 화씨 %.2f 도입니다.\n", result);
		double nCelsius = getCelsius(80);
		System.out.println(nCelsius);
		//System.out.prinf("화씨 80.0도는 섭씨 %.2f 도입니다.\n", result);
	}	
	
	public static double getFahrenheit(double fCelsiu)
	{
		return 1.8f * fCelsiu + 32;
	}
		
	public static double getCelsius(double fFahrenheit)
	{
		return (fFahrenheit - 32) / 1.8f;
	}
}