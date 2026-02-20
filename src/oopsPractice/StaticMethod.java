package oopsPractice;
/* this is example demonstrates static member created for the theater screen class*/
class TheatreScreen{
	private static int totalSeat=20;   //static variable
	
	TheatreScreen(){
		System.out.println("Current seat Availability:"+totalSeat);
	}
	
	public void displayTheatreScreen() {
		System.out.println("Current seat availability:"+totalSeat);
	}
	
	public static void bookTicket(int tickets) {       //static method
		System.out.println("No.of .Seats Bookes:"+tickets);
		totalSeat-=tickets;
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		System.out.println("Scren avalability status:");
		TheatreScreen tScreen=new TheatreScreen();
		tScreen.bookTicket(5);
		
		TheatreScreen tScreen2=new TheatreScreen();
		tScreen2.bookTicket(5);
		
		tScreen.displayTheatreScreen();
		
		
		
		

	}

}
