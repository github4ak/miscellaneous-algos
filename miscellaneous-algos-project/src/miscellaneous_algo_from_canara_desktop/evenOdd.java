/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static void segregateEvenOdd(int arr[]){
        int left = 0,right = arr.length -1;
        
        while(left < right){
            while(arr[left]%2 == 0 && left < right){
                left++;
            }
            
            while(arr[right]%2 == 1 && left < right){
                right--;
            }
            
            if(left <  right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp; 
            }
        }
        
    }
    
    
	public static void main (String[] args) {
	    int arr[] = {12, 34, 45, 9, 8, 90, 3}; 
  
        segregateEvenOdd(arr); 
  
        System.out.print("Array after segregation "); 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+" "); 
	}
}

