public class DiagonalMatrix2 {
    public static void main(String[] args) {

        int[][] matrix = new int [4][4];
        for (int i = 0; i < matrix.length; i++) {
            int [] row = matrix[i];
            for (int j = 0; j < row.length; j++) {

               if( i == j) {
                  row [j] = 1;
                } else {
                   row [j] = 0;

                   }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int [] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
            }
            System.out.println();
        }
    }
}
