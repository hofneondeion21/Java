
public class DistanceMM{
	public double MiliMM(double mmMM){ 
		double MM_MM = 2;
		// method converting mm to MM with a parameter mmMM
		System.out.println("MM-->MM"); 
		// prints header to signify conversion inter units
		mmMM = MM_MM*mmMM; 
		// givenmmMM is assigned the conversion calculations
		System.out.println(mmMM+"mm"); return mmMM; } 
	public double MiliCM(double mmCM) {
		double MM_CM = .1; 
		System.out.println("MM-->CM\n"+MM_CM);
		mmCM = MM_CM*mmCM;
		System.out.println(mmCM+"cm"); return mmCM; }
	public double MiliM(double mmM) {
		double MM_M = .001; 
		System.out.println("MM-->M\n"+MM_M);
		mmM = mmM*MM_M; 
		System.out.println(mmM+"mm"); return mmM; }
	public double MiliKM(double mmKM) {
		double MM_KM = 0.000001;
		System.out.println("MM-->KM");
		mmKM = MM_KM*mmKM;
		System.out.println(mmKM+"km"); return mmKM; }
	public double MiliIN(double mmIN) {
		double MM_IN = .0394;
		System.out.println("MM-->IN");
		mmIN = MM_IN*mmIN; 
		System.out.println(mmIN+"mm"); return mmIN; }
	public double MiliFT(double mmFT) {
		double MM_FT = .0033;
		System.out.println("MM-->FT");
		mmFT = MM_FT*mmFT;
		System.out.println(mmFT+"ft"); return mmFT; }
	public double MiliYD(double mmYD) {
		double MM_YD = 0.0011;
		System.out.println("MM-->YD");
		mmYD = MM_YD*mmYD;
		System.out.println(mmYD+"mm"); return mmYD; }
	public double MiliMI(double mmMI) {
		double MM_MI = 0.0000006;
		System.out.println("MM-->MI");
		mmMI = MM_MI*mmMI;
		System.out.println(mmMI+"mi"); return mmMI; }
	public double MiliNMI(double mmNMI) {
		double MM_NMI = 0.0000005;
		System.out.println("MM-->NMI");
		mmNMI = MM_NMI*mmNMI; 
		System.out.println(mmNMI+"mm"); return mmNMI; }
}
