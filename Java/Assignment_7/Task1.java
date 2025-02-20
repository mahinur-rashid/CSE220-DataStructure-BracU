public class MinHeap {
    private int[] heap;
    private int size;
    
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(6);
        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(4);

        System.out.println("Heap array before sorting:");
        for (int j = 0; j < minHeap.size; j++) {
            System.out.print(minHeap.heap[j] + " ");
        }
        System.out.println();
        System.out.println("Sorted Heap array:");
        minHeap.sort();
        for (int i = 0; i < minHeap.size; i++) {
            System.out.print(minHeap.heap[i] + " ");
        }
    }

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == heap.length) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        swim(size);
        size++;
    }

    private void swim(int index) {
        while (index > 0 && heap[index] < heap[(index - 1) / 2]) {
            int parent_idx = (index - 1) / 2;
            swap(index, parent_idx);
            index = parent_idx;
        }
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        sink(0);
        return min;
    }

    private void sink(int index) {
        while (2 * index + 1 < size) {
            int j = 2 * index + 1;
            if (j + 1 < size && heap[j + 1] < heap[j]) {
                j++;
            }
            if (heap[index] <= heap[j]) {
                break;
            }
            swap(index, j);
            index = j;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void sort() {
        int main_size = size;
        for (int i = size - 1; i > 0; i--) {
            swap(0, i);
            size--;
            sink(0);
        }
        size = main_size;
    }


}