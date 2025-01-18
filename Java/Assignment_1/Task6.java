// Task 06: Matrix Compression
class Task6{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        int row = matrix.length;
        int col = matrix[row-1].length;
        Integer[][] ans = new Integer[row/2][col/2];

        for(int r = 0; r < row; r += 2){
            for (int c = 0; c < col; c += 2){
                ans[r/2][c/2] = matrix[r][c] + matrix[r+1][c] + matrix[r][c+1] + matrix[r+1][c+1];
            }
        }
        return ans;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}