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
				while(collision2(gm, ID.Robot)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				gm.y+=7;
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				gm.y+=7;
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				gm.y+=7;
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				gm.x+=7;
			}
		}
	}
	public void down(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				gm.tick();
				while(collision2(gm, ID.Robot)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				gm.y+=-7;
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				gm.y+=-7;
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				gm.y+=-7;
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				gm.y+=-7;
			}
		}
	}
	public void right(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				gm.tick();
				while(collision2(gm, ID.Robot)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				gm.x+=-7;
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				gm.x+=-7;
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				gm.x+=-7;
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				gm.x+=-7;
			}
		}
	}
	public void left(int num) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject gm = handler.object.get(i);
			if(gm.getId() == ID.Robot && num ==1) {
				
				gm.tick();
				while(collision2(gm, ID.Robot)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				gm.x+=7;
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				gm.x+=7;
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				gm.x+=7;
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				gm.x+=7;
			}
		}
	}
	
	public boolean collision(GameObject gm) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject go = handler.object.get(i);
			if(go.getId() == ID.Barrier) {
				if(gm.getBounds().intersects(go.getBounds())) {
					return true;
				}
			}
			
		}
		return false;
	}
	public boolean collision2(GameObject gm, ID iden) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject go = handler.object.get(i);
			if(go.getId() == ID.Barrier) {
				if(gm.getBounds().intersects(go.getBounds())) {
					return true;
				}
			}
			if(iden==ID.Robot) {
				if(go.getId() == ID.Robot2) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot3) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot4) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
			}
			if(iden==ID.Robot2) {
				if(go.getId() == ID.Robot) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot3) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot4) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
			}
			if(iden==ID.Robot3) {
				if(go.getId() == ID.Robot2) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot4) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
			}
			if(iden==ID.Robot4) {
				if(go.getId() == ID.Robot2) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot3) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
				if(go.getId() == ID.Robot) {
					if(gm.getBounds().intersects(go.getBounds())) {
						return true;
					}
				}
			}
			
			
		}
		return false;
	}
	
}
