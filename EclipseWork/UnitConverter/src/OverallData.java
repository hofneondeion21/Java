import java.util.*;
public class OverallData {
	public void OData() {
		String a = "\n\n\n\n\n";
		Data DatabObject = new Data();
		Scanner z = new Scanner(System.in);
		Header head = new Header();
		head.DataHeader();
		System.out.println("'b' = bits\t || 'B' = bytes");
		System.out.println("Please pick a number");
		double num = z.nextDouble(); 
		System.out.println("Provude Base Unit"); 
		String AnteUnit = z.next();
// Calling Bits Method in Data Class
		if (AnteUnit.equals("b")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.next();
			if (PostUnit.equals("b")) {DatabObject.Bitsb(num); } else if (PostUnit.equals("B")) {DatabObject.BitsB(num);} 
			else if (PostUnit.equals("Kb")) {DatabObject.BitsKb(num); } else if (PostUnit.equals("KB")) {DatabObject.BitsKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.BitsMb(num); } else if (PostUnit.equals("MB")) {DatabObject.BitsMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.BitsGb(num); } else if (PostUnit.equals("GB")) {DatabObject.BitsGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.BitsPb(num); } else if (PostUnit.equals("PB")) {DatabObject.BitsPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.BitsTb(num); } else if (PostUnit.equals("TB")) {DatabObject.BitsTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.BitsEb(num); } else if (PostUnit.equals("EB")) {DatabObject.BitsEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.BitsZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.BitsZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.BitsYb(num); } else if (PostUnit.equals("YB")) {DatabObject.BitsYB(num); }
		}
// Calling Bytes method in Data class
		else if (AnteUnit.equals("B")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Bytesb(num); } else if (PostUnit.equals("B")) {DatabObject.BytesB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.BytesKb(num); } else if (PostUnit.equals("KB")) {DatabObject.BytesKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.BytesMb(num); } else if (PostUnit.equals("MB")) {DatabObject.BytesMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.BytesGb(num); } else if (PostUnit.equals("GB")) {DatabObject.BytesGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.BytesPb(num); } else if (PostUnit.equals("PB")) {DatabObject.BytesPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.BytesTb(num); } else if (PostUnit.equals("TB")) {DatabObject.BytesTB(num); }
			else if (PostUnit.equals("Eb")) {DatabObject.BytesEb(num); } else if (PostUnit.equals("EB")) {DatabObject.BytesEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.BytesZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.BytesZB(num); }
			else if (PostUnit.equals("Yb")) {DatabObject.BytesYb(num); } else if (PostUnit.equals("YB")) {DatabObject.BytesYB(num); }
		}
// Calling Kilobits method in Data class
		else if (AnteUnit.equals("Kb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Kilobb(num); } else if (PostUnit.equals("B")) {DatabObject.KilobB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.KilobKb(num); } else if (PostUnit.equals("KB")) {DatabObject.KilobKB(num); }
			else if (PostUnit.equals("Mb")) {DatabObject.KilobMb(num); } else if (PostUnit.equals("MB")) {DatabObject.KilobMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.KilobGb(num); } else if (PostUnit.equals("GB")) {DatabObject.KilobGB(num); }
			else if (PostUnit.equals("Pb")) {DatabObject.KilobPb(num); } else if (PostUnit.equals("PB")) {DatabObject.KilobPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.KilobTb(num); } else if (PostUnit.equals("TB")) {DatabObject.KilobTB(num); }
			else if (PostUnit.equals("Eb")) {DatabObject.KilobEb(num); } else if (PostUnit.equals("EB")) {DatabObject.KilobEB(num); }
			else if (PostUnit.equals("Zb")) {DatabObject.KilobZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.KilobZB(num); }
			else if (PostUnit.equals("Yb")) {DatabObject.KilobYb(num); } else if (PostUnit.equals("YB")) {DatabObject.KilobYB(num); }
		}
// Calling Kilobytes method in Data class
		else if (AnteUnit.equals("KB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.KiloBb(num); } else if (PostUnit.equals("B")) {DatabObject.KiloBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.KiloBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.KiloBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.KiloBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.KiloBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.KiloBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.KiloBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.KiloBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.KiloBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.KiloBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.KiloBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.KiloBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.KiloBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.KiloBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.KiloBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.KiloBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.KiloBYB(num); } 
		}
// Calling Megabits method in Data Class
		else if (AnteUnit.equals("Mb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Megabb(num); } else if (PostUnit.equals("B")) {DatabObject.MegabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.MegabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.MegabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.MegabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.MegabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.MegabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.MegabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.MegabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.MegabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.MegabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.MegabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.MegabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.MegabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.MegabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.MegabZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.MegabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.MegabYB(num); }
		}
// Calling Megabytes method in Data Class
		else if (AnteUnit.equals("MB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.MegaBb(num); } else if (PostUnit.equals("B")) {DatabObject.MegaBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.MegaBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.MegaBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.MegaBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.MegaBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.MegaBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.MegaBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.MegaBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.MegaBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.MegaBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.MegaBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.MegaBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.MegaBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.MegaBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.MegaBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.MegaBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.MegaBYB(num); }
		}	
// Calling Gigabits method in Data Class
		else if (AnteUnit.equals("Gb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Gigabb(num); } else if (PostUnit.equals("B")) {DatabObject.GigabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.GigabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.GigabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.GigabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.GigabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.GigabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.GigabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.GigabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.GigabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.GigabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.GigabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.GigabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.GigabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.GigabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.GigabZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.GigabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.GigabYB(num); }
		}
// Calling Gigabytes method in Data Class
		else if (AnteUnit.equals("GB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.GigaBb(num); } else if (PostUnit.equals("B")) {DatabObject.GigaBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.GigaBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.GigaBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.GigaBMb(num); } else if (PostUnit.equals("KB")) {DatabObject.GigaBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.GigaBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.GigaBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.GigaBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.GigaBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.GigaBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.GigaBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.GigaBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.GigaBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.GigaBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.GigaBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.GigaBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.GigaBYB(num); }
		}
// Calling Terabits method in Data Class
		else if (AnteUnit.equals("Tb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Terabb(num); } else if (PostUnit.equals("B")) {DatabObject.TerabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.TerabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.TerabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.TerabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.TerabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.TerabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.TerabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.TerabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.TerabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.TerabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.TerabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.TerabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.TerabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.TerabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.TerabZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.TerabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.TerabYB(num); }
		}
// Calling Terabytes method in Data Class
		else if (AnteUnit.equals("TB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.TeraBb(num); } else if (PostUnit.equals("B")) {DatabObject.TeraBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.TeraBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.TeraBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.TeraBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.TeraBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.TeraBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.TeraBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.TeraBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.TeraBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.TeraBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.TeraBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.TeraBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.TeraBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.TeraBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.TeraBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.TeraBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.TeraBYB(num); }
		}
// Calling Petabits method in Data Class
		else if (AnteUnit.equals("Pb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Petabb(num); } else if (PostUnit.equals("B")) {DatabObject.PetabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.PetabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.PetabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.PetabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.PetabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.PetabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.PetabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.PetabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.PetabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.PetabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.PetabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.PetabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.PetabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.PetabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.PetabZB(num); }  
			else if (PostUnit.equals("Yb")) {DatabObject.PetabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.PetabYB(num); }
		}
// Calling Petabytes method in Data Class
		else if (AnteUnit.equals("PB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.PetaBb(num); } else if (PostUnit.equals("B")) {DatabObject.PetaBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.PetaBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.PetaBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.PetaBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.PetaBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.PetaBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.PetaBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.PetaBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.PetaBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.PetaBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.PetaBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.PetaBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.PetaBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.PetaBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.PetaBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.PetaBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.PetaBYB(num); }
		}
// Calling Exabits method in Data Class
		else if (AnteUnit.equals("Eb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Exabb(num); } else if (PostUnit.equals("B")) {DatabObject.ExabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.ExabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.ExabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.ExabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.ExabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.ExabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.ExabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.ExabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.ExabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.ExabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.ExabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.ExabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.ExabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.ExabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.ExabZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.ExabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.ExabYB(num); }
		}
// Calling Exabytes method in Data Class
		else if (AnteUnit.equals("EB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.ExaBb(num); } else if (PostUnit.equals("B")) {DatabObject.ExaBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.ExaBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.ExaBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.ExaBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.ExaBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.ExaBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.ExaBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.ExaBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.ExaBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.ExaBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.ExaBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.ExaBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.ExaBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.ExaBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.ExaBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.ExaBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.ExaBYB(num); }
		}
// Calling Zettabits method in Data Class
		else if (AnteUnit.equals("Zb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Zettabb(num); } else if (PostUnit.equals("B")) {DatabObject.ZettabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.ZettabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.ZettabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.ZettabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.ZettabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.ZettabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.ZettabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.ZettabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.ZettabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.ZettabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.ZettabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.ZettabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.ZettabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.ZettabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.ZettabZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.ZettabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.ZettabYB(num); }
		}
// Calling Zettabytes method in Data Class
		else if (AnteUnit.equals("ZB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.ZettaBb(num); } else if (PostUnit.equals("B")) {DatabObject.ZettaBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.ZettaBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.ZettaBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.ZettaBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.ZettaBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.ZettaBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.ZettaBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.ZettaBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.ZettaBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.ZettaBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.ZettaBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.ZettaBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.ZettaBEB(num); }
			else if (PostUnit.equals("Zb")) {DatabObject.ZettaBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.ZettaBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.ZettaBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.ZettaBYB(num); }
		System.out.println(a); }
// Calling Yottabits method in Data Class
		else if (AnteUnit.equals("Yb")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.Yottabb(num); } else if (PostUnit.equals("B")) {DatabObject.YottabB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.YottabKb(num); } else if (PostUnit.equals("KB")) {DatabObject.YottabKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.YottabMb(num); } else if (PostUnit.equals("MB")) {DatabObject.YottabMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.YottabGb(num); } else if (PostUnit.equals("GB")) {DatabObject.YottabGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.YottabPb(num); } else if (PostUnit.equals("PB")) {DatabObject.YottabPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.YottabTb(num); } else if (PostUnit.equals("TB")) {DatabObject.YottabTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.YottabEb(num); } else if (PostUnit.equals("EB")) {DatabObject.YottabEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.YottabZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.YottabZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.YottabYb(num); } else if (PostUnit.equals("YB")) {DatabObject.YottabYB(num); }
		}
// Calling Yottabytes method in Data Class
		else if (AnteUnit.equals("YB")) {
			System.out.println("Use Abbreviation to Convert to");
			String PostUnit = z.nextLine();
			if (PostUnit.equals("b")) {DatabObject.YottaBb(num); } else if (PostUnit.equals("B")) {DatabObject.YottaBB(num); } 
			else if (PostUnit.equals("Kb")) {DatabObject.YottaBKb(num); } else if (PostUnit.equals("KB")) {DatabObject.YottaBKB(num); } 
			else if (PostUnit.equals("Mb")) {DatabObject.YottaBMb(num); } else if (PostUnit.equals("MB")) {DatabObject.YottaBMB(num); }
			else if (PostUnit.equals("Gb")) {DatabObject.YottaBGb(num); } else if (PostUnit.equals("GB")) {DatabObject.YottaBGB(num); } 
			else if (PostUnit.equals("Pb")) {DatabObject.YottaBPb(num); } else if (PostUnit.equals("PB")) {DatabObject.YottaBPB(num); }
			else if (PostUnit.equals("Tb")) {DatabObject.YottaBTb(num); } else if (PostUnit.equals("TB")) {DatabObject.YottaBTB(num); } 
			else if (PostUnit.equals("Eb")) {DatabObject.YottaBEb(num); } else if (PostUnit.equals("EB")) {DatabObject.YottaBEB(num); } 
			else if (PostUnit.equals("Zb")) {DatabObject.YottaBZb(num); } else if (PostUnit.equals("ZB")) {DatabObject.YottaBZB(num); } 
			else if (PostUnit.equals("Yb")) {DatabObject.YottaBYb(num); } else if (PostUnit.equals("YB")) {DatabObject.YottaBYB(num); }
		}
	z.close(); }
}
