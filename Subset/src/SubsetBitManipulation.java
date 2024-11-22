import java.util.ArrayList;
import java.util.List;

public class SubsetBitManipulation<T> {

    private List<List<T>> findSubset(List<T> values) {
        List<List<T>> subsets = new ArrayList<>();
        int size = values.size();
        int totalSubset = 1 << size;

        for (int i = 0; i < totalSubset; i++) {
            List<T> subset = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(values.get(j));
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("A");
        nums.add("B");
        nums.add("C");
        SubsetBitManipulation<String> subSet = new SubsetBitManipulation<>();
        System.out.println(subSet.findSubset(nums));
    }
}
