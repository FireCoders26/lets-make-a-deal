/*******************
 * Team: DragonArmy26
 * Author: Hyrum Smith
 * 
 ******************/
public class Player {
	//fields
	private String name;
	private int prizeValue;
	
	//ctors
	public Player(String n){
		name = n;
	}
	
	//methods
	public void setPrizeValue(int p){
		prizeValue = p;
	}
	public String getName(){
		return name;
	}
	public int getPrizevalue(){
		return prizeValue;
	}
}
