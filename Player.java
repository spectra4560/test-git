// vadim koltanyok
// 315433201

package avoda1;

public class Player extends Character {
	private Item[] inventory; 
	
	//Done
	Player(String name, int health, int level){
		super(name, health, level);
		this.inventory = new Item[0];
	}
	
	//Done
	Player(String name, int health, int level, Item[] inventory){
		super(name, health, level);
		this.inventory = inventory;
		this.inventory = new Item[0];
	}
	
	//Done
	public void addItem(Item item) {
		Item[] tempInventory = new Item[this.inventory.length+1];
		for(int i=0; i<this.inventory.length; i++) {
			tempInventory[i] = this.inventory[i];
		}
		tempInventory[this.inventory.length] = item;
		this.inventory = tempInventory;
	}
	
	//Done
	public int calculateInventoryValue() {
		int sum = 0;
		for(int i=0; i < this.inventory.length; i++) {
			sum += this.inventory[i].getValue();
		}
		return sum;
	}
	
	//Done
	public boolean hasMagicalItem() {
		for(int i=0; i < this.inventory.length; i++) {
			if(this.inventory[i].isMagical()) {
				return true;
			}
		}
		return false;
	}
	
	//Done
	public String toString() {
		String returnString =super.toString() + "inventory: ";
		for(int i=0; i < this.inventory.length; i++) {
			returnString += this.inventory[i].getName();
			if (i < this.inventory.length - 1) {
	            returnString += " | ";
	        }
		}
		returnString += "\n";
		return returnString;
	}
}
