import java.util.*;

public class OverallTemperature {
	public void OTemperature() {
		Scanner z = new Scanner (System.in);
		Header head = new Header(); 
		head.TempHeader(); 
		Temperature TempObject = new Temperature(); 
		String text = "Enter a number: ";
		System.out.println(text);
		double num = z.nextDouble();
		System.out.println("Enter Abbreviation units");
		String AnteAns = z.next(); 
		String text1 = "Use Abbreviation to convert to";
		String PostAns = "";
	if (AnteAns.equals("C") || AnteAns.equals("c")) {
		System.out.println(text1); PostAns = z.next();
		if (PostAns.equals("C") || PostAns.equals("c")) { 
			TempObject.CelstoCels(num); }
		else if (PostAns.equals("F") || PostAns.equals("f")) {
			TempObject.CelstoFahr(num); }
		else if (PostAns.equals("K") || PostAns.equals("k")) {
			TempObject.CelstoKelv(num); }
		else if (PostAns.equals("R") || PostAns.equals("r")) {
			TempObject.CelstoRank(num); }
		else if (PostAns.equals("Re") || PostAns.equals("re")) {
			TempObject.CelstoReau(num); }
	}
	else if (AnteAns.equals("F") || AnteAns.equals("f")) {
		System.out.println(text1); PostAns = z.next();
		if (PostAns.equals("C") || PostAns.equals("c")) { 
			TempObject.FahrtoCels(num); }
		else if (PostAns.equals("F") || PostAns.equals("f")) {
			TempObject.FahrtoFahr(num); }
		else if (PostAns.equals("K") || PostAns.equals("k")) {
			TempObject.FahrtoKelv(num); }
		else if (PostAns.equals("R") || PostAns.equals("r")) {
			TempObject.FahrtoRank(num); }
		else if (PostAns.equals("Re") || PostAns.equals("re")) {
			TempObject.FahrtoReau(num); }	
	}
	else if (AnteAns.equals("K") || AnteAns.equals("k")) {
		System.out.println(text1); PostAns = z.next(); 
		if (PostAns.equals("C") || PostAns.equals("c")) { 
			TempObject.KelvtoCels(num); }
		else if (PostAns.equals("F") || PostAns.equals("f")) {
			TempObject.KelvtoFahr(num); }
		else if (PostAns.equals("K") || PostAns.equals("k")) {
			TempObject.KelvtoKelv(num); }
		else if (PostAns.equals("R") || PostAns.equals("r")) {
			TempObject.KelvtoRank(num); }
		else if (PostAns.equals("Re") || PostAns.equals("re")) {
			TempObject.KelvtoReau(num); }
	}
	else if (AnteAns.equals("R") || AnteAns.equals("r")) {
		System.out.println(text1); PostAns = z.next(); 
		if (PostAns.equals("C") || PostAns.equals("c")) { 
			TempObject.RanktoCels(num); }
		else if (PostAns.equals("F") || PostAns.equals("f")) {
			TempObject.RanktoFahr(num); }
		else if (PostAns.equals("K") || PostAns.equals("k")) {
			TempObject.RanktoKelv(num); }
		else if (PostAns.equals("R") || PostAns.equals("r")) {
			TempObject.RanktoRank(num); }
		else if (PostAns.equals("Re") || PostAns.equals("re")) {
			TempObject.RanktoReau(num); }
	}
	else if (AnteAns.equals("Re") || AnteAns.equals("re")) {
		System.out.println(text1); PostAns = z.next(); 
		if (PostAns.equals("C") || PostAns.equals("c")) { 
			TempObject.ReautoCels(num); }
		else if (PostAns.equals("F") || PostAns.equals("f")) {
			TempObject.ReautoFahr(num); }
		else if (PostAns.equals("K") || PostAns.equals("k")) {
			TempObject.ReautoKelv(num); }
		else if (PostAns.equals("R") || PostAns.equals("r")) {
			TempObject.ReautoRank(num); }
		else if (PostAns.equals("Re") || PostAns.equals("re")) {
			TempObject.ReautoReau(num); }
	}z.close(); }
	}
