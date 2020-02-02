import java.io.*; 
  
class GFG { 
    // Function print matrix in spiral form 
    static void spiralPrint(int m, int n, int a[][]) 
    { 
        int endrow = m,endcol = n,startrow = 0,startcol = 0,i,j;
        
        while(startrow < endrow && startcol < endcol){
            for(i=startcol;i<endcol;i++){
                System.out.print(a[startrow][i]+" ");
            }
            startrow++;
            
            for(j=startrow;j<endrow;j++){
                System.out.print(a[j][endcol-1]+" ");
            }
            
            endcol--;
            
            if(startrow<endrow){
                for(i=endcol-1;i>=startcol;i--){
                    System.out.print(a[endrow-1][i]+" ");
                }
                endrow--;
            }
            
            if(startcol<endcol){
                for(j=endrow-1;j>=startrow;j--){
                    System.out.print(a[j][startcol]+" ");
                }
                startcol++;
            }
        }
        
        
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        int R = 3; 
        int C = 6; 
        int a[][] = { { 1, 2, 3, 4, 5, 6 }, 
                      { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
        spiralPrint(R, C, a); 
    } 
} 

