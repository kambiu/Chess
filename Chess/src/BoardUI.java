import java.awt.Color;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;

import java.io.File;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class BoardUI extends JFrame {

	private JPanel contentPane;
	private Game theGame = new Game('R');
	private Round allRounds = new Round('R');
	Border border = BorderFactory.createLineBorder(Color.BLUE, 5);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardUI frame = new BoardUI();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public BoardUI() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Chess
		final JLabel chessG1 =new JLabel(new ImageIcon(ImageIO.read(new File("images/g1.png"))));
		chessG1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "new label", "Title"  , JOptionPane.INFORMATION_MESSAGE);
				//allRounds.chessClicked(theGame.myChess[0], chessG1);
				chessG1.setBorder(border);
			}
		});
		chessG1.setBounds(259, 237, 49, 49);
		contentPane.add(chessG1);
		// buttons
		JButton btnStart = new JButton("Start Game");
		btnStart.setFont(new Font("Arial", Font.PLAIN, 20));
		btnStart.setBounds(520, 350, 144, 57);
		contentPane.add(btnStart);
		
		/***** Board *****/
		JLabel lblBoard = new JLabel(new ImageIcon(ImageIO.read(new File("images/board.gif"))));
		lblBoard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, arg0.getPoint(), "Title"  , JOptionPane.INFORMATION_MESSAGE);
			    
			}
		});
		lblBoard.setBounds(10, 20, 500, 510);
		contentPane.add(lblBoard);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 578, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSubitem = new JMenuItem("SubItem1");
		mnFile.add(mntmSubitem);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnBk = new JMenu("bk");
		menuBar.add(mnBk);

	}
}
