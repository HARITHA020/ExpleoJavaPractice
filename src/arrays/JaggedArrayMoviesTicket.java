package arrays;

public class JaggedArrayMoviesTicket {

	public static void main(String[] args) {
		String[][] seat= new String[][] {{"B","A","A"},{"A","A","A","B","B"},{"A","B","B","B","B"},{"B","A","A","A"}};
		int VIPc=0,PremiumC=0,RegularC=0,VIPtotal=5,Premiumtotal=10,Regulartotal=5;
		System.out.println("----Movies seat arrangement----");
		
		for(int i=0;i<seat.length;i++) {
			if(i==0) {
				System.out.println("----Vip Seat----");
			}
			else if(i==1) {
				System.out.println("----Premium Seat----");
			}
			else if(i==3){
				System.out.println("----Regular seat----");
			}
			
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(" "+seat[i][j]+" ");
				if(i==0 && seat[i][j].equals("B")) {
					VIPc++;
				}
				else if(i>0 && i<3 && seat[i][j].equals("B")) {
					PremiumC++;
				}
				else if(i==3 && seat[i][j].equals("B")) {
					RegularC++;
				}
			}
			System.out.println();
		}
		
		System.out.println("----Seat booked Details");
		System.out.println("----VIP seat----");
		System.out.println("Booked:"+VIPc+" Available:"+(VIPtotal-VIPc)+" Total Seat:"+VIPtotal);
		System.out.println("----Premium seat----");
		System.out.println("Booked:"+PremiumC+" Available:"+(Premiumtotal-PremiumC)+" Total Seat:"+Premiumtotal);
		System.out.println("----Reegular seat----");
		System.out.println("Booked:"+RegularC+" Available:"+(Regulartotal-RegularC)+" Total Seat:"+Regulartotal);

	}

}
