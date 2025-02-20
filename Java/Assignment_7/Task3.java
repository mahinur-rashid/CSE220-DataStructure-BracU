class task_3{
    public static void main(String[] args) {
            int[] tasks = {2, 4, 7, 1, 6};
            int m = 4;
            int[] ans = distribute(tasks, m);
            for(int i = 0; i<ans.length; i++){
                System.out.print(ans[i]+" ");
            }
        }


        public static int[] distribute(int[] tasks, int m) {
            MinHeap minHeap = new MinHeap(m);
            int[] ans = new int[m];

            for (int i = 0; i < m; i++) {
                minHeap.insert(0);
            }

            for (int task : tasks) {
                int min = minHeap.extractMin();
                min += task;
                minHeap.insert(min);
            }

            for (int i = 0; i < m; i++) {
                ans[i] = minHeap.extractMin();
            }

            return ans;
    }
}
