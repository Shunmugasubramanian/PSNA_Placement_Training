import java.util.*;
public class SumOfMaxRowAndCol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] a = new int[row][col];
        int i, j;
        int maxRow = Integer.MIN_VALUE, maxCol = Integer.MIN_VALUE;
        for(i = 0; i < row; i++) {
            int rowSum = 0, colSum = 0;
            for(j = 0; j < col; j++) {
                a[i][j] = s.nextInt();
                rowSum += a[i][j];
                colSum += a[j][i];
            }
            maxRow = Math.max(maxRow, rowSum);
            maxCol = Math.max(maxCol, colSum);
        }
        System.out.println("Row Sum: "+maxRow+" Col Sum: "+maxCol);
    }
}
