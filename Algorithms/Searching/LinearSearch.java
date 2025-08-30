import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag = false;
        int i;
        int[] arr = new int[n];
        for(i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.print("Enter the Search Element: ");
        int target = s.nextInt();
        for(i = 0; i < n; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
        if(flag == true) 
            System.out.println("Element found!");
        else 
            System.out.print("Element Not found");
    }
}
