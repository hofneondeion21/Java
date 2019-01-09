package DecisionStructures;

// design a class that stores the names of three runners and their times in minutes for each to finish the race
	// class should have methods that return the nam eof the runner in the first, second, and third;

// Singleton Enumberation desgin
public class RunningTheRace {
	
	private enum getINSTANCE {
		INSTANCE;
		
		private String name;
		private int minutes;
		private int pollPosition;

		public synchronized void initRunner(String name, int minutes) {
			this.name = name;
			this.minutes = minutes;
			
		} // endae mutator init
		
		private void mainRun() {
			
		}
		
		private int getTimeInMinutes() {
			return minutes;
		} // endae Accessor getTimeInMinutes();
		
		private String getName() {
			return name;
		} // endae Accessor getName();
		
		private void setPollPosition(int pollPosition) {
			this.pollPosition = pollPosition;
		} // endae mutator setPollPosition
		
		private int getPollPosition() {
			return pollPosition;
		}
		
		public String toString() {
			return "Name: "+ getName() + "\nPosition: "+getPollPosition() + "\n";
		}
		
		public void compareTime(int mins1, int mins2, int mins3) {
			pollPosition = 0;
			if (mins1 < mins2 && mins1 < mins3) {
				setPollPosition(1); // first person will be in first Place;
				if (mins2 < mins3 && mins2 > mins1) {
					setPollPosition(2);
				} // endae IF
				else {
					setPollPosition(3);
				} // endae ELSE
			} // endae IF
			else if ( mins2 < mins1 && mins2 < mins3) {
				setPollPosition(1);
				if (mins3 < mins1 && mins3 > mins2) {
					setPollPosition(2);
				} // endae IF
				else {
					setPollPosition(3);
				} // endae ELSE
			} // endae ELSE IF
			else if (mins3 < mins1 && mins3 < mins1) {
				setPollPosition(1);
				if (mins1 < mins2 && mins1 > mins3) {
					setPollPosition(2); 
				} // endae IF
				else {
					setPollPosition(3);
				} // enae ELSE
			} // endae ELSE IF
		} // endae compareTime 
			
		
	} // enae getINSTANCE

	private String name;
	private int minutes;
	
	

	public void mainRun() {
		System.out.println(RunningTheRace.getINSTANCE.INSTANCE);
	
	}

	public void initRunner(String name, int minutes) {
		this.name = name;
		this.minutes = minutes;
	} // endae mutator init
	
	
	// order : int --> returns the pollPosition
	
	
	public static void main(String args[]) {
		RunningTheRace.getINSTANCE.INSTANCE.initRunner("Stephany", 80);
		RunningTheRace.getINSTANCE.INSTANCE.initRunner("Haku", 90);
		RunningTheRace.getINSTANCE.INSTANCE.initRunner("Other", 100);
		
		
	}
	
	
	
}


