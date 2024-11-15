import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 14, 2, 1, 2, 3};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] arr2 = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (arr2[i] > 0) {
                arr[index++] = i;
                arr2[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}