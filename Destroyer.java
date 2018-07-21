
public class Destroyer extends Ship{
	//Constructor
		protected Destroyer(){
			this.setLength(4);
			this.setHit(4);
		}
		
		//methods
		public String getShipType(){
			return "Destroyer";
		}
}
