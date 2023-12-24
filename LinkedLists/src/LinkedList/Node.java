package LinkedList;

public class Node {

	int data;
	Node next;//self reference // use:address of other node
	
	Node(int data)
	{
		this.data=data;
		this.next=null;//address pf other node
	}
}
