import java.util.*;
public class ReverseStack {
	int stack[], maxSize,tos;
	void createStack(int size)
	{
		stack=new int[size];
		maxSize=size;
		tos=-1;
	}
	void push(int e)
	{
		tos++;
		stack[tos]=e;
	}
	boolean isFull()
	{
		if(tos==maxSize-1)
			return true;
		else
			return false;
	}
	
	int pop()
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
	int peek() 
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
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stack size: ");
		int size = sc.nextInt();
		
		ReverseStack rs=new ReverseStack();
		rs.createStack(size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter number at "+(i+1)+"th index of stack");
			int num=sc.nextInt();
			rs.push(num);
		}
		System.out.println("Elements in  stack");
		rs.printStack();
		System.out.println();
		
		ReverseStack rev=new ReverseStack();
		rev.createStack(size);
		for(int i=0;i<size;i++)
		rev.push(rs.pop());
		
		System.out.println("reverse order of stack is");
		rev.printStack();
		
		
		
		
	}
}
