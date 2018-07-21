
public class Ocean {
	//datafield
	private Ship[][] ships = new Ship[20][20];
	private int shotsFired = 0;//total shots fired by player
	private int hitCount = 0;//total number of hits
	private int shipsSunk = 0;//there are 13 to sink
	
	//constructor
	protected Ocean(){
		EmptySea e = new EmptySea();
		for(int i=0; i<20; i++){
			for(int j=0; j< 20; j++){
				this.ships[i][j] = e;
			}
		}
	}
	
	//methods
	public void placeAllShipsRandomly(){//work on this method
		//place BattleShip
		//place BattleCruiser
		//place Cruiser
		//place lightCruiser
		//place destroyer
		//place Submarine
	}
	public boolean isOccupied(int row, int column){
		if(ships[row][column] instanceof EmptySea){
			return false;
		}
		return true;
	}
	public boolean shootAt(int row, int column){
		this.hitCount++;
		this.shotsFired++;
		if(ships[row][column] instanceof EmptySea){
			return false;
		}
		return true;
	}
	public int getShotsFired(){
		return this.shotsFired;
	}
	public int getHitCount(){
		return this.hitCount;
	}
	public int getShipsSunk(){
		return this.shipsSunk;
	}
	public boolean isGameOver(){
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if(!(this.ships[i][j] instanceof EmptySea) && !(this.ships[i][j].isSunk())){
					return false;
				}
			}
		}
		return true;
	}
	public Ship[][] getShipArray(){
		return this.ships;
	}
	public void print(){
		System.out.println("  \t00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19");
		for(int i=0; i<20; i++){
			System.out.printf("%2d\t", i);
			for(int j=0; j<20; j++){
				System.out.print(this.ships[i][j]);
			}
		}
	}
	
}
