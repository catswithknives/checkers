import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Sean, Laisyn, Mason
 *a file consisting of 1000 numbers is sorted into order by three sorting techniques
 */
public class Main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generate a random file 100000 random numbers from -200 to 200

		GenerateFile gF = new GenerateFile ("nums.txt",1000,-200,200);

		System.out.println("Generating file ....");
		gF.Create();  //creates the file
		System.out.println("Done! See if it worked");
		//pause program for 2s
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File f = new File("nums.txt"); //creates a file object nums.txt
		Scanner s; 

		int [] uList1 = new int[gF.getFSize()];  //the unsorted data arrays
		int [] uList2 = new int[gF.getFSize()];
		int [] uList3 = new int[gF.getFSize()];

		int pos =0;  //position into uList array

		if (f.exists()){
			try {
				s = new Scanner (f);  //creates a new input stream to file
				int n; //given number in file
				while (s.hasNext()){
					n= s.nextInt();
					uList1[pos] = n;
					uList2[pos] = n;
					uList3[pos] = n;
					//	System.out.println(uList1[pos]); //retrieves next number
					pos++;  //update position into the array
				}
				s.close();  //close input stream
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("No file found");
		}


		//SELECTION SORT STARTS
		SelectionSort ss = new SelectionSort(uList1);  // Selection Sort class

		ss.Sort();  //sort uList via Bubble sort algorithm
		//return the Bubble sort time

		int[] sList1;
		sList1 = ss.getSArray(); //returns the sorted array for testing

		//display values of sorted list 1 along with sort time
		System.out.println("Selection Sort:");
		//pause program for 2s
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int p = 0;p<sList1.length;p++){
			//System.out.println(sList1[p]);
		}
		System.out.println(ss.getSTime());


		//BUBBLE SORT STARTS
		BubbleSort bs= new BubbleSort(uList2);  //sort uList via Bubble sort algorithm
		bs.Sort();
		//bs.getSTime(); //return the Bubble sort time

		int[] sList2;
		sList2 = bs.getSArray(); //returns the sorted array for testing

		System.out.println("Bubble Sort:");  //prints sorted list from bubble sort
		//pause program for 2s

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i: sList2){
			//System.out.println(i);
		}
		System.out.println(bs.getSTime());

		
		//INSERTION SORT STARTS
		insertionsort is= new insertionsort(uList3);  //sort uList via Bubble sort algorithm
		is.Sort();
		//bs.getSTime(); //return the Bubble sort time

		int[] sList3;
		sList3 = is.getSArray(); //returns the sorted array for testing

		System.out.println("Insertion Sort:");  //prints sorted list from bubble sort
		//pause program for 2s

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i: sList3){
			//System.out.println(i);
		}
		System.out.println(is.getSTime());

		
	}


	
}


