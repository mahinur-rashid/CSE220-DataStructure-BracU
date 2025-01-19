// Task05: Alternate Merge
public class Task5 {

    public static Node alternateMerge( Node head1, Node head2 ){
        
        //You're suppose to create a new Singly Linked List in this method
        Node new_head = new Node(null);
        Node tail = new_head;
        Node tail1 = head1;
        Node tail2 = head2;
        int count = 0;
        while(tail1 != null || tail2 != null){
            if(count % 2 == 0){
                if(tail1 == null){
                    continue;
                }
                else{
                    if (new_head.elem == null){
                        new_head.elem = tail1.elem;
                    }
                    else{
                        Node n = new Node(tail1.elem, null);
                        tail.next = n;
                        tail = tail.next;
                    }
                }
                tail1 = tail1.next;
            }
            else{
                if(tail2 == null){
                    continue;
                }
                else{
                    Node n = new Node(tail2.elem, null);
                    tail.next = n;
                    tail = tail.next;
                }
                tail2 = tail2.next;
            }
            count++;
        }

        //remove the following line when you're ready to return
        return new_head;
    }
    public static int sizeList(Node head){
        int c = 0;
        while (head != null){
            c += 1;
            head = head.next;
        }
        return c;
    }
    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
        Node head2 = LinkedList.createList(new Integer[]{5,7,3,9,4});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        Node result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
        System.out.println();
        
        System.out.println("\n==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
        head2 = LinkedList.createList(new Integer[]{-4,-6,1});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
        System.out.println();

        System.out.println("\n==============Test Case 3=============");
        head1 = LinkedList.createList(new Integer[]{4,2,-2,-4});
        head2 = LinkedList.createList(new Integer[]{8,6,5,-3});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3
        System.out.println();
    }
}
