package friends;

import java.io.*;
import java.util.*;

public abstract class binarySearch {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<String> Lname=new ArrayList<String>();
	static ArrayList<String> Fname=new ArrayList<String>();
	static ArrayList<String> Pnum=new ArrayList<String>();
	static ArrayList<String> Storage=new ArrayList<String>();

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("");

		String input = scanner.nextLine();

		//System.out.println(input);
		function(input);

	}
	public static void function(String text){
		if (text.toLowerCase().startsWith(".display"))
			display(text);
		if (text.toLowerCase().startsWith(".search"))
			search(text);
		if (text.toLowerCase().startsWith(".clear"))
			clear(text);
		if (text.toLowerCase().startsWith(".add"))
			add(text);
		if (text.toLowerCase().startsWith(".remove"))
			remove(text);
		if (text.toLowerCase().startsWith(".exit"))
			exit(text);
	}



	public static void display(String text){
		try {
			String token1 = "";
			Scanner txtFriends = new Scanner(new File("M:/workspace/U9 Array Workspace/friends/src/friends/txtFriends"));
			//Read: https://stackoverflow.com/questions/19844649/java-read-file-and-store-text-in-an-array
			List<String> temps = new ArrayList<String>();

			// while loop
			while (txtFriends.hasNext()) {
				// find next line
				token1 = txtFriends.next();
				temps.add(token1);
			}
			txtFriends.close();

			for (String s : temps) {
				//System.out.println(s);
			}
			int j=0;
			for (int i=0 ; i<(temps.size()/3); i++) {

				Lname.add(temps.get(j));
				j++;
				Fname.add(temps.get(j));
				j++;
				Pnum.add(temps.get(j));
				j++;
			}


		} catch (FileNotFoundException e) {
			System.out.println("NO WORk");
		}


		sort();
		String input = scanner.nextLine();
		function(input);

	}

	public static void search(String text){
		text = text.substring(7);

		int searching =(int) text.toLowerCase().charAt(0);




		// Java implementation of recursive Binary Search 
		class BinarySearch { 
			// Returns index of x if it is present in arr[l.. 
			// r], else return -1 
			int binarySearch(ArrayList<String> lname, int l, int r, int x) 
			{ 
				if (r >= l) { 
					int mid = l + (r - l) / 2; 

					// If the element is present at the 
					// middle itself 
					if ((int) lname.get(mid).toLowerCase().charAt(0) == x) {
						Storage.add(lname.get(mid));
						//for loop above, till letter != search
						int index = 1;
						while ((int) lname.get(mid+index).toLowerCase().charAt(0) == x){
							Storage.add(lname.get(mid+index));
							index++;
						}
						index =1;
							//for loop below mid, till letter != search
						while ((int) lname.get(mid-index).toLowerCase().charAt(0) == x){
							Storage.add(lname.get(mid-index));
							index--;
						}
					
							return mid; 
					}

					// If element is smaller than mid, then 
					// it can only be present in left subarray 
					if ((int) lname.get(mid).toLowerCase().charAt(0) > x) 
						return binarySearch(lname, l, mid - 1, x); 

					// Else the element can only be present 
					// in right subarray 
					return binarySearch(lname, mid + 1, r, x); 
				} 

				// We reach here when element is not present 
				// in array 
				return -1; 
			} 
		}
		BinarySearch ob = new BinarySearch(); 

		int n = Lname.size(); 
		int x = searching; 
		int result = ob.binarySearch(Lname, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 




		String input = scanner.nextLine();
		function(input);
	}
	public static void clear(String text){

		String input = scanner.nextLine();
		function(input);
	}
	public static void add(String text){

		//Write: https://stackoverflow.com/questions/1375217/saving-an-array-to-a-text-file-in-java
		String input = scanner.nextLine();
		function(input);
	}
	public static void remove(String text){

		String input = scanner.nextLine();
		function(input);
	}

	public static void sort(){
		int n = Lname.size();//checks how long the file is
		int asciiChar = 0;
		/**
		 * Bubble sort loop
		 */
		int i, j; 
		for (i = 0; i < n-1; i++) {
			// Last i elements are already in place    
			for (j = 0; j < n-i-1; j++)  {

				while((int) Lname.get(j).charAt(asciiChar) != (int) Lname.get(j+1).charAt(asciiChar))
					asciiChar++;
				System.out.println((int) Lname.get(j).charAt(0) >(int) Lname.get(j+1).charAt(0));


				if ((int) Lname.get(j).charAt(0) >(int) Lname.get(j+1).charAt(0)) { //if not same char

					String temp = Lname.get(j); 
					Lname.set(j,Lname.get(j+1)); 
					Lname.set(j+1,temp);
					temp = Fname.get(j); 
					Fname.set(j,Fname.get(j+1)); 
					Fname.set(j+1,temp);
					temp = Pnum.get(j); 
					Pnum.set(j,Pnum.get(j+1)); 
					Pnum.set(j+1,temp);
				}
			} 
		}
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Pnum);
	}


	public static void exit(String text){

	}


}
