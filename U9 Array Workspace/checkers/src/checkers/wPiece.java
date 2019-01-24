package checkers;

public class wPiece extends player {

	public wPiece() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String checkUL(int x, int y) {
		try{
			if (Grid [x-1][y-1] == null)
				return "canMove";
			else if (Grid [x-1][y-1] == "White")
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
		} catch(Exception err) {
			return "noMove";
		}
	}



	@Override
	public String checkUR(int x, int y) {
		try{
			if (Grid [x+1][y-1] == null)
				return "canMove";
			else if (Grid [x+1][y-1] == "White")
				return "noMove";
			else {
				try{
					if (Grid [x+2][y-2] == null)
						return "canJump";
					else 
						return "noJump";
				} catch(Exception err) {
					return "noJump";
				}
			}
		} catch(Exception err) {
			return "noMove";
		}
	}



	@Override
	public String checkDL(int x, int y) {
		try{
			if (Grid [x-1][y+1] == null)
				return "canMove";
			else if (Grid [x-1][y+1] == "White")
				return "noMove";
			else {
				try{
					if (Grid [x-2][y+2] == null)
						return "canJump";
					else 
						return "noJump";
				} catch(Exception err) {
					return "noJump";
				}
			}
		} catch(Exception err) {
			return "noMove";
		}
	}



	@Override
	public String checkDR(int x, int y) {
		try{
			if (Grid [x+1][y+1] == null)
				return "canMove";
			else if (Grid [x+1][y+1] == "White")
				return "noMove";
			else {
				try{
					if (Grid [x+2][y+2] == null)
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

}
