package miscellaneous_algo_from_canara_desktop;

class rec_bubblesort{

    static void recursiverec_bubblesort(int arr[],int n){
        if(n==1)
        return;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =  temp;
            }
        }
        
        recursiverec_bubblesort(arr,n-1);
    }
    
    static void printarray(int arr[]){
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        
        int arr[] ={64, 34, 25, 12, 22, 11, 90};
        recursiverec_bubblesort(arr,arr.length);
        printarray(arr);
        
        
        
    }
}
