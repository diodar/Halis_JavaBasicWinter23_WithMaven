package DZ_18;

public class ManiUnitTestClass {

    public int arithmethicMean(int[] array) {

        int sum = 0;
        int average;
        for (int i : array) sum += i;

        if (array.length == 0) {
            return -1;
        }
        average = sum / array.length;

        return average;
    }

    public boolean isMatrixSquare(int[][] array) {
        int numRows;
        int numCols;

        if (array.length > 1 && array[0].length > 1) {
            numRows = array.length;
            numCols = array[0].length;

            return numRows == numCols;
        }
        return false;
    }
}


