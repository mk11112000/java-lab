// Design a java code to accept 5 strings from the user and print them in lexicographical order.

import java.util.Scanner;
class prg10{
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String[] s=new String[5];
		System.out.println("enter 5 words");
		int i,j;
		
		for(i=0;i<5;i++) {
			s[i]=read.next();
			
		}
		read.close();
		System.out.println("lexicographic order:");
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp;
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;}
				}
			}
		for(i=0;i<5;i++) {
			System.out.print(s[i]+"  ");
			}
	
		}
	
}