public class DNode {
        int data;
        DNode left, right; // self reference

        DNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    
}
