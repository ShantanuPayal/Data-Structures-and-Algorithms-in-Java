/*stack ADT:
	crareate(size)
	push(e)
	pop():elemnt	
	peek
	printstack
	is_mpty:T/F
	isfull:T/F*/
import java.util.*;
public class Stack1 {

	int stack[], tos,MaxSize;
	
	void createStack(int size)
	{
		stack=new int[size];
		MaxSize=size;
		tos=-1;//defieined as -1  beazuse its outside the stack when theres no data in the stack
	}
	void push(int e)
	{
		tos++;
		stack[tos]=e;
		//or stack[++tos]=e//precrement beacuse -1 else if tos++ arryainex outof bound errir
	}
	boolean is_full()
	{
		if(tos==MaxSize-1)
			return true;
		else
			return false;
	}
	int pop()//removes top element and retuns tos
	{
		int temp=stack[tos];
		tos--;
		return temp;
	}
	boolean is_empty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	int peek()//only return top of stack
	{
		return stack[tos];
		
	}
	void printStack()
	{
		for(int i=tos;i>-1;i--)
		{
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enetr size of stack");
		int size=sc.nextInt();
		
		Stack1 s1=new Stack1();
		s1.createStack(size);
		
		//menudriven proramming
		int ch;
		do
		{
			System.out.println("1.psuh\n.2Pop\n.3.Peek\n4.Print\n0.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if (!s1.is_full())
				{	
					System.out.println("enter a number");
					int no=sc.nextInt();
					s1.push(no);
					System.out.println("pushed "+no);
				}
				else
					System.out.println("stack is full");
				break;
				
			case 2:
				if(!s1.is_empty())
				{
					System.out.println("Popping");
					
					System.out.println("popped" +s1.pop());
				}
				else
					System.out.println("stack is empty");
				break;
				
			case 3:
				if(!s1.is_empty())
				{
					System.out.println("Peeking");
					
					System.out.println("peeked element "+ s1.peek());
				}
				else
					System.out.println("stack is empty");
				break;
				
			case 4:
				if(!s1.is_empty())
				{
					System.out.println("elements of stack");
					s1.printStack();
				}
				else
					System.out.println("stack is empty");
				break;
				
			case 0:
				
                System.out.println("Exiting");
                break;

            default:
                System.out.println("Invalid choice");
                break;
				
			}
			
		}while(ch!=0);
	}
}
