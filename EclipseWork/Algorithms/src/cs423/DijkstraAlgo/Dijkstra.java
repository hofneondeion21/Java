package cs423.DijkstraAlgo;

public class Dijkstra {
	private String[] nodes = 
		{"A", "B", "C", "D", "E", "F", "G", };
	private int[][] matrix = 
					{	// A, B, C, D, E, F, G
						  {0, 2, 4, 7, 0, 5, 0}, // A
						  {2, 0, 0, 6, 3, 0, 8}, // B
						  {4, 0, 0, 0, 0, 6, 0}, // C
						  {7, 6, 0, 0, 0, 1, 6}, // D	
						  {0, 3, 0, 0, 0, 0, 7}, // E
						  {5, 0, 6, 1, 0, 0, 6}, // F
						  {0, 8, 0, 6, 7, 6, 0}, // G	
					};
	private int vertex = 7;

	public static void main (String args[]) { new Dijkstra(); }
	
	private Dijkstra() { initRun(); }
	
	private void initRun() { initializeGraph(); }
	
	private void initializeGraph() {
		printArr(nodes);
		System.out.println();
		printArr(matrix);
		System.out.println();
		dijkstraPrim(matrix);
	}
	
	private int getMinVert(boolean[] isVisited, int[] key) {
		int minKey = Integer.MAX_VALUE;
		int min_idx = -1;
		for (int i = 0; i < vertex; i++) {
//			System.out.printf("%d --> %s == false && %d > %d\n",i, mst[i], minKey, key[i]);
			if (isVisited[i] == false && key[i] <= minKey) {
				minKey = key[i];
				min_idx = i;
			}
		}
		return min_idx;
	}
	
	private void dijkstraPrim(int[][] matrix) {
//		System.out.printf("Starting @ %d\n", src);
		int[] newMST = new int[vertex];
		boolean[] isVisited = new boolean[vertex];
		int[] distance = new int[vertex];
	
		// initialize the first fringe or the first NODE
//		BigDecimal start = new BigDecimal(System.nanoTime());
		initializeFringe(distance, isVisited);
		distance[0] = 0;
		newMST[0] = -1;
		for (int i = 0; i < vertex; i++) {
			int min = getMinVert(isVisited, distance);
			System.out.printf("Node: %s \n", nodes[i]);
			isVisited[min] = true; // sets current node to true for isVisited after inner loop completed
			for (int j = 0; j < vertex; j++) {
				// if the value at matrix[min][j] != 0 && --> 
//			// IF STATEMENT MUST BE TRUE . . . 
				// --> if the branching nodes from the current node is not ZERO &&
				// --> if the current node has NOT been visited && 
				// --> if the branching node is < than INFINITY (distance[j])
				if (matrix[min][j] != 0 && isVisited[j] == false && matrix[min][j] < distance[j]) {
					System.out.printf("\t %d --> %d\n",j, matrix[min][j]);
					System.out.printf("\t--> ( %d < %s(%d) ) == true ",matrix[min][j],nodes[j], distance[j]);
						newMST[j] = min; 
						distance[j] = matrix[min][j];
						System.out.printf("\t==> %s (%d)\n",nodes[j], distance[j]);
				} // endae IF
			} // ednae FOR
		} // endae FOR
//		BigDecimal end = new BigDecimal(System.nanoTime());
		printMST(newMST, matrix);
//		System.out.printf("V1 TIME: %.2f ns ", end.subtract(start));
	} // endae dijkstraPrim
	
	private void initializeFringe(int[] distance, boolean[] visited) {
		for (int i = 0; i < vertex; i++) {
			distance[i] = Integer.MAX_VALUE;
			visited[i] = false;
		} // ednae FOR
	}	 // endae initializeFringe
	 
	 private void printMST(int[] newMST, int matrix[][]) {
		 System.out.println("\n\nEdge \tWeight");
		 int j = -1;
		 for (int i = 1; i <vertex; i++) {
			 j = newMST[i]+1;
			 System.out.println(nodes[newMST[i]] + " -> "+nodes[i]+"\t"+ matrix[i][newMST[i]]);
		 } // endae FOR
	 } // ednae printMST
	
	private void printArr(int[][] path) {
		for (int i = 0; i < path.length; i ++) {
			if (i >=0) {
				System.out.printf("%3s | ", nodes[i]);
			} // endae IF
			for (int j = 0; j < path[i].length; j++) {
				System.out.printf("%3d | ", path[i][j]);
			} // endae FOR
			System.out.println();
		} // endae FOR
	} // endae printArr
	
	private void printArr(String[] arr) {
		System.out.println("\nGraph: ");
		for (int i = 0; i < arr.length; i++) {
			if (i <= 0) {
				System.out.printf("%3s | ", "");
				System.out.printf("%3s | ",arr[i]);
			} // ednae IF
			else {
				System.out.printf("%3s | ",arr[i]);
			} // ednae IF
		} // endae FOR
	} // endae printArr
}
