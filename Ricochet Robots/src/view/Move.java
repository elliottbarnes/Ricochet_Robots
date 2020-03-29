package view;

public class Move {
	Handler handler;
	public Move(Handler handler) {
		this.handler = handler;
	}
	
	public void up() {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot) {
				gm.tick();
				gm.setVelY(-5);
				gm.setVelX(0);
			}
		}
	}
	public void down() {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot) {
				gm.tick();
				gm.setVelY(5);
				gm.setVelX(0);
			}
		}
	}
	public void right() {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(5);
			}
		}
	}
	public void left() {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(-5);
			}
		}
	}
	
}
