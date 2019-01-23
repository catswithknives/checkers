package checkers;

import java.util.ArrayList;

import javax.swing.JLabel;

public abstract class player {

	static int x; 
	static int y;
	static ArrayList<JLabel> nPieces = new ArrayList<JLabel>(12);
	static String[][] Grid = new String[8][8];


	public String testpoi(int x, int y){
		System.out.println((Grid [x-1][y-1]));
		System.out.println((Grid [x-1][y-1]).toString() == "white" );
		try{
			if (Grid [x-1][y-1] == null)
				return "canMove";
			else if (Grid [x-1][y-1] == "white")
				return "noMove";
			else {
				try{
				if (Grid [x-2][y-2] == null)
					return "canJump";
				else 
					return "noJump";
				} catch(Exception err) {
					return "noJump";
				}
			}
		}
		catch(Exception err) {
			return "noMove";
		}
	}

	public abstract void canMove();

	public void canJump(){
		//nPieces.add(new nPiece());
	}
	public void createArray(ArrayList<JLabel> myArray, String[][] LaisynsArray){
		nPieces = myArray;
		Grid = LaisynsArray;

		//System.out.println(nPieces.get(0).getX());
	}
	public void jump(){

	}
	public abstract void move();
	public boolean canMoveUL(){
		//System.out.println(nPieces.size() + "   8--D size");
		for (int i=0; i<nPieces.size(); i++) {
			//System.out.println(x + ", "+y + "--" + nPieces.get(i).getX() + ", " + nPieces.get(i).getY());
			if (x==nPieces.get(i).getX() && y== nPieces.get(i).getY()) {
				//System.out.println("Same piece");
			}
			else if (x-42==nPieces.get(i).getX() && y-42 ==nPieces.get(i).getY())
				//System.out.println("Not same");
				return false;
		}
		return true;
	}

	public boolean canMoveUR(){
		//System.out.println(nPieces.size() + "   8--D size");
		for (int i=0; i<nPieces.size(); i++) {
			//System.out.println(x + ", "+y + "--" + nPieces.get(i).getX() + ", " + nPieces.get(i).getY());
			if (x==nPieces.get(i).getX() && y== nPieces.get(i).getY()) {
				//System.out.println("Same piece");
			}
			else if (x+42==nPieces.get(i).getX() && y-42 ==nPieces.get(i).getY())
				//System.out.println("Not same");
				return false;
		}
		return true;
	}

	public boolean canMoveDL(){
		//System.out.println(nPieces.size() + "   8--D size");
		for (int i=0; i<nPieces.size(); i++) {
			//System.out.println(x + ", "+y + "--" + nPieces.get(i).getX() + ", " + nPieces.get(i).getY());
			if (x==nPieces.get(i).getX() && y== nPieces.get(i).getY()) {
				//System.out.println("Same piece");
			}
			else if (x-42==nPieces.get(i).getX() && y+42 ==nPieces.get(i).getY())
				//System.out.println("Not same");
				return false;
		}
		return true;
	}

	public boolean canMoveDR(){
		//System.out.println(nPieces.size() + "   8--D size");
		for (int i=0; i<nPieces.size(); i++) {
			//System.out.println(x + ", "+y + "--" + nPieces.get(i).getX() + ", " + nPieces.get(i).getY());
			if (x==nPieces.get(i).getX() && y== nPieces.get(i).getY()) {
				//System.out.println("Same piece");
			}
			else if (x+42==nPieces.get(i).getX() && y+42 ==nPieces.get(i).getY())
				//System.out.println("Not same");
				return false;
		}
		return true;
	}

	public void setX(int X){
		x = X;
	}
	public void setY(int Y){
		y = Y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}


}
