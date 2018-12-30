package DecisionStructures;

import java.util.Scanner;

public class TimeCalculator {
	double seconds;
	double minutes; // 60 seconds in hour minute
	double hours; // 3600 seconds in one hour
	double day;// 86,400 seconds in one day

	public TimeCalculator(double seconds) {
		setSeconds(seconds);
		calculateTime();
	} // endae CONSTRUCTOR
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}

	public double getSeconds() {
		return seconds;
	}

	public void setMinutes(double minutes) {
		this.minutes = minutes;
	}
	public double getMinutes() {
		return minutes;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getHours() {
		return hours;
	}
	public void setDays(double day) {
		this.day = day;
	}
	public double getDays() {
		return day;
	}

	private void calculateTime() {
		if (seconds <= 60 && seconds >= 0) {
			setSeconds(seconds);
			setMinutes(0);
			setHours(0);
			setDays(0);
		}
		else {
			day = seconds / 86400;
			setDays(day);
			hours = (seconds / 3600);
			setHours(hours);
			minutes = (seconds / 60);
			setMinutes(minutes);
			seconds = (minutes % .1) * 60;
		}
	}

	public String toString() {
		String result = "Seconds: " + getSeconds() + "\nMinutes: "
				+ getMinutes() + "\nHours: " + getHours() + "\nDays: "
				+ getDays();
		return result;
	}

	public static void main(String args[]) {
		Scanner z = new Scanner(System.in);
		System.out.println("Enter number of Seconds: ");
		double userSec = z.nextInt();
		TimeCalculator tc = new TimeCalculator(userSec);
		System.out.println(tc.toString());
		z.close();
	}

}
