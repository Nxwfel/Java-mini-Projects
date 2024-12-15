import java.util.Scanner;
public class POO {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       double x,y,x2,y2;
       
       System.out.println("Enter the Value of x then y");
       x = obj.nextDouble();
       y = obj.nextDouble();
       
       System.out.println("Enter the Value of x then y of the second point");
       x2 = obj.nextDouble();
       y2 = obj.nextDouble();
       
       Point P1 = new Point(x,y);
       Point P2 = new Point(x2,y2);
        
       P1.set_x(x);
       P1.set_y(y);
       
       P2.set_x(x2);
       P2.set_y(y2);
       
   
       x = P1.get_x();
       y = P1.get_y();
       
       
       System.out.println("The distance ="+P2.distance(P1));
       System.out.println("Override:"); 
       P1.move_x(3.0);
       P1.move_y(3.0);
    }
    
}