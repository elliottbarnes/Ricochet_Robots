package controller;

public class Bid {
	
	private String player;
	private int value;
	
	public Bid(String namePlayer, int bidValue) {
		player = namePlayer; 
		value = bidValue;
		}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void printBid() {
		System.out.printf(this.player, ", ", this.value, "\n");
	}

}
