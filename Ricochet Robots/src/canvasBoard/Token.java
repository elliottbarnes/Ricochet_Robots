package canvasBoard;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Token extends GameObject {

	BufferedImage img;
	Handler handler;
	String name;
	public Token(int x, int y, int width, int height, ID id, String Name) {
		super(x, y, width, height, id);
		this.name = Name;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		try {
			img = ImageIO.read(this.getClass().getResource("/"+name+".PNG"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		g.drawImage(img, x, y, width, height, null);
		
	}

	@Override
	protected Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

}
