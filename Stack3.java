/*String1 ="Java";
1. put one char at a time to stcak till end;
2.pop() and copy char to string till stack is over
string2=""
String2""+ob.pop()
"a"
"av"
"ava"
"avaj"
*
*/

import java.util.Scanner;

public class Stack3 {

	  char stack[];
	    int tos,MaxSize;
	    
	    void createStack(int size)
	    {
	        stack=new char[size];
	        MaxSize=size;
	        tos=-1;
	    }
	    void push(char e)
	    {
	        tos++;
	        stack[tos]=e;
	        //or stack[++tos]=e;
	    }
	    char pop()
	    {
	        char temp=stack[tos];
	        tos--;
	        return(temp);
	    }
	   
	    boolean is_full()
	    {
	        if(tos==MaxSize-1)
	            return true;
	        else
	            return false;
	    }
	     boolean is_empty()
	    {
	        if(tos==-1)
	            return true;
	        else
	            return false;
	    }
	     public static void main(String [] args)
	     {
	      Scanner in =new Scanner(System.in);
	      System.out.println("Enter String");
	      
	     } 
	
}
