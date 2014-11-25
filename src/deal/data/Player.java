package deal.data;

/*******************
 * Team: DragonArmy26 
 * Author: Hyrum Smith
 * 
 ******************/
import java.util.Scanner;
public class Player {
	// fields
	private String name;
	private String prizeName;
	private int prizeValue;
	private Scanner input = new Scanner(System.in);

	// ctors
	public Player(String n) {
		name = n;
	}

	// methods
	public void setPrizeValue(int p) {
		prizeValue = p;
	}

	public String getName() {
		return name;
	}

	public int getPrizevalue() {
		return prizeValue;
	}
	public String getPrizeName(){
	 return prizeName;	
	}
	public void setPrizeName(String p){
		prizeName = p;
	}
	
	//Question about a switch statement
	public Prize returnChoice(Player player, Prize p1, Prize p2){
		String choise = input.nextLine();
		if(choise.equals(p1.getContainer())){
			player.setPrizeName(p1.getoName());
			return p1;
		}else if(choise.equals(p2.getContainer())){
			player.setPrizeName(p2.getoName());
			return p2;
		}else
			player.setPrizeName(p1.getoName());
			return p1;
	}
	
    //Question for money
	public Prize moneyChoice(Player player, Prize p1, int money){
		
		return null;
	}
}
