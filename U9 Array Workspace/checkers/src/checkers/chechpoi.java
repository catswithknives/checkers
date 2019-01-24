package checkers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chechpoi {

	private JFrame frame;
	private JTextField txtfWinner;
	private String mover;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chechpoi window = new chechpoi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chechpoi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		ArrayList<JLabel> nPieces = new ArrayList<JLabel>(12);	


		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(160, 82, 45));
		frame.setForeground(new Color(139, 69, 19));
		frame.setBounds(100, 100, 415, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSpace1 = new JLabel(" []");
		lblSpace1.setIcon(new ImageIcon("G:\\Downloads\\blue.png"));
		lblSpace1.setForeground(Color.BLUE);
		lblSpace1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSpace1.setBackground(Color.BLUE);
		//lblSpace1.setForeground(new Color(135, 206, 250));
		lblSpace1.setBounds(331, 161, 35, 35);
		lblSpace1.setVisible(false);
		frame.getContentPane().add(lblSpace1);

		JLabel lblSpace2 = new JLabel(" []");
		lblSpace2.setIcon(new ImageIcon("G:\\Downloads\\blue.png"));
		lblSpace2.setForeground(Color.BLUE);
		lblSpace2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSpace2.setBackground(Color.BLUE);
		lblSpace2.setBounds(331, 161, 35, 35);
		lblSpace2.setVisible(false);
		frame.getContentPane().add(lblSpace2);

		JLabel lblSpace3 = new JLabel(" []");
		lblSpace3.setIcon(new ImageIcon("M:\\Downloads\\blue.png"));
		lblSpace3.setForeground(Color.BLUE);
		lblSpace3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSpace3.setBackground(Color.BLUE);
		lblSpace3.setBounds(331, 161, 35, 35);
		lblSpace3.setVisible(false);
		frame.getContentPane().add(lblSpace3);

		JLabel lblSpace4 = new JLabel(" []");
		lblSpace4.setIcon(new ImageIcon("M:\\Downloads\\blue.png"));
		lblSpace4.setForeground(Color.BLUE);
		lblSpace4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSpace4.setBackground(Color.BLUE);
		lblSpace4.setBounds(331, 161, 35, 35);
		lblSpace4.setVisible(false);
		frame.getContentPane().add(lblSpace4);

		JLabel lblwhite1 = new JLabel("");
		lblwhite1.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite1.setBounds(78, 327, 35, 35);
		frame.getContentPane().add(lblwhite1);

		JLabel lblwhite2 = new JLabel("");
		lblwhite2.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite2.setBounds(162, 327, 35, 35);
		frame.getContentPane().add(lblwhite2);

		JLabel lblwhite3 = new JLabel("");
		lblwhite3.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite3.setBounds(246, 327, 35, 35);
		frame.getContentPane().add(lblwhite3);

		JLabel lblwhite4 = new JLabel("");
		lblwhite4.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite4.setBounds(330, 327, 35, 35);
		frame.getContentPane().add(lblwhite4);

		JLabel lblwhite5 = new JLabel("");
		lblwhite5.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite5.setBounds(36, 285, 35, 35);
		frame.getContentPane().add(lblwhite5);

		JLabel lblwhite6 = new JLabel("");
		lblwhite6.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite6.setBounds(120, 285, 35, 35);
		frame.getContentPane().add(lblwhite6);

		JLabel lblwhite7 = new JLabel("");
		lblwhite7.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite7.setBounds(204, 285, 35, 35);
		frame.getContentPane().add(lblwhite7);

		JLabel lblwhite8 = new JLabel("");
		lblwhite8.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite8.setBounds(288, 285, 35, 35);
		frame.getContentPane().add(lblwhite8);

		JLabel lblwhite9 = new JLabel("");
		lblwhite9.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite9.setBounds(78, 243, 35, 35);
		frame.getContentPane().add(lblwhite9);

		JLabel lblBlack1 = new JLabel("");
		lblBlack1.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack1.setBounds(36, 31, 35, 35);
		frame.getContentPane().add(lblBlack1);

		JLabel lblBlack9 = new JLabel("");
		lblBlack9.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack9.setBounds(36, 117, 35, 35);
		frame.getContentPane().add(lblBlack9);

		JLabel lblwhite10 = new JLabel("");
		lblwhite10.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite10.setBounds(162, 243, 35, 35);
		frame.getContentPane().add(lblwhite10);

		JLabel lblwhite11 = new JLabel("");
		lblwhite11.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite11.setBounds(246, 243, 35, 35);
		frame.getContentPane().add(lblwhite11);

		JLabel lblwhite12 = new JLabel("");
		lblwhite12.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\white pieces.jpg"));
		lblwhite12.setBounds(330, 243, 35, 35);
		frame.getContentPane().add(lblwhite12);

		JLabel lblBlack5 = new JLabel("");
		lblBlack5.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack5.setBounds(78, 75, 35, 35);
		frame.getContentPane().add(lblBlack5);

		JLabel lblBlack2 = new JLabel("");
		lblBlack2.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack2.setBounds(120, 31, 35, 35);
		frame.getContentPane().add(lblBlack2);

		JLabel lblBlack3 = new JLabel("");
		lblBlack3.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack3.setBounds(204, 31, 35, 35);
		frame.getContentPane().add(lblBlack3);

		JLabel lblBlack4 = new JLabel("");
		lblBlack4.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack4.setBounds(288, 31, 35, 35);
		frame.getContentPane().add(lblBlack4);

		JLabel lblBlack6 = new JLabel("");
		lblBlack6.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack6.setBounds(162, 75, 35, 35);
		frame.getContentPane().add(lblBlack6);

		JLabel lblBlack10 = new JLabel("");
		lblBlack10.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack10.setBounds(120, 117, 35, 35);
		frame.getContentPane().add(lblBlack10);

		JLabel lblBlack11 = new JLabel("");
		lblBlack11.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack11.setBounds(204, 117, 35, 35);
		frame.getContentPane().add(lblBlack11);

		JLabel lblBlack7 = new JLabel("");
		lblBlack7.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack7.setBounds(246, 75, 35, 35);
		frame.getContentPane().add(lblBlack7);

		JLabel lblBlack12 = new JLabel("");
		lblBlack12.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack12.setBounds(288, 117, 35, 35);
		frame.getContentPane().add(lblBlack12);

		JLabel lblBlack8 = new JLabel("");
		lblBlack8.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\black piece.jpg"));
		lblBlack8.setBounds(330, 75, 35, 35);
		frame.getContentPane().add(lblBlack8);

		JLabel lblBackground = new JLabel("New label");
		lblBackground.setBackground(Color.BLUE);
		lblBackground.setIcon(new ImageIcon("M:\\Downloads\\Downloads\\checker board2.jpg"));
		lblBackground.setBounds(0, 0, 400, 395);
		frame.getContentPane().add(lblBackground);

		JButton btnNewButton = new JButton("Start");

		btnNewButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(106, 399, 200, 35);
		frame.getContentPane().add(btnNewButton);

		txtfWinner = new JTextField();
		txtfWinner.setFont(new Font("Rockwell", Font.PLAIN, 15));
		txtfWinner.setText(" ");
		txtfWinner.setBounds(153, 269, 86, 20);
		frame.getContentPane().add(txtfWinner);
		txtfWinner.setColumns(10);
		txtfWinner.setEnabled(false);
		txtfWinner.setVisible(false);
		JTextArea txtrHowToPlay = new JTextArea();
		txtrHowToPlay.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrHowToPlay.setText("\t\tHow To Play:\r\n-Two players take turns moving their pieces \r\n  diagonally across the board\r\n-Pieces can only move forward unless they reach \r\n  the opposite end, they then become king pieces and \r\n  can move both directions\r\n-To claim an enemy's piece, one has to hop \r\n   over the piece diagnally, onto another clear space\r\n-After claiming a piece, your move can continue \r\n  if another legal pice can be taken \r\n\r\n");
		txtrHowToPlay.setBounds(10, 31, 390, 213);
		txtrHowToPlay.setEnabled(false);
		txtrHowToPlay.setVisible(false);
		frame.getContentPane().add(txtrHowToPlay);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(106, 285, -40, 22);
		frame.getContentPane().add(textArea);

		JLabel label = new JLabel("");
		label.setForeground(new Color(135, 206, 250));
		label.setBackground(new Color(135, 206, 250));
		label.setBounds(331, 161, 35, 35);
		frame.getContentPane().add(label);

		player starter = null;
	
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wPiece starter = new wPiece();
				String[][] Grid = new String[8][8];
				nPieces.add(lblBlack1);
				Grid[0][0]=("Black");
				nPieces.add(lblBlack2);
				Grid[2][0]=("Black");
				nPieces.add(lblBlack3);
				Grid[4][0]=("Black");
				nPieces.add(lblBlack4);
				Grid[6][0]=("Black");
				nPieces.add(lblBlack5);
				Grid[1][1]=("Black");
				nPieces.add(lblBlack6);
				Grid[3][1]=("Black");
				nPieces.add(lblBlack7);
				Grid[5][1]=("Black");
				nPieces.add(lblBlack8);
				Grid[7][1]=("Black");
				nPieces.add(lblBlack9);
				Grid[0][2]=("Black");
				nPieces.add(lblBlack10);
				Grid[2][2]=("Black");
				nPieces.add(lblBlack11);
				Grid[4][2]=("Black");
				nPieces.add(lblBlack12);
				Grid[6][2]=("Black");
				nPieces.add(lblwhite1);
				Grid[1][5]=("White");
				nPieces.add(lblwhite2);
				Grid[3][5]=("White");
				nPieces.add(lblwhite3);
				Grid[5][5]=("White");
				nPieces.add(lblwhite4);
				Grid[7][5]=("White");
				nPieces.add(lblwhite5);
				Grid[0][6]=("White");
				nPieces.add(lblwhite6);
				Grid[2][6]=("White");
				nPieces.add(lblwhite7);
				Grid[4][6]=("White");
				nPieces.add(lblwhite8);
				Grid[6][6]=("White");
				nPieces.add(lblwhite9);
				Grid[1][7]=("White");
				nPieces.add(lblwhite10);
				Grid[3][7]=("White");
				nPieces.add(lblwhite11);
				Grid[5][7]=("White");
				nPieces.add(lblwhite12);
				Grid[7][7]=("White");
				Grid[2][4]=("Black");
				Grid[0][4]=("Black");

				starter.createArray(nPieces,Grid);
			}
		});
		
		lblSpace1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblSpace2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}

		});
		lblSpace3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblSpace4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				wPiece p1 = new wPiece();
				String t=p1.checkUL(1, 7);
				System.out.println(t);
			}
		});
		lblwhite2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				wPiece p1 = new wPiece();
				String t=p1.checkUL(0, 6);
				System.out.println(t);

			}

		});
		lblwhite6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				wPiece p1 = new wPiece();

				String t=p1.checkUL(0, 6);
				System.out.println(t);
			}

		});
		lblwhite8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				mover = "White 9";
				wPiece p1 = new wPiece();


				String UL=p1.checkUL(1, 5);
				if (p1.checkUL(1, 5) == "canMove"){
					lblSpace1.setLocation(lblwhite9.getX()-42, lblwhite9.getY()-42);
					lblSpace1.setVisible(true);
				}
				if (p1.checkUL(1, 5) == "canJump"){
					lblSpace1.setLocation(lblwhite9.getX()-84, lblwhite9.getY()-84);
					lblSpace1.setVisible(true);
				}
				String UR=p1.checkUR(1, 5);
				if (p1.checkUR(1, 5) == "canMove"){
					lblSpace2.setLocation(lblwhite9.getX()+42, lblwhite9.getY()-42);
					lblSpace2.setVisible(true);
				}
				if (p1.checkUR(1, 5) == "canJump"){
					lblSpace2.setLocation(lblwhite9.getX()+84, lblwhite9.getY()-84);
					lblSpace2.setVisible(true);
				}

				String DL=p1.checkDL(1, 5);
				if (p1.checkDL(1, 5) == "canMove"){
					lblSpace3.setLocation(lblwhite9.getX()-42, lblwhite9.getY()+42);
					lblSpace3.setVisible(true);
				}
				if (p1.checkDL(1, 5) == "canJump"){
					lblSpace3.setLocation(lblwhite9.getX()-84, lblwhite9.getY()+84);
					lblSpace3.setVisible(true);
				}

				String DR=p1.checkDR(1, 5);
				if (p1.checkDR(1, 5) == "canMove"){
					lblSpace4.setLocation(lblwhite9.getX()+42, lblwhite9.getY()+42);
					lblSpace4.setVisible(true);
				}
				if (p1.checkDR(1, 5) == "canJump"){
					lblSpace4.setLocation(lblwhite9.getX()+84, lblwhite9.getY()+84);
					lblSpace4.setVisible(true);
				}
				System.out.println(UL);
				System.out.println(UR);
				System.out.println(DL);
				System.out.println(DR);
			}

		});
		lblwhite10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblwhite12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("");
			}

		});
		lblBlack2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblBlack12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblSpace1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Yay you clicked me");
			}

		});
		lblSpace2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("");
			}

		});
	}
	public void checker(){
		if (mover == "White1")
			ret
	}

	
}
