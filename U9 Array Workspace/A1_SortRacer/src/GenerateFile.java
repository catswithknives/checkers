import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class GenerateFile {

	private String fName;  //represents name of the file
	private int fSize; //represents the size of the file
	private int min; //the minimum random number
	private int max;  //the maximum random number

	/**
	 * 
	 * @param fN file Name
	 * @param s file size
	 * @param low lowest number in the file
	 * @param high highest number in the file
	 */
	public GenerateFile(String fN, int s, int low, int high) {
		fName=fN;
		fSize = s;
		min = low;
		max = high;
	}

	public int getFSize(){
		return fSize;
	}

	/**
	 * Creates the file based on constructor inputs.
	 */
	public void Create(){

		int rNum =0; //random number between min and max (inclusive)

		File f = new File(fName);  //creates file object for fName

		try {
			PrintWriter pw = new PrintWriter (f);

			//generate a list of random numbers given by file size
			for (int c =0; c<fSize;c++){
				rNum = (int) (Math.floor(Math.random() *(max-min+1)) +min);
				pw.println(rNum);  //writes the number to the file
			}


			pw.close();  //closes the stream writer

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File "+fName+" cannot be created!");
		}  //creates an output stream file



	}


}
