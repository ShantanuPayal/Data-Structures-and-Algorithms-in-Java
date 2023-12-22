import java.util.Scanner;
public class Stack2 
{
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
     
     void print_stack()
     {
         for(int i=tos;i>-1;i--)
             System.out.println(stack[i]);
     }
    
     public static void main(String [] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the sequeence of braces");
    	 String str=sc.nextLine();
    	 
    	 int size=str.length();
    	 
    	 Stack2 s2=new Stack2();
    	 s2.createStack(size);
    	 
    	 boolean flag=true;
    	 for(int i=0;i<size;i++)
    	 {
    		 char c=str.charAt(i);
    		 if(c=='{')
    		 {
    			 s2.push(c);
    		 }
    		 else
    		 {
    			 if(!s2.is_empty())
    			 {
    				 char temp=s2.pop();
    			 }
    			 else 
    			 {
    				 System.out.println("} is unecpcted");
    				 flag=false;
    			 }
    		 }
    	 }
    	 if(!s2.is_empty())
    	 {
    		 System.out.println("} expected");
    	 }
    	 else if (flag)
    	 {
    		 System.out.println("perfcetly balanced");
    	 }
    	 
     }
}
