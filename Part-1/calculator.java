// Design a code for a simple calculator which takes input from the user and 
// also details of what operation must be performed.
// The user can input only 2 operands


import java.util.Scanner;
class prg6{
	public static void  main(String[] args) {
		Scanner read=new Scanner(System.in);
		int flag=0;
		double ans=0.0;
		int a,b;
		char x;
		System.out.println("enter your expression example: a + b");
		a=read.nextInt();
		x=read.next().charAt(0);
		b=read.nextInt();
		switch(x) {
		case '+': ans=a+b;
			break;
		case '-': ans=a-b;
			break;
		case '*': ans=a*b;
				break;
		case '/':if(b==0) {
				System.out.println("devide by 0 not possible");
				flag=1;
				}
				else {
				ans=a/b;}
				break;
		default:System.out.println("operation invalid");
			
		}
		if(flag!=1){
			System.out.println("ans is : "+ans);
		}
		read.close();
		
		}
}
