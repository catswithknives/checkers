/**
 * 
 * @author Laisyn, Sean, Mason
 *
 */
public class SelectionSort {
	private int[] sArray;  //sorted array
	private double sTime;   //the time required for the sort
	
	/**
	 * 
	 * @param uList
	 */
	public SelectionSort(int[] uList) {
		// TODO Auto-generated constructor stub
		sArray = uList;
		sTime = 0;
	}

	/**
	 * 
	 * @return the Sorted Array via method called
	 */
	public int[] getSArray(){
		return sArray;
	}

	
	/**
	 * 
	 * @return the sort time
	 */
	public double getSTime(){
		return sTime;
	}


	/**
	 * Sorts the array in ascending order and calculates time.
	 */

	public void Sort() {
		// TODO Auto-generated method stub
		double iTime = System.nanoTime();  //current system time in nanoseconds
 
		    int i, j, min_idx; 
		    int n = sArray.length;
		    
		    // One by one move boundary of unsorted subarray 
		    for (i = 0; i < n-1; i++) 
		    { 
		        // Find the minimum element in unsorted array 
		        min_idx = i; 
		        for (j = i+1; j < n; j++) 
		          if (sArray[j] < sArray[min_idx]) 
		            min_idx = j; 
		  
		        // Swap the found minimum element with the first element 
		        int temp = sArray[min_idx]; 
		        sArray[min_idx] = sArray[i]; 
		        sArray[i] = temp; 
		    } 

		sTime = System.nanoTime() - iTime;//Time selection sort took to complete
		
	}
	
}
