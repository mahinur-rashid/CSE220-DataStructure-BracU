// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only 2 parameters
    // 1st one is root of the given tree
    // 2nd one is the Node of which you need to find the predecessor
    // This method returns the predecessor's Node
    // You can use extra helper private static methods as per need
    public static BSTNode inOrderPredecessor( BSTNode root, BSTNode x ){
        if (x.left != null){
            return max_right(x.left);
        }
        return helper(root, x, null);

    }
    private static BSTNode max_right(BSTNode root){
        while(root.right != null){
            root =root.right;
        }
        return root;
    }
    private static BSTNode helper(BSTNode root, BSTNode x, BSTNode pred) {
        if (root == null) {
            return pred;
        }
        if (x.elem > root.elem) {
            return helper(root.right, x, root);
        } 
        else if (x.elem < root.elem) {
            return helper(root.left, x, pred);
        } 
        else {
            return pred;
        }
    }
}
