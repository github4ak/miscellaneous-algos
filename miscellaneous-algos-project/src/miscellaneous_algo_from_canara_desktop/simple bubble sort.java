package miscellaneous_algo_from_canara_desktop;

class simple_bubble_sort{
    void sort(int arr[]){
        int i,j;
        int n = arr.length;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
        simple_bubble_sort ob = new simple_bubble_sort();
        int arr[] ={64, 34, 25, 12, 22, 11, 90};
        
        ob.sort(arr);
        System.out.println("The sorted array is ");
        ob.printarray(arr);
        
        
    }
}
