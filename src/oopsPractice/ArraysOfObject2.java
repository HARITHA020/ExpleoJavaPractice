package oopsPractice;
class Theatre1{
	int theatreID;
	String theatreName;
	int totalScreen;
	String theatreLocation;
	public void setDetails(int theatreID,String theatreName,int totalScreen,String theatreLocation) {
		this.theatreID=theatreID;
		this.theatreName=theatreName;
		this.totalScreen=totalScreen;
		this.theatreLocation=theatreLocation;
		
	}
	public void getDetails() {
		System.out.println("Theatre ID:"+theatreID);
		System.out.println("Theatre Name:"+theatreName);
		System.out.println("Theatre Screens:"+totalScreen);
		System.out.println("Theatre Location:"+theatreLocation);
	}
}

public class ArraysOfObject2 {

	public static void main(String[] args) {
		Theatre1 th[]=new Theatre1[2];
		for(int i=0;i<2;i++) {
			th[i]=new Theatre1();
		}
		th[0].setDetails(1, "ARRS", 4, "Salem");
		th[0].getDetails();
		
		th[1].setDetails(2, "INOX", 4, "Salem");
		th[1].getDetails();
		

	}

}
