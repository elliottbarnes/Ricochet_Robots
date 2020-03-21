package controller;
import java.awt.*;

public abstract class ColorPalette {
	
	public Color normal1, normal2, normal3, normal4,
	deut1, deut2, deut3, deut4,
	prot1, prot2, prot3, prot4,
	trit1, trit2, trit3, trit4;
	
	
	public void Normal() {
		normal1 = Color.decode("0000c1"); //blue
	}
	
	public void Deut() {
		deut1 = Color.decode(""); //blue deut
	}
	
	public void Prot() {
		
	}

	
	public void Trit() {
		Normal();
	}
}
