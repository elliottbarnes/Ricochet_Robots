package view;

import java.awt.*;

import javax.swing.*;

import controller.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameGUI extends JFrame implements MouseListener {
	
	private JFrame frmTakeTurn;
	private Canvas canvas;
	private JButton btnP1, btnP2, btnP3, btnP4;
	private GameTimer gameTmr;
	private JTextField textField;
	private JLabel lblP1, lblP2, lblP3, lblP4,lblp1bid, lblp2bid, lblp3bid, lblp4bid;
	private JPanel leftPanel, rightPanel;
	private boolean flag;
	private static int Xcoord, Ycoord;
	private BidController bidController;
	private int player;
	private SettingsController  sc;
	
	public GameGUI() {
		Display();
	}
	public void Display() {
		
		//All classes needed in this class
		sc = (SettingsController) Settings.object();
		bidController = new BidController();
		
		
		flag = false;
		
		//Creating all frames and dividing the screen
		frmTakeTurn = new JFrame();
		frmTakeTurn.setResizable(false);
		frmTakeTurn.setLocationRelativeTo(null);

		frmTakeTurn.setTitle("Ricochet Robots");
		frmTakeTurn.setBounds(100, 100, 800, 700);
		frmTakeTurn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTakeTurn.getContentPane().setLayout(null);
		
		//Left Panel
		
		leftPanel = new JPanel();
		leftPanel.setLocation(0, 0);
		frmTakeTurn.getContentPane().add(leftPanel);
		leftPanel.setSize(600, 600);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(600,600));
		canvas.setMaximumSize(new Dimension(600,600));
		canvas.setMinimumSize(new Dimension(600,600));
		leftPanel.add(canvas);
		
		//Right Panel
		
		rightPanel = new JPanel();
		rightPanel.setBackground(Color.GREEN);
		rightPanel.setLocation(600, 0);
		frmTakeTurn.getContentPane().add(rightPanel);
		rightPanel.setSize(184, 600);
		rightPanel.setLayout(null);
		
		JButton btnBid = new JButton("Place Bid");
		btnBid.setBounds(52, 299, 89, 23);
		rightPanel.add(btnBid);
		
		JButton btnP1 = new JButton("P1");
		btnP1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP1.setBounds(32, 188, 45, 23);
		rightPanel.add(btnP1);
		
		JButton btnP2 = new JButton("P2");
		btnP2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP2.setBounds(32, 222, 45, 23);
		rightPanel.add(btnP2);
		
		JButton btnP3 = new JButton("P3");
		btnP3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP3.setBounds(112, 188, 45, 23);
		rightPanel.add(btnP3);
		
		JButton btnP4 = new JButton("P4");
		btnP4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP4.setBounds(112, 222, 45, 23);
		rightPanel.add(btnP4);

		if(sc.isPlayer1()) {btnP1.setEnabled(true);} else {btnP1.setEnabled(false);}
		if(sc.isPlayer2()) {btnP2.setEnabled(true);} else {btnP2.setEnabled(false);}
		if(sc.isPlayer3()) {btnP3.setEnabled(true);} else {btnP3.setEnabled(false);}
		if(sc.isPlayer4()) {btnP4.setEnabled(true);} else {btnP4.setEnabled(false);}
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setVisible(false);
		textField.setBounds(50, 268, 86, 20);
		
		lblP1 = new JLabel("Player 1");
		lblP1.setBounds(31, 354, 46, 14);
		rightPanel.add(lblP1);
		
		lblP2 = new JLabel("Player 2");
		lblP2.setBounds(31, 376, 46, 14);
		rightPanel.add(lblP2);
		
		lblP3 = new JLabel("Player 3");
		lblP3.setBounds(31, 401, 46, 14);
		rightPanel.add(lblP3);
		
		lblP4 = new JLabel("Player 4");
		lblP4.setBounds(31, 426, 46, 14);
		rightPanel.add(lblP4);
		
		lblp1bid = new JLabel("0");
		lblp1bid.setBounds(95, 354, 46, 14);
		rightPanel.add(lblp1bid);
		
		lblp2bid = new JLabel("0");
		lblp2bid.setBounds(95, 376, 46, 14);
		rightPanel.add(lblp2bid);
		
		lblp3bid = new JLabel("0");
		lblp3bid.setBounds(95, 401, 46, 14);
		rightPanel.add(lblp3bid);
		
		lblp4bid = new JLabel("0");
		lblp4bid.setBounds(95, 426, 46, 14);
		rightPanel.add(lblp4bid);
		
		rightPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnHint = new JButton("HINT");
		btnHint.setBounds(52, 11, 89, 23);
		rightPanel.add(btnHint);
		
		
		frmTakeTurn.setVisible(true);
		
		
		//All buttons' action listeners
		
		btnBid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setVisible(false);
				textField.setEnabled(false);
				if(getPlayer()==1) {
					setBid("Player1", lblp1bid);
				}
				else if(getPlayer()==2) {
					setBid("Player2", lblp2bid);
				}
				else if(getPlayer()==3) {
					setBid("Player3", lblp3bid);
				}
				else {
					setBid("Player4", lblp4bid);
				}
			}
		});
		
		btnP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPlayer(1);
				textField.setVisible(true);
				textField.setEnabled(true);
			}
		});
		
		btnP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPlayer(2);
				textField.setVisible(true);
				textField.setEnabled(true);
			}
		});
		
		btnP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPlayer(3);
				textField.setVisible(true);
				textField.setEnabled(true);
			}
		});
		
		btnP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPlayer(4);
				textField.setVisible(true);
				textField.setEnabled(true);
			}
		});
		
	}
	
	private void setBid(String player, JLabel lbl) {
		String bidValue = textField.getText();
		int playersBid = Integer.parseInt(bidValue);
		textField.setText("");
		BidConfirmationPanel.bidConfirmation(bidValue);
		if(BidConfirmationPanel.isConfirmedBid()) {
			boolean valid = bidController.newBid(player, playersBid);
			if(valid) {
				lbl.setText(bidValue);
				if(flag == false) {
					Timer();
					flag=true;
				}
			}
			else {
				JOptionPane.showMessageDialog(frmTakeTurn, "A new bid must be less than a previous bid. Please try Again.");
			}
		}
	}

	public int getPlayer() {
		return player ;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
	public void Timer() {
		gameTmr = new GameTimer();
		gameTmr.setBounds(67, 46, 58, 58);
		frmTakeTurn.getContentPane().add(gameTmr);
		
		rightPanel.add(gameTmr);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Object selected = e.getSource();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static int getXcoord() {
		return Xcoord;
	}

	public static void setXcoord(int xcoord) {
		Xcoord = xcoord;
	}

	public static int getYcoord() {
		return Ycoord;
	}

	public static void setYcoord(int ycoord) {
		Ycoord = ycoord;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
}
