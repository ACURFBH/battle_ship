
public class BattleShip extends Ship{
	//Constructor
	protected BattleShip(){
		this.setLength(8);
		this.setHit(8);
	}
	
	//methods
	public String getShipType(){
		return "BattleShip";
	}
}
