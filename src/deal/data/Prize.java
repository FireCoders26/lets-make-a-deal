package deal.data;
/*******************
 * Team: DragonArmy26
 * Author: Hyrum Smith
 * 
 ******************/
import java.util.Random;
public class Prize {
	//fields
	  //Game extras
	Random rand = new Random();
	  //Game objects
	String name;
	String prize;
	String container;
	String[] oNames = {"Zonk", "Ford Fiesta", "Ski Gear", "Zonk", "Camera", "Kitchen", "Zonk"};
	String[] pNames = {"Zonk", "Check", "Cashs", "Winter Vacation", "Zonk", "Summer Vacation"};
	String[] oContainers = {"Curtain1", "Curtain2", "Curtain3", "Door1", "Door2", "Door3", "Big box", "Box"};
	String[] pContainers = {"magazine", "envelope"};
	int value;
	
	//ctors
	public Prize(String oN){
		name = oN;
		prize = oNames[rand.nextInt()];
		
	}
	
	//methods
	public String getoName(){
		return name;
	}
	public String getPrize(){
		return prize;
	}
	public int getValue(){
		return value;
	}
	
	
	
	

}
