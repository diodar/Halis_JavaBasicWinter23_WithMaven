package DZ_18;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ManiUnitTestClassTest {

    ManiUnitTestClass mainTest;

    @Before
    public void setUp() {
        mainTest = new ManiUnitTestClass();
    }

    @Test
    public void arithmethicMeanDefaultArray() {
        int[] array = {5, 8, 9, 2, 6};
        mainTest.arithmethicMean(array);

        Assert.assertEquals(6, mainTest.arithmethicMean(array));
    }

    @Test
    public void arithmethicMeanEmptyArray() {
        int[] array = {};
        mainTest.arithmethicMean(array);

        Assert.assertEquals(-1, mainTest.arithmethicMean(array));
    }

    @Test
    public void arithmethicMeanPositiveNegative() {
        int[] array = {5, -8, 9, -2, 6};
        mainTest.arithmethicMean(array);

        Assert.assertEquals(2, mainTest.arithmethicMean(array));
    }

    @Test
    public void isMatrixSquareYes() {
        int[][] array = new int[5][5];
        mainTest.isMatrixSquare(array);

        Assert.assertTrue(mainTest.isMatrixSquare(array));
    }

    @Test
    public void isMatrixSquareNo() {
        int[][] array = new int[5][4];
        mainTest.isMatrixSquare(array);

        Assert.assertFalse(mainTest.isMatrixSquare(array));
    }

    @Test
    public void isMatrixSquareEmptyArray() {
        int[][] array = {};
        mainTest.isMatrixSquare(array);

        Assert.assertFalse(mainTest.isMatrixSquare(array));
    }

    @Test
    public void isMatrixSquareArrayOneOne() {
        int[][] array = new int[1][1];
        mainTest.isMatrixSquare(array);

        Assert.assertFalse(mainTest.isMatrixSquare(array));
    }
}