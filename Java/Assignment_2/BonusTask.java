public class BonusTask {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        
        Node tail1 = head1;
        Node head = null ;
        Node temp2 = null;
        while(tail1!= null){
            temp2 = tail1.next;
            tail1.next = head;
            head = tail1;
            tail1 = temp2;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        while(head2!= null){
            int ss = (Integer) head2.elem + (Integer) head3.elem;
            ss = ss%10;
            Node n = new Node(ss, null);
            temp.next = n;
            temp = temp.next;
            head2 = head2.next;
            head3 = head3.next;
        }
        return head; // Remove this line
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.println("Linked List 1");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.println("Linked List 2");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.println("Linked List 3");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = BonusTask.idGenerator(head1, head2, head3);

        System.out.println("New ID");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.println("Linked List 4");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.println("Linked List 5");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.println("Linked List 6");
        LinkedList.printLL(head3); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = BonusTask.idGenerator(head4, head5, head6);

        System.out.println("New ID");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
