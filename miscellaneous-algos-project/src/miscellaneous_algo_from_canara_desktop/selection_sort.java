package miscellaneous_algo_from_canara_desktop;

class selsort{
    
    static int findmin(int arr[],int n){
        int mpos = n;
        int minelement = arr[n];
        for(int j=n+1;j<arr.length;j++){
            if(arr[j]<minelement){
                mpos = j;
            }
        }
        return mpos;
    }
    
    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    static void sort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
        int min_position = findmin(arr,i);
        swap(arr,i-1,min_position);
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