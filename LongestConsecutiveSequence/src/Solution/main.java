
package Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class main {
    public static void main(String[] args) {
        
        int[] check = {9,1,4,7,3,-1,0,5,8,-1,6};
        
        int result = longestConsecutive(check);
        System.out.println(result);
        
    }
    
    
    
    public static int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) return 0;
        
        int len = nums.length;
        Arrays.sort(nums);
        int longest = 1;
        int currentStreak = 1;
        
        
        for (int i = 1; i < len; i++){
            if (nums[i] == nums[i-1]) {
                continue;
            }
            if(nums[i] - nums[i-1] == 1){
                currentStreak++;
                longest = Math.max(longest, currentStreak);
            }else {
                currentStreak = 1;
            }
        }
        
//        System.out.println(result);
        
        return longest;
        
    }
    
}
