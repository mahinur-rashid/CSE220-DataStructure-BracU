// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            return lvlsum(root, 0);
        }
    
        private static Integer lvlsum(BTNode root, int level) {
            if (root == null) {
                return 0;
            }
    
            int l_Sum = lvlsum(root.left, level + 1);
            int r_Sum = lvlsum(root.right, level + 1);
            int mod;
            if (level == 0) {
                mod = (Integer) root.elem;
            } else {
                mod = (Integer) root.elem % level;
            }
    
            return mod + l_Sum + r_Sum;
        }

        //============================================================================

}
