// Task02: Remove Compartment
public class Task2 {

    public static Node removeCompartment(Node head, int n){

        int size = sizeList(head);

        if(size < n){
            return head;
        }
        else if(n == size){
            head = head.next;
            return head;
        }
        else if(n==1){
            Node n1 = NodeAt(head, size-n-1);
            n1.next = null;
            return head;
        }
        else if(1 < n && n < size){
            Node a = NodeAt(head, size-n-1);
            Node b = a.next.next;
            a.next = b;
            return head;            
        }
        return null;

    }
    public static int sizeList(Node head){
        int c = 0;
        while (head != null){
            c += 1;
            head = head.next;
        }
        return c;
    }
    public static Node NodeAt(Node head, int i){
        int c = 0;
        Node temp = head;
        while (head != null){
            if (c==i){
                return temp;
            }
            c += 1;
            temp = temp.next;
        }
        return null;
    }
    
    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        //DO NOT TOUCH THE DRIVER CODE BELOW
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(  new Integer[]{10,15,34,41,56,72} );
        System.out.print("Original Compartment Sequence: ");
        LinkedList.printLL(head);
        System.out.println("\nMethod called: removeCompartment(head,2)");
        head = removeCompartment(head,2);
        System.out.println("Expected Compartment Sequence: 10-->15-->34-->41-->72");
        System.out.print("\nYour Compartment Sequence: ");
        LinkedList.printLL(head); //This should print 10-->15-->34-->41-->72
        System.out.println();
        System.out.println("\n==============Test Case 2=============");
        head = LinkedList.createList(  new Integer[]{10,15,34,41,56,72} );
        System.out.print("Original Compartment Sequence: ");
        LinkedList.printLL(head);
        System.out.println("\nMethod called: removeCompartment(head,7)");
        head = removeCompartment(head,7);
        System.out.println("Expected Compartment Sequence: 10-->15-->34-->41-->56-->72");
        System.out.print("\nYour Compartment Sequence: ");
        LinkedList.printLL(head); //This should print 10-->15-->34-->41-->56-->72
        System.out.println();
        System.out.println("\n==============Test Case 3=============");
        head = LinkedList.createList(  new Integer[]{10,15,34,41,56,72} );
        System.out.print("Original Compartment Sequence: ");
        LinkedList.printLL(head);
        System.out.println("\nMethod called: removeCompartment(head,6)");
        head = removeCompartment(head,6);
        System.out.println("Expected Compartment Sequence: 15-->34-->41-->56-->72");
        System.out.print("\nYour Compartment Sequence: ");
        LinkedList.printLL(head); //This should print 15-->34-->41-->56-->72
        System.out.println();
    }

}
