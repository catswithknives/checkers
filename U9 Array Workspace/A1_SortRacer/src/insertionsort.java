/**
 * 
 * @author Sean, Laisyn, Mason
 * sorts numbers using insertion sort
 */
public class insertionsort {
	private int[] sArray;  //sorted array
	private double sTime;   //the time required for the sort

	/**
	 * 
	 * @param uList
	 */
	public insertionsort(int[] uList) {
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
	 * @return time to sort using insertion sort.
	 */
	public double getSTime(){
		return sTime;//return insertion time
	}


	//sorts uArray via the insertion Sort Algorithm
	public void Sort() {
		// TODO Auto-generated method stub
		double iTime = System.nanoTime();  //current system time in nanoseconds
		int n = sArray.length;//check file length
		
		 int i, key, j; 
		   for (i = 1; i < n; i++) 
		   { 
		       key = sArray[i]; 
		       j = i-1; 
		  
		       /* Move elements of arr[0..i-1], that are 
		          greater than key, to one position ahead 
		          of their current position */
		       while (j >= 0 && sArray[j] > key) 
		       { 
		    	   sArray[j+1] = sArray[j]; 
		           j = j-1; 
		       } 
		       sArray[j+1] = key; 
		   } 
		
		
		sTime = System.nanoTime() - iTime;//time insertion sort took
	} 
}
