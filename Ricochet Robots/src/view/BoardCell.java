package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BoardCell extends GameObject{

	public BoardCell(int x, int y, int width, int height, ID id) {
		super(x, y, width, height, id);
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect(x, y, width, height);
		
	}

	@Override
	protected Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
