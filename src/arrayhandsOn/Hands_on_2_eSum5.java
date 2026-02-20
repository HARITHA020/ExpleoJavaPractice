package arrayhandsOn;

import java.util.Scanner;

public class Hands_on_2_eSum5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}

        int greater = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > greater)
                greater = arr[i];
        }
        System.out.println("the greater element in the array is:"+greater);
        input.close();

	}

}
