package LinkedList;

public class DoublyLinkedList {
	DNode root;
	
	void createDList()
	{
		root=null;
		
		
	}
	void insert_left(int e)
	{
		DNode n=new DNode(e);
		n.right=root;
		if(root!=null)
			root.left=n;
		root=n;
		System.out.println("Inserted");
		
	}
	void insert_right(int e)
	{
		DNode n=new DNode(e);
		DNode last =root;
		
		n.right=null;
		
		if(root==null)
		{
			n.left=null;
			root=n;
			return;
		}
		while(last.right!=null)
		{
			last=last.right;
		}
		
		last.right=n;
		n.left=last;
	}
}
