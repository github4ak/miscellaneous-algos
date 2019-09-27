package miscellaneous_algo_from_canara_desktop;

class insort{
    
    
    static void sort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key =  arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    
    
    static void printarray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    
    public static void main(String args[]){
        int arr[] = {23,5,7,12,19};
        sort(arr);
        printarray(arr);
    }
}