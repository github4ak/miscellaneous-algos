package miscellaneous_algo_from_canara_desktop;


import java.util.*;

class HeapSort{

    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        int arr[] = {5,10,3,7,1};
        int i = 0;
        while(i<arr.length){
            minHeap.add(arr[i]);
            i++;
        }
        
        while(!minHeap.isEmpty()){
           System.out.print(minHeap.poll()+" "); 
        }
    }
}