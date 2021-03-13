
public class Temperature {

// Celcius [C]
	public void CelstoCels (double givenTemp) {
		double Celsius = 0;
		Celsius = Celsius+givenTemp;
		System.out.println(Celsius+"°C"); //return Celsius; 
		}
	public void CelstoFahr (double givenTemp) {
		double Fahrenheit = 0;
		Fahrenheit = (givenTemp*9/5) + 32; 
		System.out.println(Fahrenheit+"°F"); //return Fahrenheit; 
		}
	public void CelstoKelv (double givenTemp) {
		double Kelvin = 0;
		Kelvin = 274.15+givenTemp;
		System.out.println(Kelvin+"°K"); //return givenTemp; 
		}
	public void CelstoRank (double givenTemp) {
		double Rankine = 0;
		Rankine = (givenTemp+274.15)*9/5; 
		System.out.println(Rankine+"[°R]"); //return Rankine; 
		}
	public void CelstoReau (double givenTemp) {
		double Reaumure = 0.8;
		givenTemp = Reaumure*givenTemp; 
		System.out.println(Reaumure+"[°Re]");//return givenTemp; 
		}
// Fahrenheit [F]
	public void FahrtoCels (double givenTemp) {
		double Celsius = 0; 
		Celsius = (givenTemp-32)*5/9;
		System.out.println(Celsius+"°C"); // return Celsius; 
		}
	public void FahrtoFahr (double givenTemp) {
		double Fahrenheit = 0;
		Fahrenheit = givenTemp;
		System.out.println(Fahrenheit+"°F"); // return givenTemp; 
		}
	public void FahrtoKelv (double givenTemp) {
		double Kelvin = 0;
		Kelvin = ((givenTemp +459.67)/ (9/5)); 
		System.out.println(Kelvin+"°K"); // return givenTemp; 
		}
	public void FahrtoRank (double givenTemp) {
		double Rankine = 0;
		Rankine = 459.67+givenTemp;
		System.out.println(Rankine+"[°R]"); // return givenTemp; 
		}
	public void FahrtoReau (double givenTemp) {
		double Reaumure = 0; 
		Reaumure = (givenTemp-32)/(9/4); 
		System.out.println(Reaumure+"[°Re]"); // return givenTemp; 
		}
// Kelvin [K]
	public void KelvtoCels (double givenTemp) {
		double Celsius = 0;
		Celsius = (givenTemp-274.15); 
		System.out.println(Celsius+"°C"); // return Celsius; 
		}
	public void KelvtoFahr (double givenTemp) {
		double Fahrenheit = 0;
		Fahrenheit = ((givenTemp-274.15)*9/5)+32;
		System.out.println(Fahrenheit+"°F"); // return Fahrenheit; 
		}
	public void KelvtoKelv (double givenTemp) {
		double Kelvin = 0;
		Kelvin = Kelvin+givenTemp;
		System.out.println(Kelvin+"°F"); // return Kelvin; 
		}
	public void KelvtoRank (double givenTemp) {
		double Rankine = 0;
		Rankine = givenTemp*5/4; 
		System.out.println(Rankine+"[°R]"); // return givenTemp; 
		}
	public void KelvtoReau (double givenTemp) {
		double Reaumure = 0; 
		Reaumure = (givenTemp - 274.15)*(4/5);
		System.out.println(Reaumure+"[°Re]"); // return givenTemp; 
		}
// Rankine [R]
	public void RanktoCels (double givenTemp) {
		double Celsius = 0;
		Celsius = (givenTemp - 32 - 349.67) /(9/5);
		System.out.println(Celsius+"°C"); // return Celsius; 
		}
	public void RanktoFahr (double givenTemp) {
		double Fahrenheit = 0;
		Fahrenheit = givenTemp - 459.67;
		System.out.println(Fahrenheit+"°F"); // return Fahrenheit; 
		}
	public void RanktoKelv (double givenTemp) {
		double Kelvin = 0;
		Kelvin = (givenTemp/ (9/5));
		System.out.println(Kelvin+"°K"); // return Kelvin; 
		}
	public void RanktoRank (double givenTemp) {
		double Rankine = 0;
		Rankine = givenTemp+Rankine;
		System.out.println(Rankine+"[°R]"); //return Rankine; 
		}
	public void RanktoReau (double givenTemp) {
		double Reaumure = 0;
		Reaumure = (givenTemp - 32 - 459.67)/ (9/4);
		System.out.println(Reaumure+"[°Re]"); // return Reaumure;
		}
// Reaumure [Re]
	public void ReautoCels (double givenTemp) {
		double Celsius = 0;
		Celsius = givenTemp*5/4;
		System.out.println(Celsius+"°C"); // return Celsius; 
		}
	public void ReautoFahr (double givenTemp) {
		double Fahrenheit = 0;
		Fahrenheit = (givenTemp*9/4)+32; 
		System.out.println(Fahrenheit+"°F"); // return Fahrenheit; 
		}
	public void ReautoKelv (double givenTemp) {
		double Kelvin = 0;
		Kelvin = (givenTemp*5/4)+274.15; 
		System.out.println(Kelvin+"°K"); // return Kelvin; 
		}
	public void ReautoRank (double givenTemp) {
		double Rankine = 0; 
		Rankine = (givenTemp*9/4)+32+459.67; 
		System.out.println(Rankine+"[°R]"); // return Rankine; 
		}
	public void ReautoReau (double givenTemp) {
		double Reaumure = 0;
		Reaumure = Reaumure+givenTemp;
		System.out.println(Reaumure+"[°Re]"); //return Reaumure; 
		}
	
}
