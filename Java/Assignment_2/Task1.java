// Task01: check_similar
public class Task1 {

    public static String checkSimilar( Node building1, Node building2 ){
        
        int indx1 = sizeList(building1);
        int indx2 = sizeList(building2);
        if (indx1 != indx2){
            return "Not Similar";
        }
        while (building1 != null && building2 != null){
            if(building1.elem != building2.elem){
                return "Not Similar";
            }
            building1 = building1.next;
            building2 = building2.next;
        }

        return "Similar";
    }
    public static int sizeList(Node head){
        int c = 1;
        while (head != null){
            c += 1;
            head = head.next;
        }
        return c;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        //DO NOT TOUCH THE DRIVER CODE BELOW
        System.out.println("==============Test Case 1=============");
        String[] b1 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_1 = LinkedList.createList(b1);
        String[] b2 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_2 = LinkedList.createList(b2);
        System.out.print("Building 1: ");
        LinkedList.printLL(building_1);
        System.out.print("Building 2: ");
        LinkedList.printLL(building_2);
        String returnedValue = checkSimilar(building_1, building_2);
        System.out.println("Expected Output: Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Similar"


        System.out.println("==============Test Case 2=============");
        String[] b3 = {"Red", "Green", "Yellow", "Red", "Yellow", "Green"};
        Node building_3 = LinkedList.createList(b3);
        String[] b4 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_4 = LinkedList.createList(b4);
        System.out.print("Building 3: ");
        LinkedList.printLL(building_3);
        System.out.print("Building 4: ");
        LinkedList.printLL(building_4);
        returnedValue = checkSimilar(building_3, building_4);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"

        System.out.println("==============Test Case 3=============");
        String[] b5 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_5 = LinkedList.createList(b5);
        String[] b6 = {"Red", "Green", "Yellow", "Red", "Blue", "Green", "Blue"};
        Node building_6 = LinkedList.createList(b6);
        System.out.print("Building 5: ");
        LinkedList.printLL(building_5);
        System.out.print("Building 6: ");
        LinkedList.printLL(building_6);
        returnedValue = checkSimilar(building_5, building_6);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"

        System.out.println("==============Test Case 4=============");
        String[] b7 = {"Red", "Green", "Yellow", "Red", "Blue", "Green", "Blue"};
        Node building_7 = LinkedList.createList(b7);
        String[] b8 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_8 = LinkedList.createList(b8);
        System.out.print("Building 7: ");
        LinkedList.printLL(building_7);
        System.out.print("Building 7: ");
        LinkedList.printLL(building_8);
        returnedValue = checkSimilar(building_7, building_8);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"
    }

}
