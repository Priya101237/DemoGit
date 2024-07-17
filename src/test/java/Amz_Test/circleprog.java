package program;

import java.util.Scanner;

public class circleprog {

	public static void main(String[] args) {
		
		final double pie=3.14;
		System.out.println("Enter the radios");
		Scanner sc = new Scanner(System.in);
		 int r=sc.nextInt();
		 double c=(pie*r*r);
		 System.out.println(c);
		 

	}
}

