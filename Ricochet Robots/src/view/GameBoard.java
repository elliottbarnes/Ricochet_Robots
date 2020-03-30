package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class GameBoard implements Runnable{

	private GameGUI gameGui;
	private Thread thread;
	private boolean running = false;
	private BufferStrategy bs;
	private Graphics g;
	private Handler handler;
	
	public static final int WIDTH=600, HEIGHT=600; 
	
	public GameBoard() { 
		handler = new Handler();
		handler.addObject(new Barrier(0, 0, 8, 600, ID.Barrier));
		handler.addObject(new Barrier(0, 0, 600, 8, ID.Barrier));
		handler.addObject(new Barrier(584, 0, 8, 600, ID.Barrier));
		handler.addObject(new Barrier(0, 584, 600, 8, ID.Barrier));
		handler.addObject(new Barrier(258, 258, 74, 74, ID.Barrier));
		handler.addObject(new Barrier(69, 0, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(0, 218, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(0, 440, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(254, 554, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(554, 402, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(554, 144, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(36, 72, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(70, 74, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(110, 256 , 36, 8, ID.Barrier));
		handler.addObject(new Barrier(110, 221, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(148, 36 , 36, 8, ID.Barrier));
		handler.addObject(new Barrier(148, 36, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(254, 110, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(222, 144, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(333, 106, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(365, 72, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(440, 0, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(482, 36, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(478, 36, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(518, 184, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(518, 217, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(406, 221, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(440, 221, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(37, 366, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(70, 332, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(148, 402, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(147, 368, 8, 36, ID.Barrier));	
		handler.addObject(new Barrier(110, 517, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(110, 517, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(185, 480, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(218, 480, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(295, 369, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(328, 369, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(518, 365, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(514, 332, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(480, 440, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(480, 407, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(369, 480, 36, 8, ID.Barrier));
		handler.addObject(new Barrier(369, 481, 8, 36, ID.Barrier));
		handler.addObject(new Barrier(444, 555, 8, 36, ID.Barrier));
		
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
		
		
		
		
		
		
		
		
		
		handler.addObject(new Robot(8, 8, 28, 28, ID.Robot, handler));
		handler.addObject(new Robot(40, 8, 28, 28, ID.Robot2, handler));
		handler.addObject(new Robot(74, 8, 28, 28, ID.Robot3, handler));
		handler.addObject(new Robot(106, 8, 28, 28, ID.Robot4, handler));
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
		
		for(int col=0; col<WIDTH-8; col=col+(WIDTH/16)) {
			for(int row=0; row<HEIGHT-8; row=row+(HEIGHT/16)) {
				g.setColor(Color.lightGray);
				g.fillRect(col, row, (WIDTH/16)-1, (HEIGHT/16)-1);
			}
		}
		
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
