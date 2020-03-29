package view;

public class Move {
	Handler handler;
	public Move(Handler handler) {
		this.handler = handler;
	}
	
	public void up(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				gm.tick();
				gm.setVelY(-5);
				gm.setVelX(0);
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				gm.setVelY(-5);
				gm.setVelX(0);
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				gm.setVelY(-5);
				gm.setVelX(0);
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				gm.setVelY(-5);
				gm.setVelX(0);
			}
		}
	}
	public void down(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				gm.tick();
				gm.setVelY(5);
				gm.setVelX(0);
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				gm.setVelY(5);
				gm.setVelX(0);
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				gm.setVelY(5);
				gm.setVelX(0);
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				gm.setVelY(5);
				gm.setVelX(0);
			}
		}
	}
	public void right(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(5);
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(5);
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(5);
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(5);
			}
		}
	}
	public void left(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(-5);
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(-5);
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(-5);
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				gm.setVelY(0);
				gm.setVelX(-5);
			}
		}
	}
	
}
