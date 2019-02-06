package datastructure;
import java.util.*;
public class LinkedList {
	node head;
    public	void insert(int data)
	{
		node n=new node();
		n.data=data;
		if(head==null)
		{
			head=n;
		}
		else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		
	}
	void display()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
		void insertatbeg(int data)
		{
			node n=new node();
		n.data=data;
			n.next=head;
			head=n;
		}
		void insertatpp(int index,int data)
		{
			node n=new node();
			n.data=data;
			node temp=head;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
		}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    LinkedList l=new LinkedList();
	    int d=s.nextInt();
	    for(int i=0;i<d;i++)
	    {
	    	int a=s.nextInt();
	    	l.insert(a);
	    }
	    System.out.println("before insert at begining");
	    l.display();
	   // l.insertatbeg(5);
	    //System.out.println("after insert at begining");
	    //l.display();
	    //l.insertatpp(2,8);
	}

}
