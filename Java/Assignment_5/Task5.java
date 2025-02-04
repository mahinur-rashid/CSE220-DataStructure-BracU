// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        Integer sub = rootsum(root.left) - rootsum(root.right);
        return sub; 
    }
    private static Integer rootsum(BTNode root){
        if (root == null){
            return 0;
        }
        Integer left = rootsum(root.left);
        Integer right = rootsum(root.right);
        return (Integer) root.elem + left + right;
    }
    //============================================================================

}