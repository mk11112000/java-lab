//Design an java code which accepts a Room Number, Mobile Number and Name of the Customer and generate a 6 Character Unique Password

import java.util.Scanner;
class password{
	public int digitsum(int n) {
		int sum=0;
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
		return sum;
	}
	public static void main(String[] args) {
		String mob_no,name;
		int room_no;
		password p=new password();
		Scanner read=new Scanner(System.in);
		System.out.println("enter your name,mobile number,room number");
		name=read.next();
		mob_no=read.next();
		room_no=read.nextInt();
		
		int x=p.digitsum(room_no);
		int n=room_no;
		for(int i=0;i<5;i++) {
			while(n>10) {
				n=n/10;}
		}
		System.out.println("your password is:");
		char[] special= {'!','@','#','$','%','^','&','*','('};
		
	int y=Integer.parseInt(mob_no.valueOf(mob_no.charAt(4)));
//	System.out.println(y);
		System.out.print(name.charAt(0));
		System.out.print(mob_no.charAt(mob_no.length()-1));
		System.out.print(special[y-1]);
		System.out.print(x);
		System.out.print(special[n-1]);
		System.out.println(name.charAt(name.length()-1));
		
		
		read.close();