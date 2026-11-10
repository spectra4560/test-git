package avoda1;

public class Character {
	private String name;
	private int health;
	private int level;
	
	//
	Character(String name, int health, int level){
		this.name = name;
		this.health = setHealth(health);
		this.level = setLevel(level);
	}
	//Done
	Character(){
		this("Unknown", 0, 0);
	}
	//Done
	public int setHealth(int health) {
		if(health >= 0 && health <= 10) {
			return health;
		}else {
			return 0;
		}
	}
	//Done
		public int setLevel(int level) {
			if(level >= 0 && level <= 5) {
				return level;
			}else {
				return 0;
			}
		}
	//Done
	public String getName() {
		return this.name;
	}
	//Done
	public int getHealth() {
		return this.health;
	}
	//Done
	public int getLevel() {
		return this.level;
	}
	//Done
	public void levelUp() {
		if(this.getLevel() < 5) {
			this.level ++;
		}
	}
	//Done
	public void heal(int amount) {
		if(amount > 0) {
			this.health = this.getHealth() + amount;
			if(this.getHealth() > 10) {
				this.health = 10;
			}
		}
	}
	//Done
	public String toString() {
		String returnString = "Name: "+this.getName() +"\n" +
				"Health: " + this.getHealth() + "\n" +
				"Level: " + this.getLevel() + "\n";
		
		return returnString;
	}
}
