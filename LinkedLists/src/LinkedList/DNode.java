package LinkedList;

public class DNode {

	int data;
	DNode left,right;//self reference // use:address of other node
	
	DNode(int data)
	{
		this.data=data;
		this.left=this.right=null;//address pf other node
	}
}

