package arrayhandsOn;
import java.util.*;
public class Hands_on_2_mSum5 {
	public static void main(String[] args) {
		int[] My_record= {10,10,10,10,20,20,20,20,40,40,50,50,30};
		Arrays.sort(My_record);
		int[] unique=new int[My_record.length];
		int count=0,freq=0;
		for(int i=0;i<My_record.length-1;i++) {
			if(My_record[i]!=My_record[i+1]) {                        
				unique[count++]=My_record[i];  
				freq++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println("the element "+unique[i]+" occurs:"+freq);
		}
	}

}
