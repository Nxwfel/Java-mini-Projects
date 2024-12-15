
public class Car extends Vehicule {
     int Gear;
     public Car(String brand,int Speed,int Gear ){
    	 super(brand,Speed);
    	 this.Gear = Gear;
    	 }
     void Changegear(int newGear) {
    	 this.Gear = newGear;
     }
 	public String toString() {
 		
 		return  super.toString() + "Gear = "+this.Gear;
 	}
 	
}
