public class PascalTriangle {

    public static void main(String args[]) {
        int n = 5;

        int[][] tri = new int[n][n];

        for (int i = 0; i < n; i++) {

            tri[i][0] = 1;
            tri[i][i] = 1;

            for (int j = 1; j < i; j++) {
                tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(tri[i][j] + " ");
            }
            System.out.println();
        }
    }
}
