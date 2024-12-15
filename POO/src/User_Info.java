
public class User_Info {
	
	String name;
	private long _phone_number;
	String membership;
	
    void Set_name(String name) {
    	this.name = name;
    }
    void Set_name(int name) {
    	System.out.println("Stupiddd i said a name");
    }
    
    void Set_phone_number(long phone_number) {
    	_phone_number = phone_number;
    }
    
    void Set_membership(Membership membership) {
    	this.membership = membership.name(); 
    }
    

	public enum Membership {
	    Cardio,Bodybuilding,Crossfit;
	}
}
