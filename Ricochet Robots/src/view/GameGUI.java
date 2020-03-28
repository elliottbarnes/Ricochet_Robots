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
	private JButton btnP1, btnP2, btnP3, btnP4, btnHint;
	private GameTimer gameTmr;
	private JTextField textField;
	private JLabel lblP1, lblP2, lblP3, lblP4,lblp1bid, lblp2bid, lblp3bid, lblp4bid;
	private JPanel leftPanel, rightPanel, bottomPanel;
	private boolean flag;
	private static int Xcoord, Ycoord;
	private BidController bidController;
	private int player;
	private SettingsController  sc;
	private Handler handler;
	
	public GameGUI() {
		Display();
	}
	public void Display() {
		
		//All classes needed in this class
		sc = (SettingsController) Settings.object();
		bidController = new BidController();
		handler = new Handler();
		
		flag = false;
		
		//Creating all frames and dividing the screen
		frmTakeTurn = new JFrame();
		frmTakeTurn.setFont(new Font("Chalkduster", Font.BOLD, 12));
		makeMenuBar(frmTakeTurn);
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
		rightPanel.setForeground(new Color(51, 204, 255));
		rightPanel.setLocation(600, 0);
		frmTakeTurn.getContentPane().add(rightPanel);
		rightPanel.setSize(184, 600);
		rightPanel.setLayout(null);
		
		JButton btnBid = new JButton("Place Bid");
		btnBid.setForeground(Color.RED);
		btnBid.setFont(new Font("Chalkduster", Font.BOLD, 13));
		btnBid.setBounds(50, 249, 81, 50);
		rightPanel.add(btnBid);
		
		btnP1 = new JButton("P1");
		btnP1.setForeground(new Color(51, 204, 255));
		btnP1.setFont(new Font("Chalkduster", Font.BOLD, 13));
		btnP1.setBounds(32, 137, 45, 23);
		rightPanel.add(btnP1);
		
		btnP2 = new JButton("P2");
		btnP2.setForeground(new Color(102, 102, 255));
		btnP2.setFont(new Font("Chalkduster", Font.BOLD, 13));
		btnP2.setBounds(32, 171, 45, 23);
		rightPanel.add(btnP2);
		
		btnP3 = new JButton("P3");
		btnP3.setForeground(new Color(204, 102, 255));
		btnP3.setFont(new Font("Chalkduster", Font.BOLD, 13));
		btnP3.setBounds(112, 137, 45, 23);
		rightPanel.add(btnP3);
		
		btnP4 = new JButton("P4");
		btnP4.setForeground(new Color(255, 255, 0));
		btnP4.setFont(new Font("Chalkduster", Font.BOLD, 13));
		btnP4.setBounds(112, 171, 45, 23);
		rightPanel.add(btnP4);

		if(sc.isPlayer1()) {btnP1.setEnabled(true);} else {btnP1.setEnabled(false);}
		if(sc.isPlayer2()) {btnP2.setEnabled(true);} else {btnP2.setEnabled(false);}
		if(sc.isPlayer3()) {btnP3.setEnabled(true);} else {btnP3.setEnabled(false);}
		if(sc.isPlayer4()) {btnP4.setEnabled(true);} else {btnP4.setEnabled(false);}
		
		textField = new JTextField();
		textField.setFont(new Font("Chalkduster", Font.BOLD, 13));
		textField.setEnabled(false);
		textField.setVisible(false);
		textField.setBounds(50, 217, 81, 20);
		
		lblP1 = new JLabel("Player 1");
		lblP1.setForeground(new Color(51, 204, 255));
		lblP1.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblP1.setBounds(31, 386, 100, 25);
		rightPanel.add(lblP1);
		
		lblP2 = new JLabel("Player 2");
		lblP2.setForeground(new Color(102, 102, 255));
		lblP2.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblP2.setBounds(31, 436, 100, 25);
		rightPanel.add(lblP2);
		
		lblP3 = new JLabel("Player 3");
		lblP3.setForeground(new Color(204, 102, 255));
		lblP3.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblP3.setBounds(31, 486, 100, 25);
		rightPanel.add(lblP3);
		
		lblP4 = new JLabel("Player 4");
		lblP4.setForeground(new Color(255, 255, 0));
		lblP4.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblP4.setBounds(31, 536, 100, 25);
		rightPanel.add(lblP4);
		
		lblp1bid = new JLabel("0");
		lblp1bid.setForeground(new Color(51, 204, 255));
		lblp1bid.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblp1bid.setBounds(137, 386, 20, 25);
		rightPanel.add(lblp1bid);
		
		lblp2bid = new JLabel("0");
		lblp2bid.setForeground(new Color(102, 102, 255));
		lblp2bid.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblp2bid.setBounds(137, 436, 20, 25);
		rightPanel.add(lblp2bid);
		
		lblp3bid = new JLabel("0");
		lblp3bid.setForeground(new Color(204, 102, 255));
		lblp3bid.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblp3bid.setBounds(137, 486, 20, 25);
		rightPanel.add(lblp3bid);
		
		lblp4bid = new JLabel("0");
		lblp4bid.setForeground(new Color(255, 255, 0));
		lblp4bid.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblp4bid.setBounds(137, 536, 20, 25);
		rightPanel.add(lblp4bid);
		
		rightPanel.add(textField);
		textField.setColumns(10);
		
		btnHint = new JButton("HINT");
		btnHint.setForeground(new Color(0, 255, 0));
		btnHint.setBackground(Color.WHITE);
		btnHint.setFont(new Font("Chalkduster", Font.BOLD, 13));
		btnHint.setBounds(52, 11, 89, 23);
		rightPanel.add(btnHint);
		
		JLabel lbl_BIDS = new JLabel("BIDS");
		lbl_BIDS.setForeground(new Color(128, 0, 0));
		lbl_BIDS.setFont(new Font("Chalkduster", Font.BOLD, 20));
		lbl_BIDS.setBounds(67, 322, 60, 35);
		rightPanel.add(lbl_BIDS);
		
		if(sc.isHintsEnabled()) {
			btnHint.setVisible(true);
			btnHint.setEnabled(true);
		}else {
			btnHint.setVisible(false);
			btnHint.setEnabled(false);
		}
		
		//Bottom Panel
		
		bottomPanel = new JPanel();
		
		bottomPanel.setLocation(0, 600);
		frmTakeTurn.getContentPane().add(bottomPanel);
		bottomPanel.setSize(800, 200);
		bottomPanel.setLayout(null);
		
		JButton btnUp = new JButton("UP");
		btnUp.setBounds(25, 11, 89, 23);
		bottomPanel.add(btnUp);
		
		JButton btnDown = new JButton("Down");
		btnDown.setBounds(135, 11, 89, 23);
		bottomPanel.add(btnDown);
		
		JButton btnRight = new JButton("Right");
		btnRight.setBounds(242, 11, 89, 23);
		bottomPanel.add(btnRight);
		
		JButton btnLeft = new JButton("Left");
		btnLeft.setBounds(349, 11, 89, 23);
		bottomPanel.add(btnLeft);
		
		//End of frame
		
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
		
		btnUp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<handler.object.size(); i++) {
					GameObject gm = handler.object.get(i);
					if(gm.getId() == ID.Robot) {
						gm.tick();
						gm.setVelY(-5);
						gm.setVelX(0);
					}
				}
			}
		});
		
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<handler.object.size(); i++) {
					GameObject gm = handler.object.get(i);
					if(gm.getId() == ID.Robot) {
						gm.tick();
						gm.setVelY(5);
						gm.setVelX(0);
					}
				}
			}
		});
		
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<handler.object.size(); i++) {
					GameObject gm = handler.object.get(i);
					if(gm.getId() == ID.Robot) {
						gm.tick();
						gm.setVelX(5);
						gm.setVelY(0);
					}
				}
			}
		});
		
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<handler.object.size(); i++) {
					GameObject gm = handler.object.get(i);
					if(gm.getId() == ID.Robot) {
						gm.tick();
						gm.setVelX(-5);
						gm.setVelX(0);
					}
				}
			}
		});
		
	}
	
	public void makeMenuBar(JFrame frame){
				//menu bar
				JMenuBar menubar = new JMenuBar();
				menubar.setFont(new Font("Chalkduster", Font.BOLD, 14));
				
				
				JMenu fileMenu = new JMenu("Game Menu");
				fileMenu.setHorizontalAlignment(SwingConstants.CENTER);
				fileMenu.setFont(new Font("Chalkduster", Font.BOLD, 14));
				menubar.add(fileMenu);
				
				JMenuItem saveItem = new  JMenuItem("Save Game");
				saveItem.setHorizontalAlignment(SwingConstants.CENTER);
				saveItem.setFont(new Font("Chalkduster", Font.BOLD, 14));
				fileMenu.add(saveItem);
				
				saveItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SaveData data = new SaveData();
						data.setBtnP1(btnP1);
						data.setBtnP2(btnP2);
						data.setBtnP3(btnP3);
						data.setBtnP4(btnP4);
						data.setLblP1(lblP1);
						data.setLblp1bid(lblp1bid);
						data.setLblP2(lblP2);
						data.setLblp2bid(lblp2bid);
						data.setLblP3(lblP3);
						data.setLblp3bid(lblp3bid);
						data.setLblP4(lblP4);
						data.setLblp4bid(lblp4bid);
						data.setDifficultyType(sc.getDifficultyType());
						
						
						
						try {
							ResourceManager.save(data,  "1.save");
						} 
						catch(Exception ex) {
							System.out.println("Unable to save: "+ ex.getMessage());
						}
						
				}
				});
				
				JMenuItem manItem = new JMenuItem("Manual");
				manItem.setHorizontalAlignment(SwingConstants.CENTER);
				manItem.setFont(new Font("Chalkduster", Font.BOLD, 14));
				fileMenu.add(manItem);
				manItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new Help();
					}
				});
				
				JMenuItem hintItem = new JMenuItem("Hint");
				hintItem.setHorizontalAlignment(SwingConstants.CENTER);
				hintItem.setFont(new Font("Chalkduster", Font.BOLD, 14));
				fileMenu.add(hintItem);
				
				frame.setJMenuBar(menubar);
	}
	
	private void setBid(String player, JLabel lbl) {
		String bidValue = textField.getText();
		try {
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
		catch (NumberFormatException e) {
		     //Not an integer
			JOptionPane.showMessageDialog(frmTakeTurn, "A player must be selected before a bid can be placed (bids must be positive integer values)");
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
		gameTmr.setBounds(67, 46, 58, 100);
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
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
