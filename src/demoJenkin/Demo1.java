package demoJenkin;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=input.next();
		System.out.println("enter the age:");
		int age=input.nextInt();
		System.out.println("the name is:"+name);
		if(age>18) {
			System.out.println("you are eligible.");
		}
		else {
			System.out.println("you are not eligible.");
		}

	}

}
