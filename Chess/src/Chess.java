
public class Chess {
	private int id;
	public char color;
	public String word;		
	public String location;
	
	public Chess(int a, char b, String c, String d ){
		id=a;
		color=b;
		word=c;
		location = d;		
	}


	public String setLocation() {
		return null;
	}
	
	//Movement List
	public int[][] getKingMovement(){
		return new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}};
	}
	
	public int[][] getKnightMovement(){
		return new int[][] {{1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1}, {-2,1}, {-1,2}};

	}
	
	public int[][] getGuardsMovement(){
		return new int[][]{{1,1}, {1,-1}, {-1,-1}, {-1,1}};	
	}
	
	public int[][] getElephantsMovement(){
		return new int[][]{{2,2}, {2,-2}, {-2,-2}, {-2,2}};	
	}
	
	public int[][] getMinionsMovement(){
		return new int[][]{{0,1}, {1,0}, {-1,0}};	
	}
//	//getter
//	public int getID(){
//		return id;
//	}
//	public char getColor(){
//		return color;
//	}
//	public String getWord(){
//		return word;
//	}
//
//	public String getLocation(){
//		return location;
//	}
}

