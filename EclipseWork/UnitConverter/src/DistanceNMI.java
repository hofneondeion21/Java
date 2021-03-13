
public class DistanceNMI {
// Nautical Miles
	public double NauticalMM(double nmiMM) {
		double NMI_MM = 1852000;
		System.out.println("NMI-->MM");
		nmiMM = NMI_MM*nmiMM;
		System.out.println(nmiMM+"mm"); return nmiMM;}
	public double NauticalCM(double nmiCM) {
		double NMI_CM = 185200;
		System.out.println("NMI-->CM");
		nmiCM = NMI_CM*nmiCM;
		System.out.println(nmiCM+"cm"); return nmiCM;}
	public double NauticalM(double nmiM) {
		double NMI_M = 1852;
		System.out.println("NMI-->M");
		nmiM = NMI_M*nmiM;
		System.out.println(nmiM+"m"); return nmiM;}
	public double NauticalKM(double nmiKM) {
		double NMI_KM = 1.852;
		System.out.println("NMI-->KM");
		nmiKM = NMI_KM*nmiKM;
		System.out.println(nmiKM+"km"); return nmiKM;}
	public double NauticalIN(double nmiIN) {
		double NMI_IN = 72913.3858;
		System.out.println("NMI-->IN");
		nmiIN = NMI_IN*nmiIN;
		System.out.println(nmiIN+"in"); return nmiIN;}
	public double NauticalFT(double nmiFT) {
		double NMI_FT = 6076.1155;
		System.out.println("NMI-->FT");
		nmiFT = NMI_FT*nmiFT;
		System.out.println(nmiFT+"ft"); return nmiFT; }
	public double NauticalYD(double nmiYD) {
		double NMI_YD = 2025.2718;
		System.out.println("NMI-->YD");
		nmiYD = NMI_YD*nmiYD;
		System.out.println(nmiYD+"yd"); return nmiYD;}
	public double NauticalMI(double nmiMI) {
		double NMI_MI = 1.1508;
		System.out.println("NMI-->MI");
		nmiMI = NMI_MI*nmiMI;
		System.out.println(nmiMI+"mi"); return nmiMI;}
	public double NauticalNMI(double nmiNMI) {
		double NMI_NMI = 1;
		System.out.println("NMI-->NMI");
		nmiNMI = NMI_NMI*nmiNMI;
		System.out.println(nmiNMI+"nmi"); return nmiNMI;}
}
