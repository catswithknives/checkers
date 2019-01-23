/**
 * 
 * @author Mason, Laisyn, Sean
 * sorts numbers using bubble sort
 */
public class BubbleSort {

	private int[] sArray;  //sorted array
	private double sTime;   //the time required for the sort

	/**
	 * 
	 * @param uList
	 */
	public BubbleSort(int[] uList) {
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
	 * @return time to sort using Bubble sort.
	 */
	public double getSTime(){
		return sTime;
	}


	//sorts uArray via the Bubble Sort Algorithm
	public void Sort() {
		// TODO Auto-generated method stub
		double iTime = System.nanoTime();  //current system time in nanoseconds
		int n = sArray.length;//checks how long the file is
		/**
		 * Bubble sort loop
		 */
		int i, j; 
		for (i = 0; i < n-1; i++)       {
			// Last i elements are already in place    
			for (j = 0; j < n-i-1; j++)  {
				if (sArray[j] > sArray[j+1]) {
					int temp = sArray [j]; 
					sArray[j] = sArray[j+1]; 
					sArray[j+1] = temp;
				}
			}
		}
		sTime = System.nanoTime() - iTime;//How long it took to sort
	}


}
