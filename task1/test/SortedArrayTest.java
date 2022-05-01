package homework9.task1;

import org.junit.Assert;
import org.junit.Test;

public class SortedArrayTest {

    private SortedArray sortedArray = new SortedArray();

    @Test
    public void testGetSumOfFiguresFromNumber() {
        int num = 369;
        int expected = 18;

        int actual = sortedArray.getSumOfFiguresFromNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSumOfFiguresFromNumber_IfNumberIsFromZeroTill9() {
        int num = 9;
        int expected = 9;

        int actual = sortedArray.getSumOfFiguresFromNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSumOfFiguresFromNumber_IfNumberIsZero() {
        int num = 0;
        int expected = 0;

        int actual = sortedArray.getSumOfFiguresFromNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSumOfFiguresFromNumber_IfNumberIsNegative() {
        int num = -25;
        int expected = 7;

        int actual = sortedArray.getSumOfFiguresFromNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedArrayInOrderOfSumFiguresOfItsNumbers() {
        Integer[] arr = {2, -42, 361, 82, -63, 994, 0, -5, 71, 4, -25, 99};
        Integer[] expected = {0, 2, 4, -5, -42, -25, 71, -63, 361, 82, 99, 994};

        Integer[] actual = sortedArray.getSortedArrayInOrderOfSumFiguresOfItsNumbers(arr);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSortedArrayInOrderOfSumFiguresOfItsNumbers_IfOneNumber() {
        Integer[] arr = {965};
        Integer[] expected = {965};

        Integer[] actual = sortedArray.getSortedArrayInOrderOfSumFiguresOfItsNumbers(arr);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSortedArrayInOrderOfSumFiguresOfItsNumbersNegative_IfArrIsNull() {
        sortedArray.getSortedArrayInOrderOfSumFiguresOfItsNumbers(null);
    }
}