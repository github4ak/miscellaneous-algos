package miscellaneous_algo_from_canara_desktop;

import java.util.Arrays;

class ToCheck{
    
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    static boolean findBin(int arr[],int l,int h,int key){
        if(h>=l){
            int m = l + (h-l)/2;
            if(arr[m]==key)
            return true;
            if(arr[m]>key){
                return findBin(arr,l,m-1,key);
            }
            else{
                return findBin(arr,m+1,h,key);
            }
        }
        
        return false;
        
            
    }
    
    
    
    public static void main(String args[]){
        int a[] = {23,132,53,2,5,31,122,334};
        Arrays.sort(a);
        boolean found = findBin(a,0,a.length-1,31);
        if(found)
        {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        printarray(a);
    }
}