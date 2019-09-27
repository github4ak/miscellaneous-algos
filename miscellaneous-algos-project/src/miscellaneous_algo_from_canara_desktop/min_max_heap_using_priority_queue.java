package miscellaneous_algo_from_canara_desktop;

import java.util.*;

class pqHeap{
    
    static void printHeap(PriorityQueue<Integer> heap){
        Iterator<Integer> it = heap.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(3);
        minHeap.add(7);
        minHeap.add(1);
        System.out.println("Min Heap is ");
        printHeap(minHeap);
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return -Integer.compare(o1,o2);
        }
    });
        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(3);
        maxHeap.add(7);
        maxHeap.add(1);
        System.out.println("\nMax Heap is ");
        printHeap(maxHeap);
    }
}