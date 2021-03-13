import java.util.*;
public class OverallDistance {
	public void ODistance() {
		Scanner z = new Scanner(System.in);
		Header head = new Header();
		head.DistanceHeader();
		String ans = z.nextLine();
		System.out.println("What's the number to convert?");
		double number = z.nextDouble();	
		Distance DistObject = new Distance();
// Millimeter
		if (ans.equals("mm")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.MilliMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.MilliCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.MilliM(number); } 
			else if (unitConvertTo.equals("km")){DistObject.MilliKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.MilliIN(number); } 
			else if (unitConvertTo.equals("ft")) {DistObject.MilliFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.MilliYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.MilliMI(number); } 
			else if (unitConvertTo.equals("nmi")) {DistObject.MilliNMI(number); }
		}
// Centimeter
		else if (ans.equals("cm")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.CentMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.CentCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.CentM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.CentKM(number);}
			else if (unitConvertTo.equals("ft")) {DistObject.CentIN(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.CentFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.CentYD(number); } 
			else if (unitConvertTo.equals("mi")) {DistObject.CentMI(number);}
			else if (unitConvertTo.equals("nmi")) {DistObject.CentNMI(number); }
		}
// Meter
		else if (ans.equals("m")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.MeterMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.MeterCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.MeterM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.MeterKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.MeterIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.MeterFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.MeterYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.MeterMI(number); }
			else if (unitConvertTo.equals("nmi")) {DistObject.MeterNMI(number); }
		}
// KiloMeter
		else if (ans.equals("km")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.KiloMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.KiloCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.KiloM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.KiloKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.KiloIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.KiloFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.KiloYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.KiloMI(number); }
			else if (unitConvertTo.equals("nmi")) {DistObject.KiloNMI(number); }
		}
// Inch
		else if (ans.equals("in")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.InchMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.InchCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.InchM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.InchKM(number); } 
			else if (unitConvertTo.equals("in")) {DistObject.InchIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.InchFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.InchYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.InchMI(number); } 
			else if (unitConvertTo.equals("nmi")) {DistObject.InchNMI(number); }
		}
// Feet
		else if (ans.equals("ft")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.FeetMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.FeetCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.FeetM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.FeetKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.FeetIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.FeetFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.FeetYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.FeetMI(number); } 
			else if (unitConvertTo.equals("nmi")) {DistObject.FeetNMI(number); }
		}
// Yard
		else if (ans.equals("yd")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.YardMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.YardCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.YardM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.YardKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.YardIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.YardFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.YardYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.YardMI(number); } 
			else if (unitConvertTo.equals("nmi")) {DistObject.YardNMI(number); }
		}
// Mile
		else if (ans.equals("mi")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();
			if (unitConvertTo.equals("mm")) {DistObject.MileMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.MileCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.MileM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.MileKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.MileIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.MileFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.MileYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.MileMI(number); }
			else if (unitConvertTo.equals("nmi")) {DistObject.MileNMI(number); }
		}
// Nautical Mile
		else if (ans.equals("nmi")) {
			System.out.println("Use Abbreviation specify Unit to covert: ") ;
			String unitConvertTo = z.next();			
			if (unitConvertTo.equals("mm")) {DistObject.NauticalMM(number); }
			else if (unitConvertTo.equals("cm")) {DistObject.NauticalCM(number); }
			else if (unitConvertTo.equals("m")) {DistObject.NauticalM(number); }
			else if (unitConvertTo.equals("km")) {DistObject.NauticalKM(number); }
			else if (unitConvertTo.equals("in")) {DistObject.NauticalIN(number); }
			else if (unitConvertTo.equals("ft")) {DistObject.NauticalFT(number); }
			else if (unitConvertTo.equals("yd")) {DistObject.NauticalYD(number); }
			else if (unitConvertTo.equals("mi")) {DistObject.NauticalMI(number); }
			else if (unitConvertTo.equals("nmi")) {DistObject.NauticalNMI(number); }
		}
		z.close(); }
	}
