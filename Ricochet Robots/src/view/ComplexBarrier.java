package view;

import java.awt.Graphics;
import java.awt.Rectangle;

import controller.SettingsController;

public class ComplexBarrier extends GameObject{

	private SettingsController  sc;
	int type;
	public ComplexBarrier(int x, int y, int width, int height, ID id, int type) {
		super(x, y, width, height, id);
		this.type = type;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		sc = (SettingsController) Settings.object();
		if(sc.isNormal()) {
			if(id==ID.ComplexBarrier1) g.setColor(sc.normal4);;
			if(id==ID.ComplexBarrier2) g.setColor(sc.normal4);
			if(id==ID.ComplexBarrier3) g.setColor(sc.normal1);
			if(id==ID.ComplexBarrier4) g.setColor(sc.normal1);
			if(id==ID.ComplexBarrier5) g.setColor(sc.normal2);
			if(id==ID.ComplexBarrier6) g.setColor(sc.normal3);
			if(id==ID.ComplexBarrier7) g.setColor(sc.normal2);
			if(id==ID.ComplexBarrier8) g.setColor(sc.normal3);
		}
		if(sc.isDeuteranope()) {
			if(id==ID.ComplexBarrier1) g.setColor(sc.deut4);;
			if(id==ID.ComplexBarrier2) g.setColor(sc.deut4);
			if(id==ID.ComplexBarrier3) g.setColor(sc.deut1);
			if(id==ID.ComplexBarrier4) g.setColor(sc.deut1);
			if(id==ID.ComplexBarrier5) g.setColor(sc.deut2);
			if(id==ID.ComplexBarrier6) g.setColor(sc.deut3);
			if(id==ID.ComplexBarrier7) g.setColor(sc.deut2);
			if(id==ID.ComplexBarrier8) g.setColor(sc.deut3);
		}
		if(sc.isProtanope()) {
			if(id==ID.ComplexBarrier1) g.setColor(sc.prot4);;
			if(id==ID.ComplexBarrier2) g.setColor(sc.prot4);
			if(id==ID.ComplexBarrier3) g.setColor(sc.prot1);
			if(id==ID.ComplexBarrier4) g.setColor(sc.prot1);
			if(id==ID.ComplexBarrier5) g.setColor(sc.prot2);
			if(id==ID.ComplexBarrier6) g.setColor(sc.prot3);
			if(id==ID.ComplexBarrier7) g.setColor(sc.prot2);
			if(id==ID.ComplexBarrier8) g.setColor(sc.prot3);
		}
		if(sc.isTritanope()) {
			if(id==ID.ComplexBarrier1) g.setColor(sc.trit4);;
			if(id==ID.ComplexBarrier2) g.setColor(sc.trit4);
			if(id==ID.ComplexBarrier3) g.setColor(sc.trit1);
			if(id==ID.ComplexBarrier4) g.setColor(sc.trit1);
			if(id==ID.ComplexBarrier5) g.setColor(sc.trit2);
			if(id==ID.ComplexBarrier6) g.setColor(sc.trit3);
			if(id==ID.ComplexBarrier7) g.setColor(sc.trit2);
			if(id==ID.ComplexBarrier8) g.setColor(sc.trit3);
		}
		
		if(type==1) {
			int[] xp = new int[] { x + 5, x, x+(width-5), x+width};
			int[] yp = new int[] { y, y+5, y+height, y+(height-5)};
			g.fillPolygon(xp, yp, 4);
		}
		if(type==2) {
			int[] xp = new int[] { x + (width-5), x+width, x+5, x};
			int[] yp = new int[] { y, y+5, y+height, y+(height-5)};
			g.fillPolygon(xp, yp, 4);
		}
		
	}

	@Override
	protected Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
