
package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main {
    
    public static void main(String[] args) {
        
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
        
        
        
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> signatures = new ArrayList<>();
        
        for (String s : strs) {
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            
            // kiểm tra coi đã có group này chưa
            int index = - 1;
            for (int i = 0; i < signatures.size(); i++){
                if (signatures.get(i).equals(sorted)){
                    index = i;
                    break;
                }
            }
            
            // nếu có rồi thì thêm vào group 
            if (index != -1){
                result.get(index).add(s);
            }else{
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                result.add(newGroup);
                signatures.add(sorted);
            }
         
        }
        
        System.out.println(signatures);
        return result;
         
    }
    
}
