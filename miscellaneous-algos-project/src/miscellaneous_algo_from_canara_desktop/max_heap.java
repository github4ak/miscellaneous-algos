package miscellaneous_algo_from_canara_desktop;

import java.util.*;

class max_heap{
    private int heapsize;
    private int heap[];
    
    max_heap(int capacity){
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
    
	//Good function
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
    
	//Swap with the maximum child - while
    public void heapifyDown(int i){
        int child;
        int temp = heap[i];
        while(kthChild(i,1)<heapsize){
            child = maxChild(i);
            if(temp < heap[child]){
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
    
    public int maxChild(int i){
        int leftChild = kthChild(i,1);
        int rightChild = kthChild(i,2);
        
        return heap[leftChild]>heap[rightChild]?leftChild:rightChild;
    }
    
    public void insert(int key){
        if(isFull()){
            throw new NoSuchElementException("The heap is full");
        }
        heap[heapsize++] = key;
        heapifyUp(heapsize-1);
    }
    
	//Swap with parent - while
    public void heapifyUp(int i){
        int temp = heap[i];
        while(i>0 && temp>heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }
    
    public static void main(String args[]){
        max_heap maxHeap = new max_heap(10);
        maxHeap.insert(10);
        maxHeap.insert(4);
        maxHeap.insert(9);
        maxHeap.insert(1);
        maxHeap.insert(7);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.printHeap();
        System.out.println("The item deleted at 1 is "+maxHeap.delete(1));
        maxHeap.printHeap();
    }
}