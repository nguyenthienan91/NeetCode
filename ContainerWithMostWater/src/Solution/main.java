
package Solution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
        
        int[] check = {2,2,2};
        System.out.println(maxArea(check));
        
    }
    
    public static int maxArea(int[] heights) {
        
        int len = heights.length;
        
        int left = 0;
        int right = len - 1;
        List<Integer> results = new ArrayList<>();
//        int maxArea = 0;
        
        
        while(left < right){

            int area = Integer.min(heights[left],heights[right]) * (right - left);
            results.add(area);
           
//          maxArea = Integer.max(area, maxArea);
            
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
                  
           
        }
        
        return Collections.max(results);
        
    }
    
}
