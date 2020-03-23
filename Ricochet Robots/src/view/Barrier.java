package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import controller.SettingsController;

public class Barrier extends GameObject{
	
	private SettingsController  sc;

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
		sc = (SettingsController) Settings.object();
		if(sc.isNormal())
		g.setColor(sc.normal1);
		
		if(sc.isDeuteranope())
		g.setColor(sc.deut1);
		
		if(sc.isProtanope())
		g.setColor(sc.prot1);
		
		if(sc.isTritanope())
		g.setColor(sc.trit1);
		
		g.fillRect(x, y, width, height);
		
	}

	@Override
	protected Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
