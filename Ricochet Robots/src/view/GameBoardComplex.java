package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class GameBoardComplex implements Runnable {

	private GameGUI gameGui;
	private Thread thread;
	private boolean running = false;
	private BufferStrategy bs;
	private Graphics g;
	private Handler handler;
	
	public static final int WIDTH=600, HEIGHT=600; 
	
	public GameBoardComplex() { 
		handler = new Handler();
		
		//Cells
		for(int col=0; col<WIDTH-8; col=col+(WIDTH/16)) {
			for(int row=0; row<HEIGHT-8; row=row+(HEIGHT/16)) {
				handler.addObject(new BoardCell(col, row, ((WIDTH/16)-1), ((HEIGHT/16)-1), ID.Cell));
			}
		}
		//Borders
		handler.addObject(new Barrier(0, 0, 6, 600, ID.Barrier));
		handler.addObject(new Barrier(0, 0, 600, 6, ID.Barrier));
		handler.addObject(new Barrier(588, 0, 6, 600, ID.Barrier));
		handler.addObject(new Barrier(0, 588, 600, 6, ID.Barrier));
		//Middle
		handler.addObject(new Barrier(255, 255, 80, 80, ID.Barrier));
		//Inside

		
		//Tokens
		handler.addObject(new Token(334, 74, 28, 28, ID.Token, 1));
		handler.addObject(new Token(37, 80, 28, 28, ID.Token, 2));
		handler.addObject(new Token(298, 377, 28, 28, ID.Token, 3));
		handler.addObject(new Token(118, 526, 28, 28, ID.Token, 4)); 
		handler.addObject(new Token(39, 335, 28, 28, ID.Token, 5));
		handler.addObject(new Token(488, 410, 28, 28, ID.Token, 6)); 
		handler.addObject(new Token(155, 43, 28, 28, ID.Token, 7));
		handler.addObject(new Token(409, 230, 28, 28, ID.Token, 8));
		handler.addObject(new Token(118, 226, 28, 28, ID.Token, 9));
		handler.addObject(new Token(155, 372, 28, 28, ID.Token, 10));
		handler.addObject(new Token(487, 45, 28, 28, ID.Token, 11));
		handler.addObject(new Token(522, 335, 28, 28, ID.Token, 12));
		handler.addObject(new Token(377, 487, 28, 28, ID.Token, 13));
		handler.addObject(new Token(526, 188, 28, 28, ID.Token, 14));
		handler.addObject(new Token(188, 488, 28, 28, ID.Token, 15));
		handler.addObject(new Token(225, 113, 28, 28, ID.Token, 16));
		handler.addObject(new Token(186, 300, 28, 28, ID.Token, 17));
		
		//Robots
		handler.addObject(new Robot(10, 10, 22, 22, ID.Robot, handler));
		handler.addObject(new Robot(42, 10, 22, 22, ID.Robot2, handler));
		handler.addObject(new Robot(82, 10, 22, 22, ID.Robot3, handler));
		handler.addObject(new Robot(120, 10, 22, 22, ID.Robot4, handler));
	}

	private void tick() {
		
		
		
	}
	
	private void render() {
		bs = gameGui.getCanvas().getBufferStrategy();
		if(bs==null) {
			gameGui.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 600);
		
		handler.render(g);

		//End Drawing
		g.dispose();
		bs.show();
	}
	private void init() {
		gameGui = new GameGUI();
		gameGui.setHandler(handler);
	}
	public void run() {
		init();
		while(running) {
			tick();
			render();
		}
		stop();
	}

	public synchronized void start() {
		if(running) return;
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	public synchronized void stop() {
		if(!running) return;
		running = false;
		try {
			thread.join();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static int clamp(int var, int min, int max) {
		if(var>=max)
			return var = max;
		else if(var<=min) 
			return var = min;
		else
			return var;
	}
}
