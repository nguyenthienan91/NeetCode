package Solution;
import java.util.Arrays;

public class main {
    
    public static void main(String[] args) {
        
        int[] check = {1,2,3,4};
        int target = 3;
        
        System.out.println(Arrays.toString((twoSumByPointers(check, target))));
        
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        // trả về 1 mảng có 2 số cộng lại = target
        // và index1 < index2
        // index1 và index2 không thể bằng nhau, nên ko được sử dụng cùng 1 phần tử 
        
        int len = numbers.length;
        int[] result = new int[2];
        
        for (int pt1 = 0; pt1 < len; pt1++) {
            for (int pt2 = pt1 + 1; pt2 < len; pt2++) {
                if(numbers[pt1] + numbers[pt2] == target){
                    result = new int[]{pt1 + 1, pt2 + 1};
                    return result; 
                }
            }
        }
        return new int[0];
    }
    
    public static int[] twoSumByPointers(int[] numbers, int target) {
        
        int l = 0, r = numbers.length - 1;
        
        while(l < r){
            int currSum = numbers[l] + numbers[r];
            
            if(currSum > target){
                r--;
            }else if(currSum < target){
                l++;
            }else {
                return new int[] { l + 1, r + 1};
            }
            
        }
        
        return new int[0];
    } 
}
