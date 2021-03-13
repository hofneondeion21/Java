
public class Header {
	public void OverallHeader() {
		System.out.println("Please Choose:\n"
				+ "(1)\tDistance\n"
				+ "(2)\tData\n"
				+ "(3)\tTemperature\n"); }
	public void DistanceHeader() {
		System.out.print("Choices:\n"
				+ "Millimeter (mm) \n"
				+ "Centimeter (cm) \n"
				+ "Meter\t (m) \n"
				+ "Kilometer (km) \n"
				+ "Inches\t (in) \n"
				+ "Feet\t (ft) \n"
				+ "Yards\t (yd) \n"
				+ "Miles\t (mi) \n"
				+ "Nautical Miles (nmi) \n");
		System.out.println("Use Abbreviation to select Unit\n");
	}
	public void DataHeader() {
		System.out.print("Choices:\n"
				+ "Bits (b)\t || Bytes (B)\n"
				+ "Kilobits (Kb)\t || Kilobytes (KB)\n"
				+ "Megabits (Mb)\t || Megabytes (MB)\n"
				+ "Gigabits (Gb)\t || GigaBytes (GB)\n"
				+ "Megabits (Mb)\t || Megabytes (MB)\n"
				+ "Terabits (Tb)\t || Terabytes (TB)\n"
				+ "Petabits (Pb)\t || PetaBytes (PB)\n"
				+ "Exabits (Eb)\t || Extabytes (EB)\n"
				+ "Zetagbits (Zb)\t || Zettabytes (ZB)\n"
				+ "Yottabits (Yb)\t || Yottabytes (YB)\n") ; }
	public void TempHeader() {
		System.out.println("Choices: \n"
				+ "Celcius [C]\n"
				+ "Fahrenheit [F]\n"
				+ "Kelvin [K]\n"
				+ "Rankine [R]\n"
				+ "Reaumere [Re]\n") ; }
	}
