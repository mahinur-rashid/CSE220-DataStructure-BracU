// Task04: Word Decoder
public class Task4 {

    public static Node wordDecoder( Node head ){
        
        
        Node dh = new Node(null);
        Node tail = dh;
        int size = sizeList(head);
        int multi = 13% size;
        int count = 0;
        while (head != null){
            if (count % multi == 0 && count != 0 ){
                tail.next = head;
                tail = tail.next;
            }
            count++;
            head = head.next;
        }
        tail.next = null;
        
        Node tail1 = dh;
        Node temp1 = null ;
        Node temp2 = null;
        while(tail1!= null){
            temp2 = tail1.next;
            tail1.next = temp1;
            temp1 = tail1;
            tail1 = temp2;
        }
        Node dh1 = new Node(null);
        dh1.next = temp1;
        Node temp= dh1.next;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return dh1;
        
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
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
