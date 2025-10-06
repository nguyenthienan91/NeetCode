
package Solution;

public class main {
    
    public static void main(String[] args) {
        
        int[] height = {0,2,0,3,1,0,1,3,2,1};
        System.out.println((trapWithTwoPointer(height)));
        
    }
    
    public static int trap(int[] height) {
        
        int len = height.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int maxArea = 0;
        
        leftMax[0] = height[0];
        for(int i = 1; i < len; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        rightMax[len - 1] = height[len - 1];
        for(int i = len - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        for(int i = 0; i < len; i++){
            maxArea += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return maxArea;
        
    }
    
    public static int trapWithTwoPointer(int[] height) {
        
        int len = height.length;
        if(len == 0) {
            return 0;
        }
        int left = 0, right = len - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int maxArea = 0;
        while (left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                maxArea += leftMax - height[left];
            }else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                maxArea += rightMax - height[right];
            }
        }
        
        return maxArea;
       
        
    }
    
}
