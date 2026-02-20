package oopsPractice;
class TheatreConstructor{
	int theatreID;
	String theatreName;
	int totalScreen;
	String theatreLocation;
	TheatreConstructor(int ID,String name,int screen,String location) {
		theatreID=ID;
		theatreName=name;
		totalScreen=screen;
		theatreLocation=location;
	}
	public void gettheatre() {
		System.out.println("Theatre ID:"+theatreID);
		System.out.println("Theatre Name:"+theatreName);
		System.out.println("Theatre Screens:"+totalScreen);
		System.out.println("Theatre Location:"+theatreLocation);
	}
}
public class ParamatarizedConstructor {

	public static void main(String[] args) {
		TheatreConstructor T=new TheatreConstructor(0, null, 0, null);
		T.gettheatre();
	}

}
