import java.util.ArrayList;
import java.util.List;

public class SubsetIterative<T> {
    private List<List<T>> findSubset(ArrayList<T> values) {
        List<List<T>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(T value: values) {
            List<List<T>> newsubsets = new ArrayList<>();
            for (List<T> subset: subsets) {
                List<T> s = new ArrayList<>(subset);
                s.add(value);
                newsubsets.add(s);
            }
            subsets.addAll(newsubsets);
        }
        return subsets;
    }

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("A");
        nums.add("B");
        nums.add("C");
        SubsetIterative<String> iterative = new SubsetIterative<>();
        System.out.println(iterative.findSubset(nums));
    }
}
