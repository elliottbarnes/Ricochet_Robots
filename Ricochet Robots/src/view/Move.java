package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Move {
	Handler handler;
	int tokenNum;
	JFrame frame;
	ChangeToken next;
	int player;
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public Move(Handler handler, JFrame frame, ChangeToken next) {
		this.handler = handler;
		this.frame = frame;
		this.next = next;
	}
	
	public int getTokenNum() {
		return tokenNum;
	}

	public void setTokenNum(int tokenNum) {
		this.tokenNum = tokenNum;
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
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=0;
					gm.y+=-5;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
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
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=0;
					gm.y+=5;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
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
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=5;
					gm.y+=0;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
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
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot2 && num ==2) {
				gm.tick();
				while(collision2(gm, ID.Robot2)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot3 && num ==3) {
				gm.tick();
				while(collision2(gm, ID.Robot3)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
			if(gm.getId() == ID.Robot4 && num ==4) {
				gm.tick();
				while(collision2(gm, ID.Robot4)==false) {
					gm.x+=-5;
					gm.y+=0;
				}
				setNewPosition(gm);
				if(tokenTaken(gm, getIDToken(getTokenNum()))) message();
			}
		}
	}
	
	public void setNewPosition(GameObject gm) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject go = handler.object.get(i);
			if(go.getId() == ID.Cell) {
				if(gm.getBounds().intersects(go.getBounds())) {
					int middlex = go.getX() + (go.getWidth()/2);
					int middley = go.getY() + (go.getHeight()/2);
					gm.x=middlex-11;
					gm.y=middley-11;
					
				}
			}
			
		}
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
	
	public boolean tokenTaken(GameObject gm, ID id) {
		for(int i=0; i<handler.object.size(); i++) {
			GameObject go = handler.object.get(i);
			if(go.getId() == id) {
				if(gm.getBounds().intersects(go.getBounds())) {
					if(gm.getId() == ID.Robot &&(tokenNum==1 || tokenNum==5 || tokenNum==9 || tokenNum==13)) return true;
					if(gm.getId() == ID.Robot2 &&(tokenNum==2 || tokenNum==6 || tokenNum==10 || tokenNum==14)) return true;
					if(gm.getId() == ID.Robot3 &&(tokenNum==3 || tokenNum==7 || tokenNum==11 || tokenNum==15)) return true;
					if(gm.getId() == ID.Robot4 &&(tokenNum==4 || tokenNum==8 || tokenNum==12 || tokenNum==16)) return true;
				}
			}
		}
		return false;
	}
	
	public ID getIDToken(int num) {
		switch(num){
			case 1:
				return ID.Token1;
			case 2:
				return ID.Token2;
			case 3:
				return ID.Token3;
			case 4:
				return ID.Token4;
			case 5:
				return ID.Token5;
			case 6:
				return ID.Token6;
			case 7:
				return ID.Token7;
			case 8:
				return ID.Token8;
			case 9:
				return ID.Token9;
			case 10:
				return ID.Token10;
			case 11:
				return ID.Token11;
			case 12:
				return ID.Token12;
			case 13:
				return ID.Token13;
			case 14:
				return ID.Token14;
			case 15:
				return ID.Token15;
			case 16:
				return ID.Token16;
			default:
				return null;
		}
	}
	
	public void message() {
		int confirmed = JOptionPane.showConfirmDialog(frame, 
		        "Next Token", "Token Taken", JOptionPane.OK_OPTION);

		    if (confirmed == JOptionPane.OK_OPTION) {
		    	next.next(handler, frame);
		    }else {
		    	//nothing
		    }
	}
}
