package homework9.task2;

import java.util.HashSet;

public final class SetOperation {

    public static HashSet union(HashSet set1, HashSet set2) {
        HashSet result = new HashSet();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static HashSet intersection(HashSet set1, HashSet set2) {
        HashSet result = new HashSet(set1);
        result.addAll(set2);
        result.retainAll(set1);
        result.retainAll(set2);
        return result;
    }

    public static HashSet minus(HashSet set1, HashSet set2) {
        HashSet result = new HashSet(set1);
        result.addAll(set2);
        result.removeAll(set2);
        return result;
    }

    public static HashSet difference(HashSet set1, HashSet set2) {
        HashSet set3 = new HashSet(set1);
        set1.removeAll(set2);
        set2.removeAll(set3);
        set1.addAll(set2);
        return set1;
    }
}

