import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class PairSum{
	public PairSum(){}
	public List<Integer> pairsThatEqualSum(int[] arrayInt, int targetNum ){
		final List<Integer> allDifferentPairs = new ArrayList<>();
        // Aux. hash map
        final Map<Integer, Integer> pairs = new HashMap<>();
        for (int i : arrayInt) {
            if (pairs.containsKey(i)) {
                if (pairs.get(i) != null) {
                    // Add pair to returned list
                    allDifferentPairs.add(i);
                }
                // Mark pair as added to prevent duplicates
                pairs.put(targetNum - i, null);
            } else if (!pairs.containsValue(i)) {
                // Add pair to aux. hash map
                pairs.put(targetNum - i, i);
            }
        }
		return allDifferentPairs;
	}
	public static void main(String[] args){
		PairSum here= new PairSum();
		int[] a = {5, 7, 3, 2, 9, 6, 4, 1, 0, 7};
		System.out.println(here.pairsThatEqualSum( a, 7));
	}
}