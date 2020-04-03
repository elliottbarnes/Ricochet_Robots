package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.SettingsController;

public class Token extends GameObject {

	BufferedImage img;
	Handler handler;
	int name;
	private SettingsController  sc;
	
	public Token(int x, int y, int width, int height, ID id, int Name) {
		super(x, y, width, height, id);
		this.name = Name;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		
		sc = (SettingsController) Settings.object();
		
		if(name>0 && name <=4) {
			Triangle(g);
		}else if(name>4 && name <=8) {
			Moon(g);
		}else if(name>8 && name <=12) {
			Planet(g);
		}else if(name>12 && name <=16){
			Star(g);
		}else {
			try {
				img = ImageIO.read(this.getClass().getResource("/17.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
			g.drawImage(img, x, y, width, height, null);
		}
		
	}

	@Override
	protected Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	
	public void Triangle(Graphics g) {
		switch(name) {
		case 1: 
			bluecolor(g);
			break;
		case 2:
			greencolor(g);
			break;
		case 3:
			redcolor(g);
			break;
		case 4:
			yellowcolor(g);
			break;
		}
		canvasTriangle(g);
	}
	public void Moon(Graphics g) {
		switch(name) {
		case 5: 
			bluecolor(g);
			break;
		case 6:
			greencolor(g);
			break;
		case 7:
			redcolor(g);
			break;
		case 8:
			yellowcolor(g);
			break;
		}
		canvasMoon(g);
	}
	public void Planet(Graphics g) {
		switch(name) {
		case 9: 
			bluecolor(g);
			break;
		case 10:
			greencolor(g);
			break;
		case 11:
			redcolor(g);
			break;
		case 12:
			yellowcolor(g);
			break;
		}
		canvasPlanet(g);
	}
	public void Star(Graphics g) {
		switch(name) {
			case 13: 
				bluecolor(g);
				break;
			case 14:
				greencolor(g);
				break;
			case 15:
				redcolor(g);
				break;
			case 16:
				yellowcolor(g);
				break;
		}
		canvasStar(g);
	}
	
	public void bluecolor(Graphics g) {
		if(sc.isNormal()) g.setColor(sc.normal1);		
		if(sc.isDeuteranope()) g.setColor(sc.deut1);
		if(sc.isProtanope()) g.setColor(sc.prot1);
		if(sc.isTritanope()) g.setColor(sc.trit1);
	}
	public void greencolor(Graphics g) {
		if(sc.isNormal()) g.setColor(sc.normal2);		
		if(sc.isDeuteranope()) g.setColor(sc.deut2);
		if(sc.isProtanope()) g.setColor(sc.prot2);
		if(sc.isTritanope()) g.setColor(sc.trit2);
	}
	public void redcolor(Graphics g) {
		if(sc.isNormal()) g.setColor(sc.normal3);		
		if(sc.isDeuteranope()) g.setColor(sc.deut3);
		if(sc.isProtanope()) g.setColor(sc.prot3);
		if(sc.isTritanope()) g.setColor(sc.trit3);
	}
	public void yellowcolor(Graphics g) {
		if(sc.isNormal()) g.setColor(sc.normal4);		
		if(sc.isDeuteranope()) g.setColor(sc.deut4);
		if(sc.isProtanope()) g.setColor(sc.prot4);
		if(sc.isTritanope()) g.setColor(sc.trit4);
	}
	
	public void canvasPlanet(Graphics g) {
		g.fillRect(x, y, width, height);
		g.setColor(Color.white);
		g.fillArc(x + (width/8),  y + (height/8), width - (width/4), height -(height/4), 0, 360);
		g.drawArc(x, y + (height/4), width, height - (height/2), 0, 320);
	}
	public void canvasMoon(Graphics g) {
		g.fillArc(x, y, width, height, 0, 360);
		g.setColor(Color.white);
		g.fillArc(x + 1, y + 1, width-(width/8), height-(height/8), 120, 180);
	}
	public void canvasTriangle(Graphics g) {
		int[] xp = new int[] { x +(width/2), x, x + width };
		int[] yp = new int[] { y, y + height, y + height };
		g.fillPolygon(xp, yp, 3);
		g.setColor(Color.white);
		g.fillArc(x + (width/8), y + (height/4), width - (width/4), height -(height/4), 0, 360);
	}
	public void canvasStar(Graphics g) {
		g.fillRoundRect(x, y, width, height, 10, 10);
		
		g.setColor(Color.white);

		int[] xp = new int[] { x +(width/2), x +(width/4), x + 3*(width/4) };
		int[] yp = new int[] { y - 6 , y + (height/2), y + (height/2) };
		g.fillPolygon(xp, yp, 3);
		
		int[] xp2 = new int[] { x + (width/2), x +(width/4), x + 3*(width/4) };
		int[] yp2 = new int[] { y + height + 6, y + (height/2), y + (height/2)};
		g.fillPolygon(xp2, yp2, 3);
		
		int[] xp3 = new int[] { x -6 , x +(width/2), x + (width/2) };
		int[] yp3 = new int[] { y + (height/2), y + (height/4), y + 3*(height/4)};
		g.fillPolygon(xp3, yp3, 3);
		
		int[] xp4 = new int[] { x + width + 6 , x +(width/2), x + (width/2) };
		int[] yp4 = new int[] { y + (height/2), y + (height/4), y + 3*(height/4)};
		g.fillPolygon(xp4, yp4, 3);
	}
}
