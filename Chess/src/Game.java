import java.util.Arrays;
public class Game {
	
	//private static boolean checked; need to predict next movement // to be implemented
	
	private int roundCnt;
	private static char whosturn;
	boolean conquerMove, gameOver; 
	
	Chess[] myChess;
	BoardPoints[] points;
	
	
	public Game(char whosturn){
		roundCnt=0;
		this.whosturn = whosturn;
		myChess = null;
		points = null;
		conquerMove= false;
		gameOver = false;
		//checked = false;
	}
	
	public void startGame(){
		initGame();
		
		while (gameOver != true){
			loopRounds();
		}
		
		// endGame();   // to be implemented
	}
	
	private void loopRounds() {
		Round existingRound =  new Round(whosturn);
		existingRound.executeRound();
		existingRound.endRoundOutput();
		roundCnt++;
		if (whosturn == 'R')
			whosturn = 'B';
		else
			whosturn = 'R';
		
	}

	@SuppressWarnings("null")
	private void initGame() {		
		//init chess
		
		myChess[0] = new Chess(0, 'R', "king", "A4");	
		myChess[1] = new Chess(1, 'R', "rooks","A0");
		myChess[2] = new Chess(2, 'R', "rooks","A8");
		myChess[3] = new Chess(3, 'R', "knights","A1");
		myChess[4] = new Chess(4, 'R', "knights","A7");
		myChess[5] = new Chess(5, 'R', "cannons","C1");
		myChess[6] = new Chess(6, 'R', "cannons","C7");
		myChess[7] = new Chess(7, 'R', "guards","A3");
		myChess[8] = new Chess(8, 'R', "guards","A5");
		myChess[9] = new Chess(9, 'R', "elephants","A2");
		myChess[10] = new Chess(10, 'R', "elephants","A6");
		myChess[11] = new Chess(11, 'R', "minions","D0");
		myChess[12] = new Chess(12, 'R', "minions","D2");
		myChess[13] = new Chess(13, 'R', "minions","D4");
		myChess[14] = new Chess(14, 'R', "minions","D6");
		myChess[15] = new Chess(15, 'R', "minions","D8");
		
		myChess[16] = new Chess(0, 'B', "king", "J4");	
		myChess[17] = new Chess(1, 'B', "rooks","J0");
		myChess[18] = new Chess(2, 'B', "rooks","J8");
		myChess[19] = new Chess(3, 'B', "knights","J1");
		myChess[20] = new Chess(4, 'B', "knights","J7");
		myChess[21] = new Chess(5, 'B', "cannons","H1");
		myChess[22] = new Chess(6, 'B', "cannons","H7");
		myChess[23] = new Chess(7, 'B', "guards","J3");
		myChess[24] = new Chess(8, 'B', "guards","J5");
		myChess[25] = new Chess(9, 'B', "elephants","J2");
		myChess[26] = new Chess(10, 'B', "elephants","J6");
		myChess[27] = new Chess(11, 'B', "minions","G0");
		myChess[28] = new Chess(12, 'B', "minions","G2");
		myChess[29] = new Chess(13, 'B', "minions","G4");
		myChess[30] = new Chess(14, 'B', "minions","G6");
		myChess[31] = new Chess(15, 'B', "minions","G8");
		
		
		//init board
		points[0] = new BoardPoints("A0", 'R', "rooks");
		points[1] = new BoardPoints("A1", 'R', "knights");
		points[2] = new BoardPoints("A2", 'R', "elephants");
		points[3] = new BoardPoints("A3", 'R', "guards");
		points[4] = new BoardPoints("A4", 'R', "king");
		points[5] = new BoardPoints("A5", 'R', "guards");
		points[6] = new BoardPoints("A6", 'R', "elephants");
		points[7] = new BoardPoints("A7", 'R', "knights");
		points[8] = new BoardPoints("A8", 'R', "rooks");
		points[9] = new BoardPoints("B0", 'N', "");
		points[10] = new BoardPoints("B1", 'N', "");
		points[11] = new BoardPoints("B2", 'N', "");
		points[12] = new BoardPoints("B3", 'N', "");
		points[13] = new BoardPoints("B4", 'N', "");
		points[14] = new BoardPoints("B5", 'N', "");
		points[15] = new BoardPoints("B6", 'N', "");
		points[16] = new BoardPoints("B7", 'N', "");
		points[17] = new BoardPoints("B8", 'N', "");				
		points[18] = new BoardPoints("C0", 'N', "");
		points[19] = new BoardPoints("C1", 'R', "cannons");
		points[20] = new BoardPoints("C2", 'N', "");
		points[21] = new BoardPoints("C3", 'N', "");
		points[22] = new BoardPoints("C4", 'N', "");
		points[23] = new BoardPoints("C5", 'N', "");
		points[24] = new BoardPoints("C6", 'N', "");
		points[25] = new BoardPoints("C7", 'R', "cannons");
		points[26] = new BoardPoints("C8", 'N', "");				
		points[27] = new BoardPoints("D0", 'R', "minions");
		points[28] = new BoardPoints("D1", 'N', "");
		points[29] = new BoardPoints("D2", 'R', "minions");
		points[30] = new BoardPoints("D3", 'N', "");
		points[31] = new BoardPoints("D4", 'R', "minions");
		points[32] = new BoardPoints("D5", 'N', "");
		points[33] = new BoardPoints("D6", 'R', "minions");
		points[34] = new BoardPoints("D7", 'N', "");
		points[35] = new BoardPoints("D8", 'R', "minions");				
		points[36] = new BoardPoints("E0", 'N', "");
		points[37] = new BoardPoints("E1", 'N', "");
		points[38] = new BoardPoints("E2", 'N', "");
		points[39] = new BoardPoints("E3", 'N', "");
		points[40] = new BoardPoints("E4", 'N', "");
		points[41] = new BoardPoints("E5", 'N', "");
		points[42] = new BoardPoints("E6", 'N', "");
		points[43] = new BoardPoints("E7", 'N', "");
		points[44] = new BoardPoints("E8", 'N', "");				
		points[45] = new BoardPoints("F0", 'N', "");
		points[46] = new BoardPoints("F1", 'N', "");
		points[47] = new BoardPoints("F2", 'N', "");
		points[48] = new BoardPoints("F3", 'N', "");
		points[49] = new BoardPoints("F4", 'N', "");
		points[50] = new BoardPoints("F5", 'N', "");
		points[51] = new BoardPoints("F6", 'N', "");
		points[52] = new BoardPoints("F7", 'N', "");
		points[53] = new BoardPoints("F8", 'N', "");				
		points[54] = new BoardPoints("G0", 'B', "minions");
		points[55] = new BoardPoints("G1", 'N', "");
		points[56] = new BoardPoints("G2", 'B', "minions");
		points[57] = new BoardPoints("G3", 'N', "");
		points[58] = new BoardPoints("G4", 'B', "minions");
		points[59] = new BoardPoints("G5", 'N', "");
		points[60] = new BoardPoints("G6", 'B', "minions");
		points[61] = new BoardPoints("G7", 'N', "");
		points[62] = new BoardPoints("G8", 'B', "minions");				
		points[63] = new BoardPoints("H0", 'N', "");
		points[64] = new BoardPoints("H1", 'B', "cannons");
		points[65] = new BoardPoints("H2", 'N', "");
		points[66] = new BoardPoints("H3", 'N', "");
		points[67] = new BoardPoints("H4", 'N', "");
		points[68] = new BoardPoints("H5", 'N', "");
		points[69] = new BoardPoints("H6", 'N', "");
		points[70] = new BoardPoints("H7", 'B', "cannons");
		points[71] = new BoardPoints("H8", 'N', "");				
		points[72] = new BoardPoints("I0", 'N', "");
		points[73] = new BoardPoints("I1", 'N', "");
		points[74] = new BoardPoints("I2", 'N', "");
		points[75] = new BoardPoints("I3", 'N', "");
		points[76] = new BoardPoints("I4", 'N', "");
		points[77] = new BoardPoints("I5", 'N', "");
		points[78] = new BoardPoints("I6", 'N', "");
		points[79] = new BoardPoints("I7", 'N', "");
		points[80] = new BoardPoints("I8", 'N', "");				
		points[81] = new BoardPoints("J0", 'B', "rooks");
		points[82] = new BoardPoints("J1", 'B', "knights");
		points[83] = new BoardPoints("J2", 'B', "elephants");
		points[84] = new BoardPoints("J3", 'B', "guards");
		points[85] = new BoardPoints("J4", 'B', "king");
		points[86] = new BoardPoints("J5", 'B', "guards");
		points[87] = new BoardPoints("J6", 'B', "elephants");
		points[88] = new BoardPoints("J7", 'B', "knights");
		points[89] = new BoardPoints("J8", 'B', "rooks");		
	}

	public boolean validMove(Chess movedChess, String targetLocation){
		if (!isMyTurn(movedChess.color)) return false;
		if (!rightPath(movedChess, targetLocation)) return false; 
		if (detectBlocks(movedChess, targetLocation)) return false; 

		return true;
	}
	
	
	private boolean rightPath(Chess movedChess, String targetLocation) {
		
		int[]executingMovement= new int[2];
		int[][] tempStep=null;
		
		//king, knights, guards, elephants, guards and minions
		
		if(movedChess.word.equals("king") || movedChess.word.equals("knights")){  //getKing
		
			if (movedChess.word.equals("king"))
				tempStep = movedChess.getKingMovement();  //getKing
			else if (movedChess.word.equals("knights"))
				tempStep = movedChess.getKnightMovement(); // getKnight
			else if (movedChess.word.equals("guards"))
				tempStep = movedChess.getGuardsMovement(); // getGuards
			else if (movedChess.word.equals("elephants"))
				tempStep = movedChess.getElephantsMovement(); // getGuards
			else if (movedChess.word.equals("minions"))
				tempStep = movedChess.getMinionsMovement();
			
			//calculate the steps
			executingMovement[0] = targetLocation.charAt(0) - movedChess.location.charAt(0);
			executingMovement[1] = targetLocation.charAt(1) - movedChess.location.charAt(1);
		
			//check whether it is a valid movement without blocks
			for(int i=0; i<tempStep.length;i++){
				if (Arrays.equals(executingMovement, tempStep[i]))
					return true;
			}			
		}
		
		//rooks and cannons
		
		else if(movedChess.word.equals("rooks") || movedChess.word.equals("cannons")){
			executingMovement[0] = targetLocation.charAt(0) - movedChess.location.charAt(0);
			executingMovement[1] = targetLocation.charAt(1) - movedChess.location.charAt(1);
		
			if(executingMovement[0]==0 || executingMovement[0]==0) // if 0,0 detect the target location w/ block of self
					return true;			
		}
		
		// if nothing true
		return false;
	}



	private boolean detectBlocks(Chess movedChess, String targetLocation) {
		
		boolean hasBlocks = true, noBlocks = false;

		BoardPoints oLocation = null;
		
		//check target location blocks by allied chess
		for (int i=0; i<points.length; i++){
			if (points[i].uiLocation.equals(targetLocation))
				oLocation = points[i];				
		}	
		if (oLocation!= null){
			if (oLocation.side == movedChess.color)
				return hasBlocks;
			else if (oLocation.side != 'N')
				conquerMove = true;
		} else {
			return hasBlocks;
		}
			
		if (movedChess.word.equals("general")||movedChess.word.equals("guards")){
			if (isOutCenter(movedChess, targetLocation))
				return hasBlocks;
				
		} else if (movedChess.word.equals("rooks")){
			if (chkBlocksBetween(movedChess.location, targetLocation) > 0)
				return hasBlocks;
				
		} else if (movedChess.word.equals("knights")){
			if (chkKnightsAndElephantsBlocks(movedChess, targetLocation))
				return hasBlocks;

		} else if (movedChess.word.equals("cannons")){		
			if ( conquerMove = true){
				if (chkBlocksBetween(movedChess.location, targetLocation) != 1)
					return hasBlocks;
			} else {
				if (chkBlocksBetween(movedChess.location, targetLocation) > 0)
					return hasBlocks;
			}
			
		} else if (movedChess.word.equals("elephants")){
			if (isEnemySide(movedChess, targetLocation))
				return hasBlocks;		
			if (chkKnightsAndElephantsBlocks(movedChess, targetLocation))
				return hasBlocks;
				
		} else if (movedChess.word.equals("minions")) {
			if (isEnemySide(movedChess, movedChess.location) == false) // my side
				if (movedChess.location.charAt(1) != targetLocation.charAt(1))
				return hasBlocks;
		} else
			return hasBlocks; //error entry
		return noBlocks;
	}

	int chkBlocksBetween(String ptA, String ptB){
		int count=0;
		int min=0, max=0;
		char fixed= 0;
		if (ptA.charAt(0) == ptB.charAt(0)){
			fixed = ptA.charAt(0);
			if ((int)(ptA.charAt(1)) < (int)(ptB.charAt(1))){
				min = (int)(ptA.charAt(1));
				max = (int)(ptB.charAt(1));
			}else{
				min = (int)(ptB.charAt(1));
				max = (int)(ptA.charAt(1));
			}
			
			for(int i=min+1; i<max; i++){
				if (occupiedAt(new String(fixed+""+i)))
					count++;			
			}
		}else if (ptA.charAt(1) == ptB.charAt(1)){
			fixed = ptA.charAt(1);
			if ((int)(ptA.charAt(0)) < (int)(ptB.charAt(0))){
				min = (int)(ptA.charAt(0));
				max = (int)(ptB.charAt(0));
			}else{
				min = (int)(ptB.charAt(0));
				max = (int)(ptA.charAt(0));
			}
			
			for(int i=min+1; i<max; i++){
				if (occupiedAt(new String(i+""+fixed)))
					count++;
			}
		}	
		return count;
	}

	boolean occupiedAt(String chkPosition){
		for(int i=0; i<points.length; i++){
			if (points[i].uiLocation.equals(chkPosition)){
				return true;
			}
		}
		return false;	
	}

	boolean isEnemySide(Chess object, String chkPosition){
		if (object.color == 'R'){
			if ("FGHIJ".indexOf(chkPosition.charAt(0)) != -1)
				return true;
		} else if (object.color == 'B'){
			if ("ABCDE".indexOf(chkPosition.charAt(0)) != -1)
				return true;
		} 
		return false;	
	}

	boolean isOutCenter(Chess object, String chkPosition){
		if (object.color == 'B')
			if (chkPosition.charAt(0)< 'H' || chkPosition.charAt(1) > 5 || chkPosition.charAt(1) < 3){
				return true;
			}
		else if (object.color == 'R')
			if (chkPosition.charAt(0)> 'C' || chkPosition.charAt(1) > 5 || chkPosition.charAt(1) < 3){
				return true;
			}
		else
			return true;
		return false;
	}

	boolean chkKnightsAndElephantsBlocks(Chess object, String chkPosition){
		int chessAlpha=0, chessNum=0, locationAlpha=0, locationNum=0, temp=0, temp2= 0;;
		chessAlpha = (int)object.location.charAt(0);
		chessNum = (int)object.location.charAt(1);
		locationAlpha = (int)chkPosition.charAt(0);
		locationNum = (int)chkPosition.charAt(1);
		
		if (object.word.equals("knights")){
			if (Math.abs(chessAlpha - locationAlpha) == 2){
				temp = (int)((chessAlpha + locationAlpha)/2);
				if (occupiedAt(new String(temp+""+chessNum)))
					return true;
			} else if (Math.abs(chessNum - locationNum) == 2){
				temp = (int)((chessNum + locationNum)/2);
				if (occupiedAt(new String(chessAlpha+""+temp)))
					return true;
			} else
				return true; //error entry
				
		} else if (object.word.equals("elephants")) {
			temp = (int)((chessAlpha+locationAlpha)/2);
			temp2 = (int)((chessNum+locationNum)/2);
			if (occupiedAt(new String(temp+""+temp2)))
					return true;
		}
		return false;
	}

	private boolean isMyTurn(char color) {
		if (color == whosturn){
			return true;
		}else{
			return false;
		}
		
	}
	
}
