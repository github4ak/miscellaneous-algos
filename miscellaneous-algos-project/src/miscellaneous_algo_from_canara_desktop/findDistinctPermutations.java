package miscellaneous_algo_from_canara_desktop;


import java.util.*;

class Permutations{
    public static void main(String args[]){
        String s = "foo";
        
        Set<String> distinctPermutations = new HashSet<>();
        findPermutations("",s,distinctPermutations);
        System.out.println(distinctPermutations);
    }
    
    static void findPermutations(String prefix,String str, Set<String> distinctPermutations){
        int n = str.length();
        if(n == 0){
            distinctPermutations.add(prefix);
        }
        else{
            for(int i = 0 ; i < n ; i++){
                findPermutations(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n),distinctPermutations);
            }
        }
        
    }
}