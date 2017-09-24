import java.util.ArrayList;

public class PackingProblem {

    int binWeight;
    int itemCount;
    // Should be sorted into ascending to minimize add/remove time
    ArrayList<Integer> items;

    public int getBinWeight() {
        return binWeight;
    }

    public Integer getNextItem() {
        if (items.isEmpty()) {
            return null;
        }
        int i = items.get(items.size());
        items.remove(items.size());
        return  i;
    }

    public int remainingCount() {
        return items.size();
    }

    public PackingProblem (int a, int b, int[] arr) {
        this.binWeight = a;
        this.itemCount = b;
        for (int i = 0; i < arr.length - 1; i++) {
            this.items.add(arr[i]);
        }
    }
}
