package homework9.task1;

import java.util.Arrays;

public class SortedArray {

    public int getSumOfFiguresFromNumber(int num) {
        int sum = 0;
        if (num % 10 == 0) {
            sum = Math.abs(num);
        }
        while (num % 10 != 0) {
            int last = Math.abs(num % 10);
            num /= 10;
            sum += last;
        }
        return sum;
    }

    public Integer[] getSortedArrayInOrderOfSumFiguresOfItsNumbers(Integer[] arr) {
        Arrays.sort(arr, new SortedArrayComparator<Integer>());
        return arr;
    }
}
