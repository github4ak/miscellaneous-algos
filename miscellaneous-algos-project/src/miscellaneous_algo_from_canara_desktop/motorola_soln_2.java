package miscellaneous_algo_from_canara_desktop;

class motorola_soln_2{
    
    static String printString(String s){
        
        for(int i=0; i<=s.length()-3;i++){
            
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                s = s.substring(0,i)+s.substring(i+1,s.length());
                return printString(s);
            }
        }
        
        return s;
    }
    
    public static void main(String args[]){
        String str = "xxxxxxxttttttttxxxxxxx";
        System.out.println(printString(str));
    }
}