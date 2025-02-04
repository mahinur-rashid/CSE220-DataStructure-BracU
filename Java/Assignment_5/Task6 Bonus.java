// Complete the levelSum method
public class Task6Bonus {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return summ(root, 1);
    }

    private static Integer summ(BTNode root, Integer lvl){
        if(root == null){
            return 0;
        }
        Integer s = summ(root.left, lvl+1);
        Integer ss = summ(root.right, lvl+1);
        

        if(lvl%2==0){
            return (Integer )root.elem + s+ ss;
        }
        return (Integer) root.elem *-1 + s + ss;


    }
    //============================================================================

}