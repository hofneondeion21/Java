package DecisionStructures;

public class TesterCode {
	
    public static void main(String[] args) {

        System.out.println(getdurationstring(60 , 40));
        System.out.println( 3945L);
    }
    public static String getdurationstring(long miniutes , long seconds){

        if ((miniutes < 0) || (seconds < 0) || (seconds > 59)){
          return "INVALID VALUE";
        }
        long hours = miniutes / 60;
        long remainingminiutes = miniutes % 60;
        return hours + "h " + remainingminiutes + "m " + seconds + "s ";

    }
    public static String getdurationstring(long seconds){
        if (seconds < 0) {
            return "INVALID VALUE";
        }
            long miniutes = seconds / 60;
            long remainingseconds = seconds % 60;

            return getdurationstring(miniutes ,remainingseconds );
        }
    }

