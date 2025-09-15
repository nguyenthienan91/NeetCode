
package Solution;

import java.util.Arrays;


public class main {
    
    public static void main(String[] args) {
        
        String a = "thienan";
        String b = "naienbt";
        
        System.out.println(isAnagramByHashTable(a, b));
        
        
    }
    
    public static boolean isAnagram(String s, String t) {
        //1. Cách 1 : Sorting 
        int lengthOfStr1 = s.length();
        int lengthOfStr2 = t.length();
        
        if (lengthOfStr1 != lengthOfStr2){
            throw new IllegalArgumentException("Length of two string is not equal");
        }
        
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        
        return Arrays.equals(arrayS, arrayT);
            
    }
    
    public static boolean isAnagramByHashTable(String s, String t) {
         
        int lengthOfStr1 = s.length();
        int lengthOfStr2 = t.length();
        
        if (lengthOfStr1 != lengthOfStr2){
            throw new IllegalArgumentException("Length of two string is not equal");
        }
        
        int[] count = new int[26];
        for (int i = 0; i < lengthOfStr1; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int val : count) {
            if(val != 0){
                return false;
            }
        }
        return true;
            
    }
    
}
