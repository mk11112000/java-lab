//Design and implement a simple inventory central system for a small video rental store using constructors and Object List
import java.util.*;
 class movie{
	public String name;
	public float rate;
	public boolean status;
}
public class arraylist{
		public static void main(String args[]) {
		ArrayList<movie> a=new ArrayList<movie>();
		//movie m=new movie();
	Scanner read=new Scanner(System.in);
	for(;;) {
	System.out.println("1.Add 2.Display 3.Roll out 4.Collect back 5.Exit");	
	int choice=read.nextInt();
	switch(choice) {
	case 1:movie m=new movie();
		System.out.print("Enter name of the movie: ");
			m.name=read.next();
			System.out.print("Enter status of movie(true/false):  ");
			m.status=read.nextBoolean();
			System.out.print("Enter rating for movie(0-5): ");
			m.rate=read.nextFloat();
			System.out.println("library initialised");
			a.add(m);
			break;
	case 2:for(movie mo:a) {
			System.out.print("  movie : "+mo.name);
			System.out.print("  status : "+mo.status);
			System.out.print("  rating : "+mo.rate);
			System.out.println();
			}
		
			break;
	case 3:System.out.println("enter movie you want to rent");
				String na=read.next();
				for(Object o:a) {
					if(o instanceof movie) {
						movie mo=(movie)o;
						if(mo.name.equals(na)) {
							mo.status=false;
							System.out.println("rent out successfully");
						}}}
					
				break;
	case 4:System.out.println("enter name and rating of movie");
					na=read.next();
					float f=read.nextFloat();
				for(Object o:a) {
					if(o instanceof movie) {
						movie mo=(movie)o;
						if(mo.name.equals(na) && mo.rate==f) {
							mo.status=true;
						}}}
				System.out.println("collected back");
					break;
	default:read.close();
		System.exit(0);
				}
	
	}
	
	}
}