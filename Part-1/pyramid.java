//  Design a code to print a pyramid based on level entered by the user

import java.util.Scanner;
class prg12{
	public static void main(String[] args) {
		int i,j,k=0,count=0,count1=0;
		Scanner read=new Scanner(System.in);
		System.out.println("enter a number");
		int n=read.nextInt();
		for(i=1;i<=n;i++) {
			for( j=1;j<=n-i;j++) {
				System.out.print(" ");
				count++;
			}
			while(k!=2*i-1) {
				if(count<=n-1) {
					System.out.print(i+k);
					count++;
				}
				else {
					count1++;
					System.out.print(i+k-2*count1);
				}
				k++;
				
			}
			
			System.out.println();
			count=0;
			count1=0;
			k=0;
		}
		}
}
