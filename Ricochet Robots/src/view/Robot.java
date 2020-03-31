package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.SettingsController;

public class Robot extends GameObject{

	private SettingsController  sc;

	BufferedImage img;
	Handler handler;
	public Robot(int x, int y, int width, int height, ID id, Handler handler) {
		super(x, y, width, height, id);
		this.handler = handler; 
	}
	
	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		x= GameBoard.clamp(x, 9, GameBoard.WIDTH -46);
		y= GameBoard.clamp(y, 9, GameBoard.HEIGHT-46);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x-1, y-1, width+2, height+2);
	}
	
	public boolean collision(){
		
		for(int i=0; i<handler.object.size(); i++) {
			GameObject go = handler.object.get(i);
			if(go.getId() == ID.Barrier) {
				if(getBounds().intersects(go.getBounds())) {
					return true;
				}
			}
		}
		return false;
	} 
	
	@Override
	public void render(Graphics g) {
//		try {
//			img = ImageIO.read(this.getClass().getResource("/robot.png"));
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		Graphics2D g2d= (Graphics2D) g;
//		g2d.draw(getBounds());
//		g.drawImage(img, x, y, width, height, null);
		sc = (SettingsController) Settings.object();
		if(sc.isNormal()) {
			if(id==ID.Robot) {
				g.setColor(sc.normal1);
			}else if(id==ID.Robot2) {
				g.setColor(sc.normal2);
			}else if(id==ID.Robot3) {
				g.setColor(sc.normal3);
			}else if(id==ID.Robot4) {
				g.setColor(sc.normal4);
			}
		}
		if(sc.isDeuteranope()) {
			if(id==ID.Robot) {
				g.setColor(sc.deut1);
			}else if(id==ID.Robot2) {
				g.setColor(sc.deut2);
			}else if(id==ID.Robot3) {
				g.setColor(sc.deut3);
			}else if(id==ID.Robot4) {
				g.setColor(sc.deut4);
			}
		}
		if(sc.isProtanope()) {
			if(id==ID.Robot) {
				g.setColor(sc.prot1);
			}else if(id==ID.Robot2) {
				g.setColor(sc.prot2);
			}else if(id==ID.Robot3) {
				g.setColor(sc.prot3);
			}else if(id==ID.Robot4) {
				g.setColor(sc.prot4);
			}
		}
		if(sc.isTritanope()) {
			if(id==ID.Robot) {
				g.setColor(sc.trit1);
			}else if(id==ID.Robot2) {
				g.setColor(sc.trit2);
			}else if(id==ID.Robot3) {
				g.setColor(sc.trit3);
			}else if(id==ID.Robot4) {
				g.setColor(sc.trit4);
			}
		}
		g.fillArc(x, y, width, height, 0, 360);
		String word = "R";
		if(id==ID.Robot) word = "R1";
		if(id==ID.Robot2) word = "R2";
		if(id==ID.Robot3) word = "R3";
		if(id==ID.Robot4) word = "R4";
		
		g.setColor(Color.white);
		g.drawString(word, x+6, y+17);
	}
}
