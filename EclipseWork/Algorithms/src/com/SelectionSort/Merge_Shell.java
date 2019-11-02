package com.SelectionSort;

import java.util.Random;

public class Merge_Shell {
	private int[] arr;
	private Random r = new Random();
	private int time, shellTime;
	
	public static void main(String args[]) {
		new Merge_Shell();
	}
	
	Merge_Shell() {
		initRun();
	}
	
	Merge_Shell(boolean flag, int size) {
		arr = initArr(arr, size);
		if(flag == true) {
			MargeSort(arr, 0, (arr.length-1));
		}
		else {
			ShellSort(arr);
		}
	}
	
	void initRun() {
		int n = 8, nn = 10;
		double avgM = 0, avgS = 0;
		long sumM = 0, sumS = 0;
		for (int i = 1; i <=n; i++) {
			System.out.printf("\n------------------------\nInput(N) : %d\n", (int)Math.pow(10, i));
			for (int j = 0; j < nn; j++) {
				Merge_Shell merge = new Merge_Shell(true, (int)Math.pow(10, i));
				sumM = sumM +merge.getTime();
			}
			avgM = sumM/nn;
			System.out.printf("Merge Avg: %16.2f\n", avgM);
			System.out.printf("O(n*lg(n)) = %d\n", getMergeComp((int)Math.pow(10, i)));
			
			for (int j = 0; j < nn; j++) {
				Merge_Shell shell = new Merge_Shell(false, (int)Math.pow(10, i));
				sumS = sumS +shell.getShellTime();
			}
			avgS = sumS/nn;
			System.out.printf("Shell Avg : %15.2f\n", avgS);
			System.out.printf("O(n^2) = %d\n", getShellComp((int)Math.pow(10, i)));
		}
	}
	
	private long getMergeComp(int N) {
		 return N*((long) (Math.log(N) / Math.log(2)));
	}
	
	private long getShellComp(int N) {
		return (long)Math.pow(N, 2);
	}
	
	private int[] initArr(int arr[], int n) {
		int rand = r.nextInt(100)+0; // generates random number
		arr = new int[n]; // new instance of array with init size
		for (int i = 0; i < n; i++) {
			arr[i] = rand; // populates with random number 
			rand = r.nextInt(100)+0; // generates another new number
		} // endae for
		return arr; // returns the arr 
	} // endae initArr method
	
	  /* function to sort arr using shellSort */
    int ShellSort(int arr[]) { 
        int n = arr.length; 
        // Start with a big gap, then reduce the gap
        long start = System.nanoTime();
        for (int gap = n/2; gap > 0; gap /= 2) { 
            // Do a gapped insertion sort for this gap size. 
            // The first gap elements a[0..gap-1] are already 
            // in gapped order keep adding one more element 
            // until the entire array is gap sorted 
            for (int i = gap; i < n; i += 1) { 
                // add a[i] to the elements that have been gap 
                // sorted save a[i] in temp and make a hole at 
                // position i 
                int temp = arr[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap]; 
                }
                // put temp (the original a[i]) in its correct 
                // location 
                arr[j] = temp; 
            } 
        }
        setShellTime((int)(System.nanoTime()-start));
        return 0; 
    }
    
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void MargeSort(int arr[], int l, int r)  { 
        if (l < r)  { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves
            long start = System.nanoTime();
            MargeSort(arr, l, m); 
            MargeSort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
            setTime((int)(System.nanoTime() - start));
        } 
    }
    
    
    
    public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public int getShellTime() {
		return shellTime;
	}
	
	public void setShellTime(int shellTime) {
		this.shellTime = shellTime;
	}
    
}
