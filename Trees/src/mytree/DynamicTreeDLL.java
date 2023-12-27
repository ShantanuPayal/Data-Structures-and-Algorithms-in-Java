//package Tree_Data;
package mytree;


public class DynamicTreeDLL 
{
    DNode root;
    void createtree()
    {
        root=null;
    }
    
    void insert(DNode r,DNode n)//r:root n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
    }
    void inorder(DNode r)
    {
        if(r!=null)
        {
            inorder(r.left);//l
            System.out.print(r.data+",");//p
            inorder(r.right);//r
            
        }
    }
    void search(DNode r, int key)
    {
        if(r!=null)
        {
            if(r.data==key)
            {
            	System.out.println(key  +" key found");
            }
            else 
            {	
            	if (key<r.data)
            		search(r.left,key);
            
            	else            
            		search(r.right,key);
            }
        }
        else
        	System.out.println(key +" Key not found");
    }
    void preorder(DNode r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    void postorder(DNode r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
    
    int getHeight(DNode r)
    {
    	if(r==null)
    	{
    		return 0;
    	}
    	else
    	{
    		int right=getHeight(r.right);
    		int left=getHeight(r.left);
    		return Math.max(right, left)+1;
    	}
    }
    boolean isBalanced(DNode r)
    {
    	if(r==null)
    	{
    		return true;
    	}
    	else
    	{
    		int right=getHeight(r.right);
    		int left=getHeight(r.left);
    		if(Math.abs(left-right)<=1) //AVL tree: -1,0,+1(nearly balamced
    		{
    			return true;
    		}
    		else
    			return false;
    	}
    }
    
    void delete_node()
    {
    	
    }
    
    public static void main(String args[])
    {
        DynamicTreeDLL obj=new DynamicTreeDLL();
        obj.createtree();//root=null
        DNode n1=new DNode(50);
        obj.insert(obj.root, n1);
        DNode n2=new DNode(20);
        obj.insert(obj.root, n2);
        DNode n3=new DNode(60);
        obj.insert(obj.root, n3);
        DNode n4=new DNode(30);
        obj.insert(obj.root, n4);
        DNode n5=new DNode(100);
        obj.insert(obj.root, n5);
        DNode n6=new DNode(110);
        obj.insert(obj.root, n6);
        System.out.println("inorder:");
        obj.inorder(obj.root);
        System.out.println("");
        System.out.println("psot:");
        obj.postorder(obj.root);
        System.out.println("");
        System.out.println("pre");
        obj.preorder(obj.root);
        
        System.out.println();
        System.out.println("is balanced: "+obj.isBalanced(obj.root));
        System.out.println("");
        obj.search(obj.root, 20);
        
        
    }
}

