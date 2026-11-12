// vadim koltanyok
// 315433201

package avoda1;


public class Enemy extends Character {
	private int damage;

	//Done
	public Enemy(String name, int health, int level, int damage) {
		super(name, health, level);
		if(damage <=5 && damage >0) {
			this.damage = damage;
		}else {
			this.damage = 0;
		}
	}
	//Done
	public int getDamage(){
		return damage;
	}
	//Done
	public String toString() {
		String returnString = super.toString();
		returnString += "Damage: " + damage + "\n";
		return returnString;
	}
}
