// Design a java code for implementing Binary Search, pass array as parameter to the method

//binary search
import java.util.Scanner;
class prg11{
	static int binarysearch(int[] a,int x,int l,int h) {
		int mid;
		while(l<=h) {
			mid=l+((h-l)/2);
			if(a[mid]==x) {
				return mid;
			}
			
			if(a[mid]<x) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int[] a=new int[6];
		System.out.println("enter numbers");
		for (int i=0;i<6;i++) {
			a[i]=read.nextInt();
		}
		System.out.println("enter number to be searched");
		int x=read.nextInt();
		int b=binarysearch(a,x,0,5);
		if(b==-1) {
			System.out.println("element not found");
		}
		else {
		System.out.println("element found at index : "+b);
	}
		read.close();
}}