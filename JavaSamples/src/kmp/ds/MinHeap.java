package kmp.ds;

public class MinHeap {

    private int size;
    private int maxSize;
    private int[] heap;
    private static final int FRONT = 1;

    public MinHeap(int maxSize){
        this.maxSize = maxSize;
        heap = new int[maxSize+1];
        heap[0] = Integer.MIN_VALUE;
    }
}
