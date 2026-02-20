package oopsPractice;
class TheatreShow{
	int theatreID=5455;
	String theatreName="INOX";
	String theatreLocation="Salem";
	public void displayDetails() {
		System.out.println("Theatre ID:"+theatreID);
		System.out.println("Theatre Name:"+theatreName);
		System.out.println("Theatre Location:"+theatreLocation);
	}
}
public class Theatre {
		
	public static void main(String[] args) {
		TheatreShow th= new TheatreShow();
		th.displayDetails();
		
		TheatreShow th1;   /// declare the reference
		th1=new TheatreShow();   // then instantiate
	}

}
