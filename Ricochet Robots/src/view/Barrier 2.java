package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import controller.SettingsController;

public class Barrier extends GameObject{

	public Barrier(int x, int y, int width, int height, ID id) {
		super(x, y, width, height, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, width, height);
		
	}

	@Override
	protected Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
