import java.util.HashMap;
import java.util.Set;

public class Solution1338 {
    public int minSetSize(int[] arr) {

        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int e : arr) {
            occurrences.merge(e, 1, Integer::sum);
        }

        int l = arr.length/2;
        int count = 0;
        int n = 0;

        while (n < l) {
            Set<Integer> keySet = occurrences.keySet();
            int maxKey=keySet.stream().findFirst().get();
            int maxValue = occurrences.get(maxKey);
            for (Integer e : keySet) {
                int value = occurrences.get(e);
                if (value > maxValue){
                    maxKey = e;
                    maxValue = value;
                }
            }
            count++;
            n += maxValue;
            occurrences.remove(maxKey);
        }

        return count;
    }
}