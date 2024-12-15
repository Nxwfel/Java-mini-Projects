
public class Point {
   private double x;
   private double y;

   public double get_x() {
	   return this.x;
   }
   
   public double get_y() {
	   return this.y;
   }
    public void set_x(double x){
    	this.x = x;
    }
    public void set_y(double y){
    	this.y = y;
    }
    
   public Point(double x,double y) {
	   
   }
   
   public double move_x(double step) {
	   this.x = this.x + step;
	   return this.x ;
	   
   }
   public double move_y(double step) {
	   this.y = this.y + step;
	   return this.y ;
   }
   public double distance(Point P2) {
	   double distance_x = Math.pow(P2.get_x() - this.x, 2);
	   double distance_y = Math.pow(P2.get_y() - this.y, 2);
	   double distance = Math.sqrt(distance_x + distance_y);
	   return distance;
	   
   }

   
}
