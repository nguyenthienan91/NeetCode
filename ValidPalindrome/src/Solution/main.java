
package Solution;


public class main {
    public static void main(String[] args) {
        String check = "tab a cat";
        System.out.println(isPalindrome(check));
        
    }
    
    public static boolean isPalindrome(String s) {
        
        String res = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int prv = 0;
        int las = res.length() - 1;
        
        while(prv < las){
            if(res.charAt(prv) != res.charAt(las)){
                return false;
            }
            prv++;
            las--;
            
        }
        return true;
        
    }
    
}
