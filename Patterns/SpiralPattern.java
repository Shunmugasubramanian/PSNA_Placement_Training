import java.util.*;
public class SpiralPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1, i;
        while(top <= bottom && left <= right) {

            for(i = left; i <= right; i++)
                arr[top][i] = num++;
            top++;

            for(i = top; i <= bottom; i++)
                arr[i][right] = num++;
            right--;

            for(i = right; i >= left; i--)
                arr[bottom][i] = num++;
            bottom--;

            for(i = bottom; i >= top; i--)
                arr[i][left] = num++;
            left++;
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
