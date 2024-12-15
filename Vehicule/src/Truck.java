
public class Truck extends Vehicule{
	int loadCapacity;
   public Truck(String brand,int Speed,int loadCapacity) {
	   super(brand,Speed);
      
   }
	public String toString() {
		
		return super.toString()+"loadCapacity"+this.loadCapacity;
	}
}
