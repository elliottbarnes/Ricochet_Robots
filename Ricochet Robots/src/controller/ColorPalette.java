package controller;
import java.awt.*;

public abstract class ColorPalette {
	
	public Color classic1,classic2,classic3, vivid1, vivid2,vivid3, visionI1,visionI2,visionI3;
	
	public void ClassicPalette() {
		
		classic1 = Color.decode("#A7414A"); //darkRed
		classic2 = Color.decode("#6A8A82"); //grayCyan
		classic3 = Color.decode("282726"); //black
		
	}
	
	public void VisionPalette() {
		
//		visionI1 = Color.decode("EED971FF"); //orangeYellow
//		visionI2 = Color.decode("FFBE7BFF"); //paleOrange
//		visionI3 = Color.decode("FFA351FF"); //darkOrange

	}
	
	public void VividPalette() {
		
		vivid1 = Color.decode("#D91D81"); //vividCerise
		vivid2 = Color.decode("#FFE302"); //vividYellow
		vivid3 = Color.decode("#00AAEE"); //vividCerulean
		
	}

	public ColorPalette() {
		ClassicPalette();
		VisionPalette();
		VividPalette();
	}
}
