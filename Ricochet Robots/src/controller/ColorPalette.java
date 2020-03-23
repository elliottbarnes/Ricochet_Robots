package controller;
import java.awt.*;

public abstract class ColorPalette {
	
	public Color normal1, normal2, normal3, normal4,
	deut1, deut2, deut3, deut4,
	prot1, prot2, prot3, prot4,
	trit1, trit2, trit3, trit4;
	
	
	public void Normal() {
		normal1 = new Color(0,0,255); //blue
		normal2 = new Color(0,255,0); //green
		normal3 = new Color(255, 0, 0); //red
		normal4 = new Color(255, 255, 0); //yellow
	}
	
	public void Deut() {
		deut1 = new Color(0,60,98); //blue deut
		deut2 = new Color(49,37,10); //green deut
		deut2 = new Color(75, 56, 0); //red deut
		deut4 = new Color(255, 210, 144); //yellow deut
	}
	
	public void Prot() {
		prot1 = new Color(0,56,116); //blue prot
		prot2 = new Color(44,39,0); //green prot
		prot3 = new Color(67, 59, 14); //red prot
		prot4 = new Color(246, 218, 0); //yellow deut
	}
	
	public void Trit() {
		trit1 = new Color(0,64,67); //blue trit
		trit2 = new Color(21,42,45); //green trit
		trit3 = new Color(118, 11, 0); //red trit
		trit4 = new Color(240, 209, 225); //yellow trit
	}

	
	public ColorPalette() {
		Normal();
		Deut();
		Prot();
		Trit();
	}
}
