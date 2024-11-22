import java.util.ArrayList;
import java.util.List;

public class SubsetRecursive<T> {
    private void backTrack(int index, List<T> current, List<T> values, List<List<T>> subsets) {
        subsets.add(new ArrayList<>(current));
        for (int i = index; i < values.size(); i++) {
            current.add(values.get(i));
            backTrack(i+1, current, values,subsets);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("A");
        nums.add("B");
        nums.add("C");
        int index = 0;
        List<List<String>> subsets = new ArrayList<>();
        List<String> current = new ArrayList<>();
        SubsetRecursive subSet = new SubsetRecursive();
        subSet.backTrack(index, current, nums, subsets);
        System.out.println(subsets);
    }
}
