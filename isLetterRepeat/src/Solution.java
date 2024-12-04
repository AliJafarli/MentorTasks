import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Integer isLetterRepeat(String s) {
        Map<Character,Integer> map = new HashMap<>();

        // java
        for (int i = 0; i < s.length(); i++) {

            if(map.containsKey(s.charAt(i))){
                return map.get(s.charAt(i));
            }

            map.put(s.charAt(i), i);
        }

        return -1;
    }
}
