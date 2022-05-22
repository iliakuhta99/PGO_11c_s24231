package PGO_04;

public class Matrix {

    private int row;
    private int column;
    private int[][] tablica;

        void print() {
            for (int i = 0; i < tablica.length; i++) {

                System.out.println("|  ");
                for (int k = 0; k < tablica[i].length; k++) {
                    new int = tablica[i][k];
                    System.out.print(tablica);
                }
                System.out.println("  |");
            }}


    private Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.tablica = new int[row][column];
        }

    Matrix m1 = new Matrix;
    Matrix m2 = new Matrix;

        static Matrix add (Matrix m1, Matrix m2) {

            var rowCount = m1.tablica.length;
            var columnCount = m1.tablica.length;

    public static void setUpMatrix (rowCount, columnCount) {
        if (rowCount <= 0 || columnCount <= 0) {
            System.out.println ("Matrix must have more than 0 columns/0 rows");
            return;
        }
        if (rowCount > 0 || columnCount > 0) {
        var row1 = m1.tablica.length;
        var col1 = m1.tablica.length;

        for (int i = 0; i < rowCount; i++) {
            var j = new int[columnCount];
            for (int k = 0; k < columnCount; k++) {
                j[k] = m1.tablica[i][k] + m2.tablica[i][k];
            }
        }
        return result;
    }}}

    static Matrix subtract(Matrix m1, Matrix m2) {
        var row1 = m1.tablica.length;
        var col1 = m1.tablica.length;

        public static void setUpMatrix (row1, col1);

        for (int i = 0; i < row1; i++) {
            var row = new int[col1];
            for (int k = 0; k < col1; k++) {
                row[k] = m1.tablica[i][k] - m2.tablica[i][k];
            }
        }
        return result;
    }


    }