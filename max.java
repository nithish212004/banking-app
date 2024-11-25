import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            int max = arr[i];
            for (int j = i + 1; j < a; i++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            if (i % 2 != 0) {
                arr[a - i] = max;
            } else {
                arr[i] = max;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
