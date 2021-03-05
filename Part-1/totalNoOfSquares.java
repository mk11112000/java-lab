//Design a java code to accept a value for ‘n’ and 
//calculate the total number of all possible squares in a square matrix.

import java.util.Scanner;
class prg8{
	public static void main(String[] args) {
		int x=0;
		Scanner read=new Scanner(System.in);
		System.out.println("enter a number");
		int n=read.nextInt();
		while(n!=0) {
			x=x+n*n;
			n--;
		}
		System.out.println("number of square matrices possible:"+x);
		read.close();
	}
	
}