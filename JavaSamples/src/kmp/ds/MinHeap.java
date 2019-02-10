package kmp.ds;

public class MinHeap {

    private int size;
    private int maxSize;
    private int[] heap;
    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.size = 0;
        this.maxSize = maxSize;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= size / 2 && pos < size) {
            return true;
        }
        return false;
    }

    private void swap(int pos1, int pos2) {
        int temp;
        temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {
                if (leftChild(pos) < rightChild(pos)) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public int remove() {
        int popped = heap[FRONT];
        heap[FRONT] = heap[size];
        minHeapify(FRONT);
        return popped;
    }

    //Always insert element at the end of the MinHeap. Later do compare it with it's parent and swap them if neccessary <- till we meet the condition
    public void insert(int element) {
        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void minHeap() {
        for (int pos = size / 2; pos >= 0; pos--) {
            minHeapify(pos);
        }
    }

    public void print(){
        for(int i = FRONT ; i <= size/2; i++){
            System.out.println("Parent: "+heap[i]+
                    " left child: "+heap[leftChild(i)]+
                    " right child: "+heap[rightChild(i)]);
        }
    }
    public static void main(String args[]) {
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(7);
        minHeap.insert(33);
        minHeap.insert(25);
        minHeap.insert(52);
        minHeap.insert(12);
        minHeap.insert(89);
        minHeap.insert(32);

        minHeap.print();

    }
}
