package miscellaneous_algo_from_canara_desktop;

import java.util.*;
import static java.lang.Math.pow;
public class findCubePairs{
    int x;
    int y;
    findCubePairs(int i,int j){
        x = i;
        y = j;
    }
}

class findCubefindCubePairs{
    public static void main(String args[]){
        HashMap<Long,ArrayList<findCubePairs>> hashmap = new HashMap<>();
        
        int n = 500;
        
        for(int i = 1 ; i <  n; i++){
            for(int j = 1; j < n; j++){
                long sum = (long)(pow(i,3)+pow(j,3));
                
                if(hashmap.containsKey(sum)){
                    List<findCubePairs> list = hashmap.get(sum);
                    for(findCubePairs p : list){
                        if(i != j && i!=p.x && i!=p.y)
                        System.out.println(i+":"+j+"-"+p.x+":"+p.y);
                    }
                } else {
                    ArrayList<findCubePairs> list = new ArrayList<>();
                    hashmap.put(sum,list);
                }
                hashmap.get(sum).add(new findCubePairs(i,j));
            }
        }
    }
}	