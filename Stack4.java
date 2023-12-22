//Decimal to binary
/*base 2
base is no of unique characters 
steps:
	divide given no  by 2 and push left to stcak (remainder)
	at the end pop() all and take answer*/

import java.util.Scanner;

public class Stack4 {
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
	

	void printStack()
	{
		for(int i=tos;i>-1;i--)
		{
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no to be converted in binary");
		Stack4 s4=new Stack4();

		int num=sc.nextInt();
		
		
		s4.createStack(32);
		while (num > 0) {
            int remainder = num % 2;
            num /= 2;
            s4.push(remainder);
        }
		while(!s4.is_empty())
		{
			System.out.print(s4.pop());
		}
		
		
	}
}
