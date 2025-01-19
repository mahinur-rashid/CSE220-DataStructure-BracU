public class Task6 {
    public static int sumDist(Node head, int[] arr) {
        int lenn = sizeList(head);
        int sum = 0;

        for(int i = 0;i < arr.length; i++){
            if(arr[i]<= lenn ){
                Node n1 = Node_at(head, arr[i]);
                sum += (int) n1.elem;
            }
            
        }
        return sum; // Remove this line.
    }
    public static Node Node_at(Node head,int inx){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == inx){
                return temp;
            }
            count++;
            temp = temp.next;
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
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        int[] dist = new int[] {2, 0, 5, 2, 8};
        int returnedValue = Task6.sumDist(head1, dist);
        System.out.println("Sum of Nodes: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
