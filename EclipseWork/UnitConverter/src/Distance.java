
public class Distance {
	
// Millimeters
	public double MilliMM(double mmMM){ 
		double MM_MM = 2;
		// method converting mm to MM with a parameter mmMM
		System.out.println("MM-->MM"); 
		// prints header to signify conversion inter units
		mmMM = MM_MM*mmMM; 
		// givenmmMM is assigned the conversion calculations
		System.out.println(mmMM+"mm"); return mmMM; } 
	public double MilliCM(double mmCM) {
		double MM_CM = .1; 
		System.out.println("MM-->CM\n"+MM_CM);
		mmCM = MM_CM*mmCM;
		System.out.println(mmCM+"cm"); return mmCM; }
	public double MilliM(double mmM) {
		double MM_M = .001; 
		System.out.println("MM-->M\n"+MM_M);
		mmM = mmM*MM_M; 
		System.out.println(mmM+"mm"); return mmM; }
	public double MilliKM(double mmKM) {
		double MM_KM = 0.000001;
		System.out.println("MM-->KM");
		mmKM = MM_KM*mmKM;
		System.out.println(mmKM+"km"); return mmKM; }
	public double MilliIN(double mmIN) {
		double MM_IN = .0394;
		System.out.println("MM-->IN");
		mmIN = MM_IN*mmIN; 
		System.out.println(mmIN+"mm"); return mmIN; }
	public double MilliFT(double mmFT) {
		double MM_FT = .0033;
		System.out.println("MM-->FT");
		mmFT = MM_FT*mmFT;
		System.out.println(mmFT+"ft"); return mmFT; }
	public double MilliYD(double mmYD) {
		double MM_YD = 0.0011;
		System.out.println("MM-->YD");
		mmYD = MM_YD*mmYD;
		System.out.println(mmYD+"mm"); return mmYD; }
	public double MilliMI(double mmMI) {
		double MM_MI = 0.0000006;
		System.out.println("MM-->MI");
		mmMI = MM_MI*mmMI;
		System.out.println(mmMI+"mi"); return mmMI; }
	public double MilliNMI(double mmNMI) {
		double MM_NMI = 0.0000005;
		System.out.println("MM-->NMI");
		mmNMI = MM_NMI*mmNMI; 
		System.out.println(mmNMI+"mm"); return mmNMI; }

// Centimeters
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

// Meters
	public double MeterMM(double mMM) {
		double M_MM = 1000;
		System.out.println("M-->MM");
		mMM = M_MM*mMM;
		System.out.println(mMM+"mm"); return mMM; }
	public double MeterCM(double mCM) {
		double M_CM = 100;
		System.out.println("M-->CM");
		mCM = M_CM*mCM;
		System.out.println(mCM+"cm"); return mCM; }
	public double MeterM(double mM) {
		double M_M = 1;
		System.out.println("M-->M");
		mM = M_M*mM;
		System.out.println(mM+"m"); return mM; }
	public double MeterKM(double mKM) {
		double M_KM = 0.001;
		System.out.println("M-->KM");
		mKM = M_KM*mKM;
		System.out.println(mKM+"km"); return mKM; }
	public double MeterIN(double mIN) {
		double M_IN = 39.3701;
		System.out.println("M-->IN");
		mIN = M_IN*mIN;
		System.out.println(mIN+"in"); return mIN; }
	public double MeterFT(double mFT) {
		double M_FT = 3.2808;
		System.out.println("M-->FT");
		mFT = M_FT*mFT;
		System.out.println(mFT+"ft"); return mFT; }
	public double MeterYD(double mYD) {
		double M_YD = 1.0936;
		System.out.println("M-->YD");
		mYD = M_YD*mYD;
		System.out.println(mYD+"yd"); return mYD; }
	public double MeterMI(double mMI) {
		double M_MI = 0.0006;
		System.out.println("M-->MI");
		mMI = M_MI*mMI;
		System.out.println(mMI+"mi"); return mMI; }
	public double MeterNMI(double mNMI) {
		double M_NMI = 0.0054;
		System.out.println("M-->NMI");
		mNMI = M_NMI*mNMI;
		System.out.println(mNMI+"nmi"); return mNMI; }

// Kilometers
	public double KiloMM(double kmMM) {
		double KM_MM = 1e6;
		System.out.println("KM-->MM");
		kmMM = KM_MM*kmMM;
		System.out.println(kmMM+"mm"); return kmMM; }
	public double KiloCM(double kmCM) {
		double KM_CM = 1e5;
		System.out.println("KM-->CM");
		kmCM = KM_CM*kmCM;
		System.out.println(kmCM+"cm"); return kmCM; }
	public double KiloM(double kmM) {
		double KM_M = 1e3;
		System.out.println("KM-->M");
		kmM = KM_M*kmM;
		System.out.println(kmM+"m"); return kmM; }
	public double KiloKM(double kmKM) {
		double KM_KM = 1;
		System.out.println("KM-->KM");
		kmKM = KM_KM*kmKM;
		System.out.println(kmKM+"km"); return kmKM; }
	public double KiloIN(double kmIN) {
		double KM_IN = 39270.0787;
		System.out.println("KM-->IN");
		kmIN = KM_IN*kmIN;
		System.out.println(kmIN+"in"); return kmIN; }
	public double KiloFT(double kmFT) {
		double KM_FT = 3280.8399;
		System.out.println("KM-->FT");
		kmFT = KM_FT*kmFT;
		System.out.println(kmFT+"ft"); return kmFT; }
	public double KiloYD(double kmYD) {
		double KM_YD = 1093.6133;
		System.out.println("KM-->YD");
		kmYD = KM_YD*kmYD;
		System.out.println(kmYD+"yd"); return kmYD; }
	public double KiloMI(double kmMI) {
		double KM_MI = 0.6214;
		System.out.println("KM-->MI");
		kmMI = KM_MI*kmMI;
		System.out.println(kmMI+"mi"); return kmMI; }
	public double KiloNMI(double kmNMI) {
		double KM_NMI = .5399;
		System.out.println("KM-->NMI");
		kmNMI = KM_NMI*kmNMI;
		System.out.println(kmNMI+"nmi"); return kmNMI; }

// Inches
	public double InchMM(double inMM) {
		double IN_MM = 25.4;
		System.out.println("IN-->MM");
		inMM = IN_MM*inMM;
		System.out.println(inMM+"mm"); return inMM; }
	public double InchCM(double inCM) {
		double IN_CM = 2.54;
		System.out.println("IN-->CM");
		inCM = IN_CM*inCM;
		System.out.println(inCM+"cm"); return inCM; }
	public double InchM(double inM) {
		double IN_M = .0254;
		System.out.println("IN-->M");
		inM = IN_M*inM;
		System.out.println(inM+"m"); return inM; }
	public double InchKM(double inKM) {
		double IN_KM = 0.0000254;
		System.out.println("IN-->KM");
		inKM = IN_KM*inKM;
		System.out.println(inKM+"km"); return inKM; }
	public double InchIN(double inIN) {
		double IN_IN = 1;
		System.out.println("IN-->IN");
		inIN = IN_IN*inIN;
		System.out.println(inIN+"in"); return inIN; }
	public double InchFT(double inFT) {
		double IN_FT = .0833;
		System.out.println("IN-->FT");
		inFT = IN_FT*inFT;
		System.out.println(inFT+"ft"); return inFT; }
	public double InchYD(double inYD) {
		double IN_YD = 0.0277;
		System.out.println("IN-->YD");
		inYD = IN_YD*inYD;
		System.out.println(inYD+"yd"); return inYD; }
	public double InchMI(double inMI) {
		double IN_MI = 0.0000156;
		System.out.println("IN-->MI");
		inMI = IN_MI*inMI;
		System.out.println(inMI+"mi"); return inMI; }
	public double InchNMI(double inNMI) {
		double IN_NMI = 0.0000137;
		System.out.println("IN-->NMI");
		inNMI = IN_NMI*inNMI;
		System.out.println(inNMI+"nmi"); return inNMI; }
	
// Foot/Feet
	public double FeetMM(double ftMM) {
		double FT_MM = 304.8;
		System.out.println("FT-->MM");
		ftMM = FT_MM*ftMM;
		System.out.println(ftMM+"mm"); return ftMM; }
	public double FeetCM(double ftCM) {
		double FT_CM = 30.48;
		System.out.println("FT-->CM");
		ftCM = FT_CM*ftCM;
		System.out.println(ftCM+"cm"); return ftCM; }
	public double FeetM(double ftM) {
		double FT_M = 0.3048;
		System.out.println("FT-->M");
		ftM = FT_M*ftM;
		System.out.println(ftM+"m"); return ftM; }
	public double FeetKM(double ftKM) {
		double FT_KM = 0.0003408;
		System.out.println("FT-->KM");
		ftKM = FT_KM*ftKM;
		System.out.println(ftKM+"km"); return ftKM; }
	public double FeetIN(double ftIN) {
		double FT_IN = 12;
		System.out.println("FT-->IN");
		ftIN = FT_IN*ftIN;
		System.out.println(ftIN+"in"); return ftIN; }
	public double FeetFT(double ftFT) {
		double FT_FT = 1;
		System.out.println("FT-->FT");
		ftFT = FT_FT*ftFT;
		System.out.println(ftFT+"ft"); return ftFT; }
	public double FeetYD(double ftYD) {
		double FT_YD = 0.3333;
		System.out.println("FT-->YD");
		ftYD = FT_YD*ftYD;
		System.out.println(ftYD+"yd"); return ftYD; }
	public double FeetMI(double ftMI) {
		double FT_MI = 0.0001894;
		System.out.println("FT-->MI");
		ftMI = FT_MI*ftMI;
		System.out.println(ftMI+"mi"); return ftMI; }
	public double FeetNMI(double ftNMI) {
		double FT_NMI = 0.000165;
		System.out.println("FT-->NMI");
		ftNMI = FT_NMI*ftNMI;
		System.out.println(ftNMI+"nmi"); return ftNMI; }

// Yards
	public double YardMM(double ydMM) {
		double YD_MM = 914.4;
		System.out.println("YD-->MM");
		ydMM = YD_MM*ydMM;
		System.out.println(ydMM+"mm"); return ydMM; }
	public double YardCM(double ydCM) {
		double YD_CM = 91.44;
		System.out.println("YD-->CM");
		ydCM = YD_CM*ydCM;
		System.out.println(ydCM+"cm"); return ydCM; }
	public double YardM(double ydM) {
		double YD_M = 0.9144;
		System.out.println("YD-->M");
		ydM = YD_M*ydM;
		System.out.println(ydM+"m"); return ydM; }
	public double YardKM(double ydKM) {
		double YD_KM = 0.000914;
		System.out.println("YD-->KM");
		ydKM = YD_KM*ydKM;
		System.out.println(ydKM+"km"); return ydKM; }
	public double YardIN(double ydIN) {
		double YD_IN = 36;
		System.out.println("YD-->IN");
		ydIN = YD_IN*ydIN;
		System.out.println(ydIN+"in"); return ydIN; }
	public double YardFT(double ydFT) {
		double YD_FT = 3; 
		System.out.println("YD-->FT");
		ydFT = YD_FT*ydFT;
		System.out.println(ydFT+"ft"); return ydFT; }
	public double YardYD(double ydYD) {
		double YD_YD = 1;
		System.out.println("YD-->YD");
		ydYD = YD_YD*ydYD;
		System.out.println(ydYD+"yd"); return ydYD; }
	public double YardMI(double ydMI) {
		double YD_MI = 0.000568;
		System.out.println("YD-->MI");
		ydMI = YD_MI*ydMI; 
		System.out.println(ydMI+"mi"); return ydMI; }
	public double YardNMI(double ydNMI) {
		double YD_NMI = .0004937;
		System.out.println("YD-->NMI");
		ydNMI = YD_NMI*ydNMI;
		System.out.println(ydNMI+"nmi"); return ydNMI; }

// Miles
	public double MileMM(double miMM) {
		double MI_MM = 1609344;
		System.out.println("MI-->MM");
		miMM = MI_MM*miMM;
		System.out.println(miMM+"mm"); return miMM; }
	public double MileCM(double miCM) {
		double MI_CM = 160934.4;
		System.out.println("MI-->CM");
		miCM = MI_CM*miCM;
		System.out.println(miCM+"cm"); return miCM; }
	public double MileM(double miM) {
		double MI_M = 1609.344;
		System.out.println("MI-->M");
		miM = MI_M*miM;
		System.out.println(miM+"'m"); return miM; }
	public double MileKM(double miKM) {
		double MI_KM = 1.609344;
		System.out.println("MI-->KM");
		miKM = MI_KM*miKM;
		System.out.println(miKM+"km"); return miKM; }
	public double MileIN(double miIN) {
		double MI_IN = 63360;
		System.out.println("MI-->IN");
		miIN = MI_IN*miIN;
		System.out.println(miIN+"in"); return miIN; }
	public double MileFT(double miFT) {
		double MI_FT = 5280;
		System.out.println("MI-->FT");
		miFT = MI_FT*miFT;
		System.out.println(miFT+"ft"); return miFT; }
	public double MileYD(double miYD) {
		double MI_YD = 1760;
		System.out.println("MI-->YD");
		miYD = MI_YD*miYD;
		System.out.println(miYD+"yd"); return miYD; }
	public double MileMI(double miMI) {
		double MI_MI = 1;
		System.out.println("MI-->MI");
		miMI = MI_MI*miMI;
		System.out.println(miMI+"mi"); return miMI; }
	public double MileNMI(double miNMI) {
		double MI_NMI = .8690;
		System.out.println("MI-->NMI");
		miNMI = MI_NMI*miNMI;
		System.out.println(miNMI+"nmi"); return miNMI; }

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

