package LinkedList;

import java.util.Scanner;

public class LinearLinkedList {

	Node root;//root is never created but assigned as per need 
	//the 1st node is called root
	
	void createList()
	{
		root=null;//
	}
	void insert_left(int e)
	{
		Node n=new Node(e);
		if(root==null)
			root=n;//pehala hai wo root bnagya
		else
		{
			//linked list hai 
			n.next=root;//left wale ko root bana diya as we adding element to left
			root=n;	
		}
		System.out.println("Inserted");
		
	}
	void delete_left()
	{
		if(root==null)
			System.out.println("Linked list seems to be empty");
		else
		{
			Node t=root;//creating a copy via adress
			root= root.next;//new root at next position
			System.out.println(t.data+" deleted");
			//t local hai to agc khud udhadega delte karne keliye 
		}
		//why are we not deleting?
		//root is instance and t is local memeber as soon as delete medthod is called garbage collection will as t's reference is over
		//so we dont used dlete method		
	}

	/*
	 * will this delete work when only when one element yes, kyulki net ke adress pe
	 * null hai to ha chalgea
	 */
	void insert_right(int e)
	{
		
		
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			//first task is to find out rigtt most element 
			//to reach the rightmost we need to travesre and stop at node where next address is null
			//check is next of t is null?
			Node t=root;//1
			while(t.next!=null)//2
				t=t.next;// if null exit the while loop
			t.next=n;//3 n which is last rightmost its address assigned to next
			
		}
		System.out.println("Inserted");
	}
	void delete_right()
	{
		if(root==null)
			System.out.println("Linked list seems to be empty");
		else
		{
			Node t=root;//1.creating a copy via adress
			Node t2=t;//1
			
			while(t.next!=null)//2
			{	t2=t;
				t=t.next;
			}	
			//conidtion to check only one node exists
			if(root==t)//4.only one node condition
				root=null;//manual reset
			else
				t2.next=null;//3//making the last element null and thne it will be dereferneced
			//anchoring technique: " tu ruk mein aage jaata hoon bol ke last tak gaye"
			
			System.out.println(t.data+" deleted");
			
		}
		//t is local memeber thus once its derefernced Aitomatic Grabage collection shoots it 
		/*
		 * will this delete work for one node?//4 no, for this we must check if only one
		 * node available
		 */
				
	}
	void printList()
	{
		if(root==null)
			System.out.println("Linked list seems to be empty");
		else
		{
			Node t=root;//1.creating a copy via adress
		
			while(t!=null)
			{
				System.out.print("|"+t.data+"|-->");
				t=t.next;
			}
		}
	}
	
	// why are we not checking is full or ismepty:?
	//becoz its a dynamic structure OS will deal with its memory allocation no need to worry
	void search(int key)
	{
		if(root==null)
			System.out.println("Linked list seems to be empty");
		else
		{
			Node t=root;//1.creating a copy via adress
		
			while(t!=null&& key==t.data)
			
				t=t.next;
			if(t==null)		
				{
				System.out.println("key not found");
					
				}
			else
				System.out.println(key+ "foun in list");
			
		}
	}
	//delete specific
	void deleteKey(int key)
	{
		if(root==null)
			System.out.println("Linked list seems to be empty");
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=null&& key==t.data)
			{	
				t2=t;//t2 peeche rehaga t aahe jayega
				t=t.next;
			}	
			if(t==null)		
				{
				System.out.println(key+" key not found");
					
				}
			else
			{	
				System.out.println(key+ " found in list");
				if(t==root)//case 1: left most
					root=root.next;
				else if(t.next==null)//case 2 right most
					t2.next=null;
				else
					t2.next=t.next;
				System.out.println(t.data+" deleted");
			}		
			
		}
	}
	
	//insert at
	void insertAt(int index, int e)
	{
		int originalIndex = index;
		if(index==0)
		{	
			Node n=new Node(e);
			if(root==null)
				root=n;
			else
			{
				n.next=root;
				root=n;
			}
		}
		
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=null && index>0)
			{
				t2=t;
				t=t.next;
				index--;
				
			}
			if(t==null)
			{
				System.out.println("Index out of range");
			}
			else
			{
				Node n=new Node (e);
				t2.next=n;
				n.next=t;
				System.out.println("inserted data: " + e + " at index:"+ originalIndex);
						
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Choose the following options");
		LinearLinkedList ll=new LinearLinkedList();
		System.out.println("Created a linked list");
		ll.createList();
		int ch;
		 do
         {
           System.out.println("\n1.Inser from Left\n2.Delete from left\n3.Insert from right. \n4.Delete from right \n5. Print linked list \n6.searcch Linked List \n.7 Delete any specific element \n 8. Inseart At \n0.Exit\n:");
           ch=sc.nextInt();//read choice 
           switch(ch)
           {
               case 1:
                   
                       System.out.println("\nEnter a number:");
                       int no=sc.nextInt();
                       ll.insert_left(no);
                       System.out.println("Added "+no);
                       break;
               
               case 2:
                    ll.delete_left();
                   break;
               case 3:
            	   System.out.println("\nEnter a number:");
                   no=sc.nextInt();
                   ll.insert_right(no);
                   System.out.println("Added "+no);
                   break;
               case 4:
                   ll.delete_right();
                  break; 
                  
               case 5:
            	   System.out.println("Priting the linked list");
            	   ll.printList();
            	   break;
               case 6:
            	   System.out.println("Enter element to be seacrhed:");
            	   int num=sc.nextInt();
            	   ll.search(num);
            	   break;
            	   
               case 7:
            	   System.out.println("Enter element to be Deleted:");
            	   int dkey=sc.nextInt();
            	   ll.deleteKey(dkey);
            	   
            	   break;
               case 8:
            	   System.out.println("Enter Index first and then data to be inserrted:");
            	   int index=sc.nextInt();
            	   int e=sc.nextInt();
            	   ll.insertAt(index, e);
            	   
            	   break;
               case 0:
                       System.out.println("Exiting");
                   break;
                   
               default:
                       System.out.println("Wrong Choice");
                   break;
           }
             
         }while(ch!=0);
	}
}
