package miscellaneous_algo_from_canara_desktop;

import java.lang.Math;

class MotorolaSolutions{
    
    static int getNumberOfDigits(int n){
        if(n<0){
            n = -1*n;
        }
        
        int count = 0;
        while(n!=0){
            n = n/10;
            ++count;
        }
        
        return count;
    }
    
    static double printMax(int n){
        int numberOfdigits = getNumberOfDigits(n);
        int sign = 1;
        if(n<0){
            n = n*-1;
            sign = -1;
        }
        
         if(n == 0){
             return (int) Math.max(n,5*Math.pow(10,1)+n);
         }
        
        double MAX =  sign*(5*Math.pow(10,numberOfdigits) + n);
        System.out.println("Max is "+MAX);
        
        for(int i=0; i<numberOfdigits ; i++){
            double exp =  Math.pow(10,i);
            int exp_part = (int) exp;
            int left_part = (int) n/exp_part;
            double left = left_part*(Math.pow(10,i+1));
            double right = 5*Math.pow(10,i) + (n%exp);
            double ans = sign*(left + right);
            
            if(ans>MAX){
                MAX = ans;
            }
        }
        
        return (int) Math.round(MAX);
    }
    
    public static void main(String args[]){
        System.out.println(printMax(268));
    }
}