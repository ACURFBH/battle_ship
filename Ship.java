
public abstract class Ship {
	//data field
	private int bowRow;//row containing front of ship
	private int bowColumn;//column of front of ship
	private int length;//number of squares occupied by ship
	private boolean horizontal;
	private boolean[] hit;//size is 8 to record hits
	
	//methods
	public int getBowRow() {
		return bowRow;
	}
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}
	public int getBowColumn() {
		return bowColumn;
	}
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isHorizontal() {
		return horizontal;
	}
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	public boolean[] getHit() {
		return hit;
	}
	public void setHit(int length) {
		this.hit = new boolean[length];
	}
	private boolean hasDamage(){//tells if the ship has any damage
		int i=this.hit.length-1;
		while(i>=0){
			if(this.hit[i]){
				return true;
			}
			i--;
		}return false;
	}
	public abstract String getShipType();
	public boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean){
		return false;//write method
	}
	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean){
		//write method
	}
	public boolean shootAt(int row, int column){
		return false;//write method
	}
	public boolean isSunk(){
		return false;//write method
	}
	public String toString(){//x: sunken	-:fired but nothing there	S:ship that you hit .:never shot
		if(this.isSunk()){//ship is sunken
			return "x";//sunken ship
		}else if(this.hasDamage()){//ship has damage
			return "S";
		}else if(this.getShipType().equals("empty") && this.getHit()[0]){//shot but nothing there
			return "-";
		}else{//never shot
			return ".";
		}
	}
	
}
