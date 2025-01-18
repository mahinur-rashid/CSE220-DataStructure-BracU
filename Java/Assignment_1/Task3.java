//Task 03: Decryption Process
class Task3{

    public static Integer[] decryptMatrix( Integer[][] matrix ){
        int row = matrix.length;
        int col = matrix[row-1].length;
        int cnt = 0;

        Integer[] sum= new Integer[col];
        Integer[] ans = new Integer[col-1];
        for(int c = 0;c<col;c++){
            sum[c] = 0;
            for(int r = 0;r<row;r++){
                sum[c] += matrix[r][c];
            }
        }
        for(int i =1;i<col;i++){
            ans[cnt] = sum[i]-sum[i-1];
            cnt++;
        }
        return ans;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}