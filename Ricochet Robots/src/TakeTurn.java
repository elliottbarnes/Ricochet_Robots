import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;

public class TakeTurn {

	private JFrame frmTakeTurn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TakeTurn window = new TakeTurn();
					window.frmTakeTurn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TakeTurn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
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
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.GRAY);
		bottomPanel.setLocation(0, 600);
		frmTakeTurn.getContentPane().add(bottomPanel);
		bottomPanel.setSize(784, 61);
		
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

		
		
	}

}
