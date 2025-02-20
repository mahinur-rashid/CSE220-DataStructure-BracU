class task_4{
    public static void main(String[] args){
        int[] arr = {4, 10, 2, 8, 6, 7};
        int k = 3;
        int[] ans = top_elem(arr, k);
        for(int a = 0;a<ans.length; a++){
            System.out.print(ans[a]+ " ");
        }
    } 

    public static int[] top_elem(int[] arr, int k){
        MaxHeap maxHeap = new MaxHeap(arr.length);
        for (int i = 0; i < arr.length;i++){
            maxHeap.insert(arr[i]);
        }
        int[] ans = new int[k];

        for(int j = 0;j<k;j++){
            ans[j] = maxHeap.extractMax();
        }

       return ans;
    }
}