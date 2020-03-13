package view;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.image.*;



public class BidConfirmationPanel {
	static boolean confirmedBid = false;

	public static void bidConfirmation() {
		  // Create image icon
		  /*ImageIcon icon = new ImageIcon("img/Bid.jpg");
		  Image img = icon.getImage();
		  BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		  Graphics g = bi.createGraphics();
		  g.drawImage(img, 0, 0, 50, 50, null);
		  ImageIcon newIcon = new ImageIcon(bi);*/
		  
		  // Create panel
		  JPanel bidConfirmationPanel = new JPanel();
	      bidConfirmationPanel.setSize(new Dimension(100, 100));
	      bidConfirmationPanel.setLayout(null);
	      JLabel label1 = new JLabel("This will finalize your bid.");
	      label1.setVerticalAlignment(SwingConstants.BOTTOM);
	      label1.setBounds(20, 20, 200, 30);
	      label1.setHorizontalAlignment(SwingConstants.CENTER);
	      bidConfirmationPanel.add(label1);
	      JLabel label2 = new JLabel("Do you want to confirm bid?");
	      label2.setVerticalAlignment(SwingConstants.TOP);
	      label2.setHorizontalAlignment(SwingConstants.CENTER);
	      label2.setBounds(20, 80, 200, 20);
	      bidConfirmationPanel.add(label2);
	      UIManager.put("OptionPane.minimumSize", new Dimension(400, 200));
	      int res = JOptionPane.showConfirmDialog(null, bidConfirmationPanel, "Bid Confirmation",
	      JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
	      if(res == 0) {
	         confirmedBid = true;
	      } else {
	         confirmedBid = false;
	   }
	}
	
	public static boolean isConfirmedBid() {
		return confirmedBid;
	}

	public static void setConfirmedBid(boolean confirmedBid) {
		BidConfirmationPanel.confirmedBid = confirmedBid;
	}
	
	

}
