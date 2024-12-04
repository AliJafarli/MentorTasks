import java.util.HashSet;
import java.util.Set;

public class Solution {


    public boolean isRepeat(int n) {
        Set<Integer> set = new HashSet<>();
        while (n>0){

            int q = n % 10;

            if(set.contains(q)){
                return true;
            }

            set.add(q);



            n/=10;
        }

        return false;
    }
}
