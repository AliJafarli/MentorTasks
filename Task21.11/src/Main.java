public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 6, 5};

        int result = findExtraValue(arr, arr2);
        System.out.println(result);
    }

    public static int findExtraValue(int[] arr, int[] arr2) {
        int xorResult = 0;

        for (int num : arr) {
            xorResult ^= num;
        }
        
        for (int num : arr2) {
            xorResult ^= num;
        }

        return xorResult;

    }
}