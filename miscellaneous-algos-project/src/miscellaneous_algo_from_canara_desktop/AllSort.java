import java.util.Arrays;

//Sorts as implemented by CTCI - Merge and Quick have good implementation

public class AllSorts{

     public static void main(String []args){
         int arr0[] = {5,12,33,2,23};
         int arr1[] = {4,34,33,2,35};
         int arr2[] = {32,4,553,34,322};
         int arr3[] = {32,22,34,52,11};
         
        System.out.println(Arrays.toString(bubblesort(arr0)));
        
        System.out.println(Arrays.toString(selsort(arr1)));
        
        System.out.println(Arrays.toString(mergeSort(arr2)));
        
        System.out.println(Arrays.toString(quickSort(arr3)));
        
     }
     
     static int[] bubblesort(int arr[]){
         int temp = 0;
         
         for(int i=0;i<arr.length;i++){
             for(int j=i; j<arr.length-1;j++){
                 if(arr[j] > arr[j+1]){
                     temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         
        return arr;
     } 
     
     static int[] selsort(int arr[]){
         
         for(int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int min_position = i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<min){
                     min = arr[j];
                     min_position = j;
                 }
             }
             int temp = arr[i];
             arr[i] =  arr[min_position];
             arr[min_position] = temp;
         }
         return arr;
     }
     
     
     static int[] mergeSort(int arr[]){
         int helper[] = new int[arr.length];
         mergesort(arr,helper,0,arr.length-1);
         return arr;
     }
     
     static void mergesort(int arr[],int helper[],int low,int high){
        
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr,helper,low,mid);
            mergesort(arr,helper,mid+1,high);
            merge(arr,helper,low,mid,high);
        }
        
     }
     
     static void merge(int arr[],int helper[],int low,int middle,int high){
         
         for(int i=low; i<=high; i++){
             helper[i] = arr[i];
         }
         
         int current = low;
         int helperLeft = low;
         int helperRight = middle + 1;
         
         while(helperLeft<=middle && helperRight<=high){
             if(helper[helperLeft]>helper[helperRight]){
                 arr[current] = helper[helperRight];
                 helperRight++;
             }
             else{
                 arr[current] = helper[helperLeft];
                 helperLeft++;
             }
             current++;
         } 
         
         int remaining = middle - helperLeft;
         
         for(int i=0; i<=remaining; i++){
             arr[current+i] = helper[helperLeft+i];
         }
    
     }
     
     static int[] quickSort(int arr[]){
         quicksort(arr,0,arr.length-1);
         return arr;
     }
     
     static void quicksort(int arr[],int left,int right){
         int index = partition(arr,left,right);
        
             if(left<index-1){
                quicksort(arr,left,index-1);
             }
             if(right>index){
                 quicksort(arr,index,right);
             }
     }
     
     static int partition(int arr[],int left,int right){
         int pivot = arr[(left+right)/2];
         
         while(left<=right){
             while(arr[left] < pivot){
                 left++;
             }
             while(arr[right] > pivot){
                 right--;
             }
             
             if(left<=right){
                 int temp = arr[right];
                 arr[right] = arr[left];
                 arr[left] = temp;
                 left++;
                 right--;
             }
         }
         
         return left;
     }
     
     
     
     
     
}
