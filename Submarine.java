
public class Submarine extends Ship{
	//Constructor
		protected Submarine(){
			this.setLength(3);
			this.setHit(3);
		}
		
		//methods
		public String getShipType(){
			return "SubMarine";
		}
}
