// Task03: Assemble Conga Line
public class Task3 {

    public static Boolean assembleCongaLine(Node head){
            
        //TODO
        Boolean conga = true;
        Node a = head;
        Node b = a.next;
        while(a.next.next != null){
            if((int)a.elem > (int)b.elem){
                conga = false;
            }
            a = a.next;
            b = b.next;
        }
        return conga;
        //Hint: the Node elements are actually Object, you can type cast them
        //      into int or Integer like the following:
        //        (int)n.elem  or  (Integer)n.elem
        
        //When you're ready to return the boolean remove the following line
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){

        System.out.println("==============Test Case 1=============");
        Node congaLine = LinkedList.createList(new Integer[]{10,15,34,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: true");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print True
        System.out.println();
        System.out.println("==============Test Case 2=============");
        congaLine = LinkedList.createList(new Integer[]{10,15,44,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: false");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print False
        System.out.println();
    }
}
