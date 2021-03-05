// Develop a producer-consumer problem using the concept of multithreading

class S{
	int num;
	boolean set=false;
	public synchronized void put(int num){
		while(set) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("producer "+this.num +" put "+num);
		this.num=num;
		set=true;
		notify();
	}
	public synchronized void get() {
		while(!set){
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("consumer "+this.num+1+" get "+num);
		set=false;
		notify();
	}
}
class producer extends Thread{
	S s;
	public producer(S s) {
		this.s=s;
		Thread t=new Thread(this,"producer");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			s.put(i++);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
			}
		}
		
	}
}
class consumer extends Thread{
	S s1;
	public consumer(S s1) {
		this.s1=s1;
		Thread t=new Thread(this,"consumer");
		t.start();}
	@Override
	public void run() {
		while(true) {
			s1.get();
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
			}
}
	}
}
class producer_consumer{
	public static void main(String[] args) {
		S s2=new S();
		new producer(s2);
		new consumer(s2);
		
	}
}