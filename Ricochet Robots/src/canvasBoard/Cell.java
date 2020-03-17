package canvasBoard;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cell extends GameObject {


	public Cell(int x, int y, int width, int height, ID id) {
		super(x, y, width, height, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, width-1, height-1);
	}

	@Override
	protected Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

}
