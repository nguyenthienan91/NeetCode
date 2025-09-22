
package Solution;

import java.util.Arrays;

public class main {
    
    public static void main(String[] args) {
        
        int[] test = {5,2,4,6};
        
        System.out.println(Arrays.toString(productExceptSelfOptimal(test)));
        
    }
    
    
    public static int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] arr = new int[len];
        
        for (int i = 0; i < len; i++){
            int product = 1;
            for (int j = 0; j < len; j++){
                if (i != j){
                    product *= nums[j];
                }
            }
            arr[i] = product;
        }  
        return arr;
        
    }
    
    public static int[] productExceptSelfOptimal(int[] nums) {
        
        int len = nums.length;
        int[] res = new int[len];
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        
        prefix[0] = 1;
        suffix[len - 1] = 1;
        
        for (int i = 1; i < len; i++){
            prefix[i] = nums[i - 1] * prefix[i - 1]; 
        }
        
        for (int i = len - 2; i >= 0; i--){
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }
        
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

        
        
        for (int i = 0; i < len; i++){
            res[i] = prefix[i] * suffix[i];
        }
        
        return res;
  
    }
}
