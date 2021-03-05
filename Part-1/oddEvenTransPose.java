//Design a java program with one method to put even & odd elements of an array in 2 separate arrays, 
// and another method to find the transpose of the matrix by implementing the concept of method overriding

import java.util.Scanner;
class even_odd{
	
	void prog() {
		Scanner read=new Scanner(System.in);
		int even[]=new int[10];
		int odd[]=new int[10];
		int array[]=new int[10];
		int k=0;
		int m=0;
		System.out.println("enter any 5 array  elements");
		for(int i=0;i<5;i++) {
			array[i]=read.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(array[i]%2==0) {
				even[k]=array[i];
				k++;
			}
			else {
				odd[m]=array[i];
				m++;
			}
		}
		System.out.println("even elements");
		for(int i=0;i<k;i++) {
			System.out.println(even[i]);
		}
		System.out.println("odd elements");
		for(int i=0;i<m;i++) {
			System.out.println(odd[i]);
		}
		
	}
}
class transpose extends even_odd{
	void prog() {
		super.prog();
		int[][] a=new int[10][10];
		int[][] trans=new int[10][10];
		int r,c,i,j;
		Scanner read=new Scanner(System.in);
		System.out.println("enter size of matrix");
		r=read.nextInt();
		c=read.nextInt();
		System.out.println("enter values inside a matrix");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				a[i][j]=read.nextInt();
			}
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				trans[j][i]=a[i][j];
			}
		}
		System.out.println("transpose of a matrix");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(trans[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	
}
class eo_trans{
	public static void main(String[] args) {
		transpose t=new transpose();
		t.prog();
	}
}