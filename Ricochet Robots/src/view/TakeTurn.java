package view;

import java.awt.*;

import javax.swing.*;

import controller.GridSquare;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TakeTurn extends JPanel {
	
	private JFrame frmTakeTurn;
	private GameTimer gameTmr;
	private JTextField textField;
	private JLabel lblP1, lblP2, lblP3, lblP4,lblp1bid, lblp2bid, lblp3bid, lblp4bid;
	private int player;

	public TakeTurn() {
		
		GridSquare[][] gridSquares; 
		int x=16;
		int y=16;
		
		frmTakeTurn = new JFrame();
		frmTakeTurn.setResizable(false);
		frmTakeTurn.setLocationRelativeTo(null);

		frmTakeTurn.setTitle("Take a Turn");
		frmTakeTurn.setBounds(100, 100, 800, 700);
		frmTakeTurn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTakeTurn.getContentPane().setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLocation(0, 0);
		frmTakeTurn.getContentPane().add(leftPanel);
		leftPanel.setLayout(new GridLayout(x, y, 0, 0));
		leftPanel.setSize(600, 600);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.GREEN);
		rightPanel.setLocation(600, 0);
		frmTakeTurn.getContentPane().add(rightPanel);
		rightPanel.setSize(184, 600);
		rightPanel.setLayout(null);
		
		JButton btnBid = new JButton("Place Bid");
		btnBid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(false);
				textField.setEnabled(false);
				lblp1bid.setText(textField.getText());
				
			}
		});
		btnBid.setBounds(46, 146, 89, 23);
		rightPanel.add(btnBid);
		
		JButton btnP1 = new JButton("P1");
		btnP1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(true);
				textField.setEnabled(true);
			}
		});
		btnP1.setBounds(26, 35, 45, 23);
		rightPanel.add(btnP1);
		
		JButton btnP2 = new JButton("P2");
		btnP2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP2.setBounds(26, 69, 45, 23);
		rightPanel.add(btnP2);
		
		JButton btnP3 = new JButton("P3");
		btnP3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP3.setBounds(106, 35, 45, 23);
		rightPanel.add(btnP3);
		
		JButton btnP4 = new JButton("P4");
		btnP4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP4.setBounds(106, 69, 45, 23);
		rightPanel.add(btnP4);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
	            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
	            	textField.setEditable(true);
	            } else {
	            	textField.setEditable(false);
	            }
			}
		});
		textField.setEnabled(false);
		textField.setVisible(false);
		textField.setBounds(44, 115, 86, 20);
		
		lblP1 = new JLabel("Player 1");
		lblP1.setBounds(25, 201, 46, 14);
		rightPanel.add(lblP1);
		
		lblP2 = new JLabel("Player 2");
		lblP2.setBounds(25, 223, 46, 14);
		rightPanel.add(lblP2);
		
		lblP3 = new JLabel("Player 3");
		lblP3.setBounds(25, 248, 46, 14);
		rightPanel.add(lblP3);
		
		lblP4 = new JLabel("Player 4");
		lblP4.setBounds(25, 273, 46, 14);
		rightPanel.add(lblP4);
		
		lblp1bid = new JLabel("0");
		lblp1bid.setBounds(89, 201, 46, 14);
		rightPanel.add(lblp1bid);
		
		lblp2bid = new JLabel("0");
		lblp2bid.setBounds(89, 223, 46, 14);
		rightPanel.add(lblp2bid);
		
		lblp3bid = new JLabel("0");
		lblp3bid.setBounds(89, 248, 46, 14);
		rightPanel.add(lblp3bid);
		
		lblp4bid = new JLabel("0");
		lblp4bid.setBounds(89, 273, 46, 14);
		rightPanel.add(lblp4bid);
		
		rightPanel.add(textField);
		textField.setColumns(10);
		
		
		
		/*JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.GRAY);
		bottomPanel.setLocation(0, 600);
		frmTakeTurn.getContentPane().add(bottomPanel);
		bottomPanel.setSize(784, 61);*/
		
		// implemented timer - Mar. 5th
		gameTmr = new GameTimer();
		gameTmr.setLocation(0,600);
		frmTakeTurn.getContentPane().add(gameTmr);
		gameTmr.setSize(784,61);
		
		
		gridSquares = new GridSquare[x][y];
		for (int column = 0; column < x; column++) {
			for (int row = 0; row < y; row++) {
				gridSquares[column][row] = new GridSquare(x, y);
				gridSquares[column][row].setOpaque(true);
				gridSquares[column][row].setColor(column,row);
				gridSquares[column][row].setBorder(BorderFactory.createLineBorder(Color.BLACK));

				leftPanel.add(gridSquares[column][row]);
			}
		}
		
		frmTakeTurn.setVisible(true);
	}
	
}
