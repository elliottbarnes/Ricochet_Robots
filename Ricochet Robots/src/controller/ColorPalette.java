package controller;
import java.awt.*;

public abstract class ColorPalette {
	
	public Color normal1, normal2, normal3, normal4, normal5, normal6, normal7, normal8, normal9, normal10, normal11, normal12, normal13, normal14, normal15, normal16, normal17, normal18,
	deut1, deut2, deut3, deut4, deut5, deut6, deut7, deut8, deut9, deut10, deut11, deut12, deut13, deut14, deut15, deut16, deut17,deut18,
	prot1, prot2, prot3, prot4, prot5, prot6, prot7, prot8, prot9, prot10, prot11, prot12, prot13, prot14, prot15, prot16, prot17, prot18,
	trit1, trit2, trit3, trit4, trit5, trit6, trit7,trit8, trit9, trit10, trit11, trit12, trit13, trit14, trit15, trit16, trit17, trit18;
	
	
	public void Normal() {
		normal1 = new Color(0,0,255); //blue
		normal2 = new Color(0,255,0); //green
		normal3 = new Color(255, 0, 0); //red
		normal4 = new Color(255, 255, 0); //yellow
		normal5 = new Color(202,103,120); //player1Color
		normal6 = new Color(139,205,237); // player2Color
		normal7 = new Color(221,203,124); // player3Color
		normal8 = new Color(73,170,153); // player4Color
		normal9 = new Color(16,116,176); // reset button
		normal10 = new Color(211,94,26); //gameTimer
		normal11 = new Color(0,0,0); //fileMenu
		normal12 = new Color(229,158,37); //menuItem1
		normal13 = new Color(91,181,231); // menuItem2
		normal14 = new Color(22,157,116);
		normal15 = new Color(120,100,237); // bidbutton
		normal16 = new Color(252, 98, 32); //bidsLabel
		normal17 = new Color(103,146,252); //scoresLabel
		normal18 = new Color(253,175,42); // tokenButton
	}
	
	public void Deut() {
		deut1 = new Color(0,60,98); //blue deut
		deut2 = new Color(49,37,10); //green deut
		deut2 = new Color(75, 56, 0); //red deut
		deut4 = new Color(255, 210, 144); //yellow deut
		deut5 = new Color(154,127,113); // player1Deut
		deut6 = new Color(188,191,240); // player2Deut
		deut7 = new Color(246,192,126); // player3Deut
		deut8 = new Color(165,148,159); //player4Deut
		deut9 = new Color(63,11,176);// reset
		deut10 = new Color(163,121,25);
		deut11 = new Color(0,0,0);
		deut12 = new Color(218,161,36);
		deut13 = new Color(145,169,235);
		deut14 = new Color(157,132,124);
		deut15 = new Color(18,123,203);
		deut16 = new Color(186,138,30);
		deut17 = new Color(63,151,249);
		deut18 = new Color(242,179,42);
		
		
	}
	
	public void Prot() {
		prot1 = new Color(0,56,116); //blue prot
		prot2 = new Color(44,39,0); //green prot
		prot3 = new Color(67, 59, 14); //red prot
		prot4 = new Color(246, 218, 0); //yellow deut
		prot5 = new Color(135,132,133); 
		prot6 = new Color(186,193,230);
		prot7 = new Color(222,201,123);
		prot8 = new Color(158,152,144);
		prot9 = new Color(84,108,169);
		prot10 = new Color(146,128,33);
		prot11 = new Color(0,0,0);
		prot12 = new Color(193,171,41);
		prot13 = new Color(153,168,222);
		prot14 = new Color(147,137,108);
		prot15 = new Color(19,118,234);
		prot16 = new Color(166,146,39);
		prot17 = new Color(96,146,252);
		prot18 = new Color(214,189,45);
		
	}
	
	public void Trit() {
		trit1 = new Color(0,64,67); //blue trit
		trit2 = new Color(21,42,45); //green trit
		trit3 = new Color(118, 11, 0); //red trit
		trit4 = new Color(240, 209, 225); //yellow trit
		trit5 = new Color(200,104,113);
		trit6 = new Color(133,206,221);
		trit7 = new Color(230,193,207);
		trit8 = new Color(85,165,177);
		trit9 = new Color(15,120,127);
		trit10 = new Color(213,89,96);
		trit11 = new Color(0,0,0);
		trit12 = new Color(235,147,158);
		trit13 = new Color(74,185,199);
		trit14 = new Color(60,150,161);
		trit15 = new Color(82,125,134);
		trit16 = new Color(253,94,101);
		trit17 = new Color(56,161,173);
		trit18 = new Color(253,167,177);
	}

	
	public ColorPalette() {
		Normal();
		Deut();
		Prot();
		Trit();
	}
}
