package miscellaneous_algo_from_canara_desktop;

class qsort{
    
    static int partition(int arr[],int l,int h){
        int pivot = arr[h];
        int i = l-1;
        
        for(int j=l;j<h;j++){
            //Important =
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
            int temp = arr[i+1];
            arr[i+1] = arr[h];
            arr[h] = temp;
        }
        
        //position of the pivot
        return i+1;
    }
    
    static void sort(int arr[],int l,int h){
        if(l<h){
            int pi = partition(arr,l,h);
            sort(arr,l,pi-1);
            sort(arr,pi+1,h);
        }
    }
    
    
    static void printarray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {23,5,7,19,12};
        sort(arr,0,arr.length-1);
        printarray(arr);
    }
}																																																																																			