import java.util.Scanner;
class exceptionvote{
	public static void vote(int age) throws Exception {
			if(age<18) {
				throw new Exception();
			}
			else {
				System.out.println("person with age "+ age +" can vote");
			}
		}
	public static void main(String[] args) {
		int age;
		Scanner read=new Scanner(System.in);
		System.out.println("enter age of the person");
		age=read.nextInt();
		try {
			vote(age);
		}
		catch (Exception e){
			System.out.println("person with age less 18 can't vote");
		}
		read.close();
		
	}
	}