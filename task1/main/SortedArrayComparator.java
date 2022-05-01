package homework9.task1;

import java.util.Comparator;

public class SortedArrayComparator<I extends Number> implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        SortedArray sortedArray = new SortedArray();
        Integer sum1 = sortedArray.getSumOfFiguresFromNumber(o1);
        Integer sum2 = sortedArray.getSumOfFiguresFromNumber(o2);
        return sum1 - sum2;
    }
}
