
public class House {
   private String room;
   private Room[] Rooms = new Room[3];
   Room R1 = new Room("R1",3);
   Room R2 = new Room("R2",5);
   Room R3 = new Room("R3",2);
   public House(String name) {
	   Rooms[0]= R1;
	   Rooms[1]= R2;
	   Rooms[2]= R3;

   }
   
   
  }


