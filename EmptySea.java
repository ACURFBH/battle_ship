
public class EmptySea extends Ship{
		//Constructor
		protected EmptySea(){
			super.setLength(1);
			super.setHit(1);//not sure if i need this line
		}
		
		//methods
		public String getShipType(){
			return "empty";
		}
		@Override
		public boolean shootAt(int row, int comlumn){
			return false;//nothing is ever hit
		}
		@Override
		public boolean isSunk(){
			return false;//nothing is ever sunk
		}
		@Override
		public String toString(){
			return "-";
		}
		
}
