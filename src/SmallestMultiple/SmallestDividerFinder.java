package SmallestMultiple;

public class SmallestDividerFinder {
    public int findSmallestDividerFor(int first, int last) {
        int result = last;

        for (int i=first; i<=last; i++) {
            if (result % i == 0) {
                continue;
            } else {
                result += 1;
                i = first;
            }
        }
        return result;
    }
}
