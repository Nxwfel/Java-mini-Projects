public class Vehicule{
	String brand;
	double Speed;

	void accelerate(double increase) {
		this.Speed += increase; 
	}
    
	void brake(double decrease) {
		this.Speed -= decrease;
	}
	public String toString() {
		return "Brand: "+this.brand+"\n Speed:"+this.Speed;
	}
	public static void main(String[] args){
		Truck ACTROS = new Truck("Mercedes",120,12);
		Motorcycle Z1000 = new Motorcycle("Suzuki",300,false);
		Car M3 = new Car("BMW",300,4);
	}
	public Vehicule(String brand,double Speed) {
		this.brand = brand;
		this.Speed = Speed;
	}
}