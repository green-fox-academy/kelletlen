public class DiagonalMatrix {
    public static void main(String[] args) {
        int [][] Matrix  = { {1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};

        for (int row=0; row < Matrix.length; row++) {
            for (int col=0; col<Matrix[row].length; col++) {
                System.out.print(Matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
