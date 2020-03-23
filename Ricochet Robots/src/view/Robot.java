package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Robot extends GameObject{



	BufferedImage img;
	Handler handler;
	public Robot(int x, int y, int width, int height, ID id, Handler handler) {
		super(x, y, width, height, id);
		this.handler = handler; 
	}
	boolean flag = false;
	@Override
	public void tick() {
		
		x += velX;
		y += velY;
		
		x= GameBoard.clamp(x, 9, GameBoard.WIDTH -46);
		y= GameBoard.clamp(y, 9, GameBoard.HEIGHT-46);
		
		if(collision()) {
			System.out.println("Collision");
		}
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	
	public boolean collision(){
		
		for(int i=0; i<handler.object.size(); i++) {
			GameObject go = handler.object.get(i);
			if(go.getId() == ID.Barrier) {
				if(getBounds().intersects(go.getBounds())) {
					flag = true;
				}
			}
		}
		return flag;
	} 
	
	@Override
	public void render(Graphics g) {
		try {
			img = ImageIO.read(this.getClass().getResource("/robot.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		Graphics2D g2d= (Graphics2D) g;
		g2d.draw(getBounds());
		g.drawImage(img, x, y, width, height, null);
	}
}
