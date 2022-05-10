/*
 * Program to find sum of series .. 1 + 2 + 3 + ..... + n
 */
package basics;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter Value for N : ");
        n=s.nextInt();
        s.close();
        
        while(i<=n) {
        	
        	sum=sum+i;
        	System.out.println("the sum of series in "+ i +" :"+sum);
        			
        	i=i+1;
        }
        System.out.println("the sum of series :"+sum);

	}

}
