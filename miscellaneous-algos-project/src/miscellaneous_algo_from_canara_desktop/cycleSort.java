/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr = {2,4,5,1,3};
		
		cycleSort(arr,arr.length);
		
		System.out.println("After sort");
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
	
	private static void cycleSort(int[] arr,int n){
	    
	    for(int i=0;i<n-1;i++){
	        int curr = arr[i];
	        
	        int pos = i;
	        
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<curr){
	                pos++;
	            }
	        }
	        
	        if(pos == i){
	            continue;
	        }
	        
	        while(curr == arr[pos]){
	            pos++;
	        }
	        
	        int temp = arr[pos];
	        arr[pos] = curr;
	        curr = temp;
	        
	        while(pos != i){
	            pos = i;
	           
	            for(int j=i+1;j<n;j++){
    	            if(arr[j]<curr){
    	                pos++;
    	            }
	            }
	            
	            while(curr == arr[pos]){
	                pos++;
	            }
	        
    	        temp = arr[pos];
    	        arr[pos] = curr;
    	        curr = temp;
	        }
	    }
	}
}
