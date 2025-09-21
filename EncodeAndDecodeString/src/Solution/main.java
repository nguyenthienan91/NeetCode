
package Solution;


import java.util.ArrayList;
import java.util.List;


public class main {
    
    public static void main(String[] args) {
        
        List<String> strs = new ArrayList<>(List.of("neet", "code", "love", "you"));
        
        String result = encode(strs);
        System.out.println(result);
        
        List<String> test = decode(result);
        System.out.println(test);
        
    }
    
    
    
    public static String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        
        for (String str : strs) {
            sizes.add(str.length());
        }
        System.out.println("Size " + sizes);
        
        for (int size : sizes){
            res.append(size).append(',');
        }
        res.append('#');
        System.out.println("Res1 " + res);
        for (String str : strs) {
            res.append(str);
        }
        
        return res.toString();
    }

    public static List<String> decode(String str) {
        
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
            System.out.println(cur);
        }
        i++; //5
        for(int sz : sizes){
            res.add(str.substring(i, i + sz ));
            i += sz;
        }
        return res;
    }
    
}
