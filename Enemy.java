
public class Enemy extends Character {
private String name;
private int health;
private int level;

public Enemy(String name,int health,int damage) {
	super(name,health,level);
	this.damage = damage;
}
public int getDamage(){
	return damage;
}
public String toString() {
	return super.toString()
		Damage + damage"/n";

}

}
