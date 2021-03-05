// Write a Java program to find digit sum two digit number until the digit sum is less than 10.

import java.util.Scanner;
public class prg14{
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int sum=0;
		System.out.println("enter a two digit number to get digit sum");
		int n=read.nextInt();
		int x,y;
		
		 for(;;) {
		 x=n%10;
		 y=n/10;
			sum=x+y;
			if(sum>10) {
				n=sum;
				}
			else {
				break;
			}
		 }
		System.out.println("sum of digits is: "+sum);
		read.close();
		
	}
}