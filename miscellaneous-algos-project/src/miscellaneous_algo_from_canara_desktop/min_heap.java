package miscellaneous_algo_from_canara_desktop;

import java.util.*;

class min_heap{
    private int heapsize;
    private int heap[];
    
    min_heap(int capacity){
        heap = new int[capacity];
        heapsize =  0;
        Arrays.fill(heap,-1);
    }
    
    public boolean isEmpty(){
        return heapsize == 0;
    }
    
    public boolean isFull(){
        return heapsize == heap.length;
    }
    
    private int parent(int i){
        return (i-1)/2;
    }
    
    private int kthChild(int i,int k){
        return 2*i+k;
    }
    
    public int delete(int position){
        if(isEmpty()){
            throw new NoSuchElementException("The heap is empty.");
        }
        int key = heap[position];
        heap[position] = heap[heapsize-1];
        heapsize--;
        heapifyDown(position);
        return key;
    }
    
    public void heapifyDown(int i){
        int child;
        int temp = heap[i];
        while(kthChild(i,1)<heapsize){
            child = minChild(i);
            if(temp > heap[child]){
                heap[i] = heap[child];
            }else{
                break;
            }
            i = child;
        }
        heap[i] = temp;
    }
    
    public void printHeap(){
        System.out.print("Heap - ");
        for(int i=0;i<heapsize;i++){
            System.out.print(heap[i]+ " ");
        }
        System.out.println();
    }
    
    public int minChild(int i){
        int leftChild = kthChild(i,1);
        int rightChild = kthChild(i,2);
        
        return heap[leftChild]<heap[rightChild]?leftChild:rightChild;
    }
    
    public void insert(int key){
        if(isFull()){
            throw new NoSuchElementException("The heap is full");
        }
        heap[heapsize++] = key;
        heapifyUp(heapsize-1);
    }
    
    public void heapifyUp(int i){
        int temp = heap[i];
        while(i>0 && temp<heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }
    
    public static void main(String args[]){
        min_heap minHeap = new min_heap(10);
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(9);
        minHeap.insert(1);
        minHeap.insert(7);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.printHeap();
        System.out.println("The item deleted at 1 is "+minHeap.delete(1));
        minHeap.printHeap();
    }
}