import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Round {
	
	private char activePlayer;
	private boolean selected;
	
	public Round(char whosturn){
		this.activePlayer = whosturn;
		selected= false;
	}
	
	public void executeRound(){
		
	}
	
	public void endRoundOutput(){
		
	}
	
	
	
	// for GUI
	
	public void chessClicked(Chess selectedChess, JLabel uiChess){
		if (selected == true){    //already hightlight a chess
			
		} else {    //click to hightlight a chess
			if (selectedChess.color == activePlayer) {
				//highlightActiveChess(selectedChess);
				selected = true;
			} else 
				JOptionPane.showMessageDialog(null, "not ok", "Title"  , JOptionPane.INFORMATION_MESSAGE);
							
		}
	}
	
	private void highlightActiveChess(JLabel selectedChess) {
		
	
	}

	public void boardClicked(){
		
	}
}
