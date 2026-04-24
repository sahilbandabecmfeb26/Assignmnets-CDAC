public class Q2_SortedArray {
    public static int[] insert(int[] arr, int element) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        int i;
        for (i = n - 1; i >= 0 && arr[i] > element; i--) {
            newArr[i + 1] = arr[i]; // shift elements
        }

        newArr[i + 1] = element;

        // copy remaining elements
        for (int j = 0; j <= i; j++) {
            newArr[j] = arr[j];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int[] result = insert(arr, 4);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}