package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestPrimeFactor {
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number :");
        Scanner in = new Scanner(System.in);

		int N=in.nextInt();
		
		 int prime[] = new int[]{2,3,5,7,9};
		 ArrayList<Integer> pFactor = new ArrayList<Integer>();
        
		 for(int i: prime) {
			 
			 while(N%i==0) {
				 
				 N=N/i;
				 pFactor.add(i);
				 
			 }
			 
		 }
		 pFactor.add(N);
        
        in.close();
        System.out.println("The prime factors of the given number is " + pFactor);
       System.out.printf("The largest prime factor of number %d is %d",N,Collections.max(pFactor));
	}

}
