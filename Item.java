// vadim koltanyok
// 315433201

package avoda1;

public class Item {
	private String name;
	private int value;
	private boolean isMagical;
	
	//Done
	Item(String name, int value, boolean isMagical){
		this.name = name;
		setValue(this.value);
		this.isMagical = isMagical;
	}
	//Done
	Item(){
		this("Unknown", 0, false);
	}
	//Done
	public String toString() {
		String stringReturn = "";
		
		stringReturn += "Name: " + this.name + "\n";
		stringReturn += "Value: " + this.value + "\n";
		if(this.isMagical) {
			stringReturn += "Magical item\n\n";
		}else {
			stringReturn += "Not a magical item\n";
		}
		
		return stringReturn;
	}
	//Done
	public int getValue() {
		return this.value;
	}
	//Done
	public void setValue(int value) {
		if(value > 0) {
			this.value = value; 
		}else {
			this.value = 0;
		}
		
	}
	//Done
	public boolean isMagical() {
		return this.isMagical;
	}
	// Done
	public String getName() {
		return name;
	}
}
