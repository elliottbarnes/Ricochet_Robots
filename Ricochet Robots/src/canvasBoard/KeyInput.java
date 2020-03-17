package canvasBoard;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	Handler handler = new Handler();
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	public void keyPressed(KeyEvent e ) {
		int key = e.getKeyCode();
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot) {
				if(key == KeyEvent.VK_UP) gm.setVelY(-5);
				if(key == KeyEvent.VK_DOWN) gm.setVelY(5);
				if(key == KeyEvent.VK_LEFT) gm.setVelX(-5);
				if(key == KeyEvent.VK_RIGHT) gm.setVelX(5);
			}
		}
	}
	public void keyReleased(KeyEvent e ) {
		int key = e.getKeyCode();
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot) {
				if(key == KeyEvent.VK_UP) gm.setVelY(0);
				if(key == KeyEvent.VK_DOWN) gm.setVelY(0);
				if(key == KeyEvent.VK_LEFT) gm.setVelX(0);
				if(key == KeyEvent.VK_RIGHT) gm.setVelX(0);
			}
		}
	}
	
	public boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if(mx > x && mx < x+width) {
			if(my > y && my < y+height) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
