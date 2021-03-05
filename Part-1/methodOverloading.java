// Design a java code to implement method overloading.

class overloading{
	float sum;
	float add(int a,int b) {
		return sum=a+b;
	}
	float  add(int a,int b,int c) {
		return sum=a+b+c;
	}
	public static void main(String[] args) {
		overloading o=new overloading();
		
		
		System.out.println(o.add(10, 20));
		System.out.println(o.add(10,20,30));
	}
}