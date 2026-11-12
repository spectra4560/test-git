package avoda1;

public class Player extends Character {
	private Item[] inventory; 
	
	//Done
	Player(String name, int health, int level){
		super(name, health, level);
		this.inventory = new Item[0];
	}
	
	//
	
	//
	public void addItem(Item item) {
		Item[] tempInventory = new Item[this.inventory.length+1];
		for(int i=0; i<this.inventory.length; i++) {
			tempInventory[i] = this.inventory[i];
		}
		tempInventory[this.inventory.length] = item;
		this.inventory = tempInventory;
	}
	
	//
	public int calculateInventoryValue() {
		
	}
	
	//
	public boolean hasMagicalItem() {
		
	}
	
	//
	public void toString() {
		
	}
}
