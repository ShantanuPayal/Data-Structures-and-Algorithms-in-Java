package mytree;

public class ArrayBinaryTree {
    int[] treeArray;
    int size;
    int root;

    ArrayBinaryTree(int capacity) {
        treeArray = new int[capacity];
        size = 0;
        root = 0;
    }

    void createTree() {
        root = 0;
    }

    void insertLeft(int data, int r) {
        int left = (r * 2) + 1;
        if (left>= treeArray.length) {
            System.out.println("Array size exceeded. Cannot insert left child.");
            return;
        }
        treeArray[left] = data;
        size++;
    }

    void insertRight(int data, int r) {
        int right = (r * 2) + 2;
        if (right >= treeArray.length) {
            System.out.println("Array size exceeded. Cannot insert right child.");
            return;
        }
        treeArray[right] = data;
        size++;
    }

    void inorderTraversal(int index) {
        if (index < size && treeArray[index] != 0) {
            inorderTraversal(2 * index + 1);
            System.out.print(treeArray[index] + " ");
            inorderTraversal(2 * index + 2);
        }
    }

    void preorderTraversal(int index) {
        if (index < size && treeArray[index] != 0) {
            System.out.print(treeArray[index] + " ");
            preorderTraversal(2 * index + 1);
            preorderTraversal(2 * index + 2);
        }
    }

    void postorderTraversal(int index) {
        if (index < size && treeArray[index] != 0) {
            postorderTraversal(2 * index + 1);
            postorderTraversal(2 * index + 2);
            System.out.print(treeArray[index] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayBinaryTree tree = new ArrayBinaryTree(10);

        tree.insertLeft(50, 0);
        tree.insertLeft(20, 0);
        tree.insertRight(60, 0);
        tree.insertLeft(30, 1);
        tree.insertRight(100, 1);
        tree.insertRight(110, 2);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal(0);
        System.out.println();

        System.out.println("Preorder traversal:");
        tree.preorderTraversal(0);
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postorderTraversal(0);
        System.out.println();
    }
}


