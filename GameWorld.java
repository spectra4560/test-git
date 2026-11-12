// vadim koltanyok
// 315433201

package avoda1;

public class GameWorld{
	private String name;
	private Player[] players;
	private Enemy[] enemies;
	private int difficulty;
	
	
	//Done
	public GameWorld(String name, Player[] players, Enemy[] enemies, int difficulty){
		this.name = name;
		this.players = players;
		this.enemies = enemies;
		
		if (difficulty >= 1 && difficulty <= 3) {
            this.difficulty = difficulty;
        } else {
            this.difficulty = 1;
        }
	}
	//Done
	public GameWorld() {
		this.name = "Crystalpath";
		this.difficulty = 1;
		players = new Player[0];
		enemies = new Enemy[0];
	}
	//Done
	public void addPlayer(Player player) {
		Player[] tempPlayers = new Player[this.players.length+1];
		for(int i=0; i<this.players.length; i++) {
			tempPlayers[i] = this.players[i];
		}
		tempPlayers[this.players.length] = player;
		this.players = tempPlayers;
	}
	//Done
	public void printAllPlayers() {
		for(int i=0; i<this.players.length; i++) {
			System.out.println("------------- Player "+ (i+1) +" -------------");
			System.out.println(this.players[i].toString());
		}
	}
	//Done
	public void getTotalValueOfWorld() {
		int sum=0;
		for(int i=0; i<this.players.length; i++) {
			sum += this.players[i].calculateInventoryValue();
		}
		System.out.println("max sum: "+sum);
	}
	//Done
	public String toString() {
		String returnString = "World Name: "+this.name + "\n";
		returnString += "Difficulty: "+this.difficulty + "\n";
		returnString += "Number of players: "+this.players.length;
		return returnString;
	}
}
