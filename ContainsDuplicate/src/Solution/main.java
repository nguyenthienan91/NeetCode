package Solution;

public class main {
    
    public static void main(String[] args) {
        int a[] = {1,2,3,4,4};
        hasDuplicate(a);
        if(hasDuplicate(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
  
        
    }
    
    public static boolean hasDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length; i++){
            int check = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if (check == nums[j]){
                    return true;
                }
            }
            
        }
        return false;
         
    }
 
}
