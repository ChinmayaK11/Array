public class akanksha {
    public static void moveNegativesLeft(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        
        for (int num : arr) {
            if (num < 0) {
                temp[index++] = num;
            }
        }

 
        for (int num : arr) {
            if (num >= 0) {
                temp[index++] = num;
            }
        }

     
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7};
        moveNegativesLeft(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}
