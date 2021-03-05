// Program to find the maximum and minimum value node from a doubly linked list.
public class linkedlist{
class node{
	int data;
	node next,prev;
	public node(int data) {//constructor
		this.data=data;
	}
	}
node head=null;
node tail=null;
public void addnode(int data) {
	node n=new node(data);
	if(head==null && tail==null) {
		head=n;
		tail=n;
		head.prev=null;
		tail.next=null;
	}
	else {
		tail.next=n;
		n.prev=tail;
		n.next=null;
		tail=n;
	}

	
}
public int minimum_node() {
	node current=head.next;
	int min;
	min=head.data;
	while(current!=null) {
		if(min>current.data) {
			min=current.data;
			}
		current=current.next;
	}
	return min;
}
public int maximum_node() {
	node current=head.next;
	int max;
	max=head.data;
	while(current!=null) {
		if(max<current.data) {
			max=current.data;
			
		}
		current=current.next;
	}
	return max;
}
public static void main(String[] args) {
	linkedlist l=new linkedlist();
	l.addnode(9);
	l.addnode(1);
	l.addnode(3);
	l.addnode(5);
	l.addnode(0);
	int min=l.minimum_node();
	int max=l.maximum_node();
	System.out.println("maximum values in node= "+max);
	System.out.println("minimum values in node= "+min);
}
}