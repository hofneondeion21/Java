import java.util.Random;

public class Main {
	private int sampleLength = 1000;
	private int[] randomNumber = new int[sampleLength];
	private Random r;
    public static void main(String[] args) {
    	new Main();
    }
    
    
    Main() {
    	r = new Random();
        fillArray(randomNumber);
        for (int i = 0; i < 10; i++) {
        	HashPortion(100*(i+1));
        }
    }

     private void fillArray(int[] randomNumber) {
         int rand = r.nextInt(1000)+0;
         for (int i = 0; i < randomNumber.length; i++){
             randomNumber[i] = rand;
//             System.out.printf("%d |\n",randomNumber[i]);
             rand = r.nextInt(1000)+0;
         }
      
	}
     
    private void HashPortion(int z) {
    	  int size = z;
    	  System.out.println("\t\tSIZE = " + size);
          HashLinQuad linHashTable = new HashLinQuad(size);
          int linCollisionCount = 0;
          for (int i = 0; i < randomNumber.length; ++i) {
              linCollisionCount += linHashTable.addLin(randomNumber[i]);
          }
          
//          linHashTable.addLin(randomNumber[0]);
          System.out.println("Collision: LinHashTable  = " + linCollisionCount);
    }
    
}