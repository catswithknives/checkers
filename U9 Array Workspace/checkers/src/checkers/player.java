package checkers;

import java.util.ArrayList;

import javax.swing.JLabel;

public abstract class player {

	static int x; 
	static int y;
	static ArrayList<JLabel> nPieces = new ArrayList<JLabel>(12);
	static String[][] Grid = new String[8][8];

	public abstract String checkUL(int x, int y);
	public abstract String checkUR(int x, int y);
	public abstract String checkDL(int x, int y); 
	public abstract String checkDR(int x, int y);

	public void createArray(ArrayList<JLabel> myArray, String[][] LaisynsArray){
		Grid = LaisynsArray;
	}
	public void jump(){
	}
	public abstract void move();
}
