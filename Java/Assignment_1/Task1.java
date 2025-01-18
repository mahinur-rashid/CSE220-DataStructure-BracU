//Task 02: MERGE LINEUP
class Task1{

    //Complete this method so that it gives the Expected Output
    public static Integer[] mergeLineup( Integer[] pk1, Integer[] pk2 ){
        
        Integer[] arr = new Integer[pk1.length];
        
        for(int i = 0;i<pk1.length;i++){
            if(pk1[i]==null){
                pk1[i] = 0;
            }
            if(pk2[pk1.length-1-i]== null){
                pk2[pk1.length-1-i] = 0;
            }
            arr[i] = pk1[i]+ pk2[pk1.length-1-i];
        }
        return arr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] pokemon_1 = {12, 3, 25, 1, null};
        Integer[] pokemon_2 = {5, -9, 3, null, null};
        System.out.print("Pokemon 1: ");
        Arr.print(pokemon_1);
        System.out.print("Pokemon 2: ");
        Arr.print(pokemon_2);
        System.out.println("Expected Output: [ 12 3 28 -8 5 ]");
        Integer[] returned_val_1 = mergeLineup(pokemon_1, pokemon_2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] pokemon_3 = {4, 5, -1, null, null};
        Integer[] pokemon_4 = {2, 27, 7, 12, null};
        System.out.print("\nPokemon 3: ");
        Arr.print(pokemon_3);
        System.out.print("Pokemon 4: ");
        Arr.print(pokemon_4);
        System.out.println("Expected Output: [ 4 17 6 27 2 ]");
        Integer[] returned_val_2 = mergeLineup(pokemon_3, pokemon_4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}