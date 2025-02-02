public class FruitNode {
    
    //the fruit array is the data of this node class
    //the first index should contain name of the fruit
    //the second index should contain the price of the fruit
    Object[] fruit = new Object[2];
    FruitNode next;
    String key;
    Integer value;

    public FruitNode(String name, Integer price){
        this.key = name;
        this.value = price;
        this.next = null;
        fruit[0] = key;
        fruit[1] = value;
    }
}
