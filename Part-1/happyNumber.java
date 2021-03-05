//  Design a java code which accepts a number (which is non-zero and positive) from the user and then checks if it is a happy number or not. Implement it using nested interface concept


import java.util.Scanner;
interface it4
{	int digitsquaresum(int n);
	interface it6{
		int checkhappy(int n);
	}
	
}
class prg16 implements it4,it4.it6{
	public int digitsquaresum(int n) {
		int rem,sum=0;
		while(n>0) {
		rem=n%10;
		sum=sum+(rem*rem);
		n=n/10;
		}
		System.out.println(sum);
		return sum;}
	public int checkhappy(int n) {
		int sum=99999;
		while(sum>=10) {
			sum=digitsquaresum(n);
			n=sum;}
		if(sum==1)
			return 1;
		else return 0;
	}
	public static void main(String[] args) {
		int n,sum=0,flag;
		System.out.println("enter a number");
		Scanner read=new Scanner(System.in);
		n=read.nextInt();
		if(n<=0) {
			System.out.println("non-zero or negetive numbers are not accepted");
		}
		else {
		prg16 h=new prg16();
		flag=h.checkhappy(n);
		if(flag==1) {
			System.out.println("given number is happy number");
			
		}
		else {
			System.out.println("given number is not a  happy number");
		}}
	}
}
	