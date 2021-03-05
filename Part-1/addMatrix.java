// Design a java Program to add two matrix using multi-dimensional arrays, 
// pass two dimensional array as parameter to the method



import java.util.*;
class prg1{
	void add(int[][] a,int[][] b,int n,int m) {
		int[][] sum=new int[10][10];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum[i][j]=0;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum[i][j]=sum[i][j]+a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
		System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int [][]a=new int[10][10];
		int[][] b=new int[10][10];
		System.out.println("enter size of array a");
		int r1=read.nextInt();
		int c1=read.nextInt();
		System.out.println("enter size of array b");
		int r2=read.nextInt();
		int c2=read.nextInt();
		if(r1!=r2 && c1!=c2) {
			System.out.println("these two matrices cannot be added");
		}
		else {
			prg1 p=new prg1();
			System.out.println("enter array elements of a");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					a[i][j]=read.nextInt();
				}
			}
			System.out.println("enter array elements of b");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					b[i][j]=read.nextInt();
				}
			}
			p.add(a, b, c1, c2);
			read.close();
			
		}
    }
}