public class MaxHeap {
    private int[] heap;
    private int size;
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(3);
        maxHeap.insert(1);
        maxHeap.insert(6);
        maxHeap.insert(5);
        maxHeap.insert(2);
        maxHeap.insert(4);

        System.out.println("Heap array before sorting:");
        for (int j = 0; j < maxHeap.size; j++) {
            System.out.print(maxHeap.heap[j] + " ");
        }
        System.out.println();
        System.out.println("Sorted Heap array:");
        maxHeap.sort();
        for (int i = 0; i < maxHeap.size; i++) {
            System.out.print(maxHeap.heap[i] + " ");
        }
    }

    public MaxHeap(int capacity) {
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
        while (index > 0 && heap[index] > heap[(index - 1) / 2]) {
            int parent_idx = (index - 1) / 2;
            swap(index, parent_idx);
            index = parent_idx;
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        sink(0);
        return max;
    }

    private void sink(int index) {
        while (2 * index + 1 < size) {
            int j = 2 * index + 1;
            if (j < size - 1 && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[index] >= heap[j]) {
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
