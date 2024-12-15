public class Motorcycle extends Vehicule {
  boolean hashelmet = false;
    
  public Motorcycle(String brand,int Speed,boolean hashelmet) {
	    	 super(brand,Speed);
	    	 this .hashelmet = hashelmet;
  }
	public String toString() {
		
		return super.toString()+"hashelmet"+this.hashelmet;
	}
	
}
