package miscellaneous_algo_from_canara_desktop;

class mergesort{
    
    static void merge(int arr[],int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        
        int la[] = new int[n1];
        int ra[] = new int[n2];
        
        //Important - l+i
        for(int i=0;i<n1;i++){
            la[i] = arr[l+i];
        }
        
        for(int j=0;j<n2;j++){
            ra[j] = arr[m+1+j];
        }
        
        int i = 0;
        int j = 0;
		
		//Important - k = il
        int k =  l;
        while(i<n1 && j<n2){
            if(la[i]<ra[j]){
                arr[k] = la[i];
                i++;
            }
            else{
                arr[k] = ra[j];
                j++;
            }
           k++; 
        }
        
        while(i<n1){
            arr[k] = la[i];
            k++;
            i++;
        }
        
        while(j<n2){
            arr[k] = ra[j];
            k++;
            j++;
        }
    
    }
    
    static void msort(int arr[],int l,int r){
        if(l<r){
            int m = (l+r)/2;
            msort(arr,l,m);
            msort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    
    
    static void printarray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    
    public static void main(String args[]){
        int arr[] = {5,23,7,12,19};
        msort(arr,0,arr.length-1);
        printarray(arr);
    }
}