import java.util.Arrays;

public class arrayExample2 {
	public static void main(String[] args) {
        int[] arr = {3, 6, 2, 9, 1, 8, 5, 4, 7}; // Sample array

        // Task 12: Find the second largest element in an array
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);

        // Task 13: Find the second smallest element in an array
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second smallest element: " + secondSmallest);

        // Task 14: Separate even and odd numbers of a given array of integers
        separateEvenAndOdd(arr);

        // Task 15: Find the k largest elements in a given array
        int k = 3;
        int[] kLargest = findKLargest(arr, k);
        System.out.println("K largest elements: " + Arrays.toString(kLargest));

        // Task 16: Find the k smallest elements in a given array
        int[] kSmallest = findKSmallest(arr, k);
        System.out.println("K smallest elements: " + Arrays.toString(kSmallest));

        // Task 17: Swap two array with temporary variable
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println("Before swapping:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        swapArrays(arr1, arr2);
        System.out.println("After swapping:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        // Task 18: Swap three numbers with temporary variable
        int a = 5, b = 10, c = 15;
        System.out.println("Before swapping:");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        swapThreeNumbers(a, b, c);
        System.out.println("After swapping:");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        // Task 19: Copy all the elements of one array into another array
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        copyArray(sourceArray, destinationArray);
        System.out.println("Copied array: " + Arrays.toString(destinationArray));

        // Task 20: Find the frequency of each element of an array
        int[] frequencyArray = {1, 2, 1, 3, 4, 2, 1};
        findFrequency(frequencyArray);

        // Task 21: Print the elements of an array in reverse order
        int[] reverseArray = {1, 2, 3, 4, 5};
        System.out.println("Array in reverse order: ");
        printArrayReverse(reverseArray);
    }

    // Task 12: Find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    // Task 13: Find the second smallest element in an array
    public static int findSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    // Task 14: Separate even and odd numbers of a given array of integers
    public static void separateEvenAndOdd(int[] arr) {
        int[] result = new int[arr.length];
        int evenIndex = 0, oddIndex = arr.length - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
        System.out.println("Separated array: " + Arrays.toString(result));
    }

    // Task 15: Find the k largest elements in a given array
    public static int[] findKLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, arr.length - k, arr.length);
    }

    // Task 16: Find the k smallest elements in a given array
    public static int[] findKSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }

    // Task 17: Swap two array with temporary variable
    public static void swapArrays(int[] arr1, int[] arr2) {
        int[] temp = Arrays.copyOf(arr1, arr1.length);
        System.arraycopy(arr2, 0, arr1, 0, arr1.length);
        System.arraycopy(temp, 0, arr2, 0, arr2.length);
    }

    // Task 18: Swap three numbers with temporary variable
    public static void swapThreeNumbers(int a, int b, int c) {
        int temp = a;
        a = b;
        b = c;
        c = temp;
    }

    // Task 19: Copy all the elements of one array into another array
    public static void copyArray(int[] source, int[] destination) {
        System.arraycopy(source, 0, destination, 0, source.length);
    }

    // Task 20: Find the frequency of each element of an array
    public static void findFrequency(int[] arr) {
        Arrays.sort(arr);
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " occurs " + count + " times");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " occurs " + count + " times");
    }

    // Task 21: Print the elements of an array in reverse order
    public static void printArrayReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
