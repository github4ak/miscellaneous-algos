package miscellaneous_algo_from_canara_desktop;

class Pancakesort{
    
    static int findmax(int arr[],int n){

        int mi,i;
        for(mi=0,i=0;i<n;i++){
            if(arr[i]>arr[mi]){
                mi = i;
            }
        }
        return mi;
    }
    
    static void flip(int arr[],int pos){
        int temp,start = 0;
        while(start<pos){
            temp = arr[start];
            arr[start] = arr[pos];
            arr[pos] = temp;
            start++;
            pos--;
            
        }
    }
    
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    static void sort(int arr[],int size){
        for(int cursize = size;cursize>1;--cursize){
        int mi = findmax(arr,cursize);
        if(mi != cursize -1){
            flip(arr,mi);
            flip(arr,cursize-1);
        }
        }
    }
    
    public static void main(String args[]){
        int arr[] = {23, 10, 20, 11, 12, 6, 7};
        int n = arr.length;
        sort(arr,n);
        printarray(arr);
    }
}