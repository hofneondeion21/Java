import java.util.*;
public class OverallMainPrompt {
	public static void main(String [] args) {
		Scanner z = new Scanner(System.in);
		Header head = new Header();
		head.OverallHeader();
		int ans = z.nextInt();
		if (ans == 1) {
			OverallDistance ODistObject = new OverallDistance();
			ODistObject.ODistance(); }
		else if (ans == 2) {
			OverallData ODataObject = new OverallData();
			ODataObject.OData(); }
		else if (ans == 3) {
			OverallTemperature OTempObject = new OverallTemperature();
			OTempObject.OTemperature(); }
		
		z.close(); }}
