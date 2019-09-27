package miscellaneous_algo_from_canara_desktop;

public class circularRotation{
    
    static boolean isCircular(String s,String t){
        return (s.length() == t.length() && s.concat(s).indexOf(t)>0);
    }
    public static void main(String args[]){
        String s =   "ACTGACG";
        String t =   "TGACGAC";
        
        if(isCircular(s,t)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}