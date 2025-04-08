public class MoveNegatives {
    public static void moveNegativesLeft(int[] arr) {
        int j = 0; // pointer for negative position
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap negative number to the front
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7};
        moveNegativesLeft(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}