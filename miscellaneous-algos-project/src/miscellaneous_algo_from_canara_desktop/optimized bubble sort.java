package miscellaneous_algo_from_canara_desktop;

class Bubblesort{
    void sort(int arr[]){
        int i,j;
        int n = arr.length;
        boolean swap = false;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                if(!swap){
                    break;
                }
            }
        }
        
    }
    
    void printarray(int arr[]){
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Bubblesort ob = new Bubblesort();
        int arr[] ={64, 34, 25, 12, 22, 11, 90};
        
        ob.sort(arr);
        System.out.println("The sorted array is ");
        ob.printarray(arr);
        
        
    }
}
