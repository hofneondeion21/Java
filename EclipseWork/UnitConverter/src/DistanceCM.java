
public class DistanceCM {
	// CENTIMETER
	public double CentMM(double cmMM) {
		double CM_MM = 10;
		System.out.println("CM-->MM");
		cmMM = cmMM*CM_MM;
		System.out.println(cmMM+"mm"); return cmMM; }
	public double CentCM(double cmCM) {
		double CM_CM = 1;
		System.out.println("CM-->CM");
		cmCM = CM_CM*cmCM;
		System.out.println(cmCM+"cm"); return cmCM; }
	public double CentM(double cmM ) {
		double CM_M = .01;
		System.out.println("CM-->M");
		cmM = CM_M*cmM;
		System.out.println(cmM+"m"); return cmM ; }
	public double CentKM(double cmKM) {
		double CM_KM = .00001;
		System.out.println("CM-->KM");
		cmKM = CM_KM*cmKM;
		System.out.println(cmKM+"km"); return cmKM; }
	public double CentIN(double cmIN) {
		double CM_IN = .3947;
		System.out.println("CM-->IN");
		cmIN = CM_IN*cmIN;
		System.out.println(cmIN+"in"); return cmIN; }
	public double CentFT(double cmFT) {
		double CM_FT = .0328;
		System.out.println("CM-->FT");
		cmFT = CM_FT*cmFT;
		System.out.println(cmFT+"ft"); return cmFT; }
	public double CentYD(double cmYD) {
		double CM_YD = .0109;
		System.out.println("CM-->YD");
		cmYD = CM_YD*cmYD;
		System.out.println(cmYD+"yd"); return cmYD; }
	public double CentMI(double cmMI) {
		double CM_MI = 0.000006;
		System.out.println("CM-->MI");
		cmMI = CM_MI*cmMI;
		System.out.println(cmMI+"mi"); return cmMI; }
	public double CentNMI(double cmNMI) {
		double CM_NMI = 0.000005;
		System.out.println("CM-->NMI");
		cmNMI = CM_NMI*cmNMI;
		System.out.println(cmNMI+"nmi"); return cmNMI; }
}
