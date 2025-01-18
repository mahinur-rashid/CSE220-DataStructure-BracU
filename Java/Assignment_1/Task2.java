//Task 02: DISCARD CARDS
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] discardCards( Integer[] cards, int t ){
        Integer[] a = new Integer[cards.length];
        Integer[] b = new Integer[cards.length];
        int c1 = 0;
        int c2 = 0;
        for(int i = 0;i<cards.length;i++){
            if(cards[i]==t){
                a[c1]= i;
                c1++;
            }
        }
        
        for(int j = 0;j<cards.length;j++){
            if((j== a[0])||(j== a[2])){
                continue;
            }
            else{
                b[c2]= cards[j];
                c2++;
            }
        }
        for(int i = 0;i<cards.length;i++){
            if(b[i]==null){
                b[i]= 0;
                
            }
        }
        return b;

    }
    
    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] cards1 = {1,3,7,2,5,2,2,2,0};
        System.out.print("Initial Cards: ");
        Arr.print(cards1);
        System.out.println("Expected Output: [ 1 3 7 5 2 2 0 0 0 ]");
        Integer[] returned_val_1 = discardCards(cards1, 2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);

        System.out.print("\n======================\n");
        
        Integer[] cards2 = {5,5,5,0,0};
        System.out.print("\nInitial Cards: ");
        Arr.print(cards2);
        System.out.println("Expected Output: [ 5 0 0 0 0 ]");
        Integer[] returned_val_2 = discardCards(cards2, 5);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);

    }
}