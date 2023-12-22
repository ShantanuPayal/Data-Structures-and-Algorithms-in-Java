//sorting a stack using tempstack
import java.util.Scanner;
public class SortStack {
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
		
		SortStack ss=new  SortStack();
		ss.createStack(size);
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter number at "+(i+1)+"th index of stack");
			int num=sc.nextInt();
			ss.push(num);
		}
		System.out.println("Elements in  stack");
		ss.printStack();
		System.out.println();
		
		
		SortStack tempstack=new SortStack();
		tempstack.createStack(size);
		
		while(!ss.is_empty())
		{
			//pop first element
			int temp=ss.pop();
			
			//while tempstack is not empty adn topstacl is lesser tham temp
			while(!tempstack.is_empty()&& tempstack.peek()<temp)
			{
				//pop from tempstack and ppush into original srack
				ss.push(tempstack.pop());
			}
			tempstack.push(temp);

		}
		tempstack.printStack();
		
	}
}	