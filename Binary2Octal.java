package test;

import java.util.Scanner;

public class Binary2Octal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int b = Integer.parseInt(str, 2);

		String octal = Integer.toOctalString(b);
		
		System.out.println(octal);
	}

}
