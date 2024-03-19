import java.util.Arrays;

public class ArrayExample1 {
	public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Sample array

        // 1) Calculate the average value of array
        double average = calculateAverage(arr);
        System.out.println("Average value of the array: " + average);

        // 2) Test if the array contains a specific value
        int specificValue = 12;
        boolean containsValue = containsSpecificValue(arr, specificValue);
        System.out.println("Array contains " + specificValue + ": " + containsValue);

        // 3) Find the index of an array element
        int element = 8;
        int index = findIndex(arr, element);
        System.out.println("Index of " + element + ": " + index);

        // 4) Remove a specific element from an array
        int[] newArr = removeElement(arr, 12);
        System.out.println("Array after removing 12: " + java.util.Arrays.toString(newArr));

        // 5) Find the maximum and minimum value of an array
        int max = findMaxValue(arr);
        int min = findMinValue(arr);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // 6) Reverse an array of integer values
        int[] reversedArray = reverseArray(arr);
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversedArray));

        // 7) Find the duplicate values of an array of integer values
        int[] duplicates = findDuplicateValues(arr);
        System.out.print("Duplicate values: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 8) Find the duplicate values of an array of string values
        String[] strArr = {"apple", "banana", "apple", "orange", "banana"};
        String[] strDuplicates = findDuplicateStringValues(strArr);
        System.out.print("Duplicate string values: ");
        for (String str : strDuplicates) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 9) Find the common elements between two arrays (string values)
        String[] arr1 = {"apple", "banana", "orange"};
        String[] arr2 = {"banana", "orange", "grape"};
        String[] commonElements = findCommonElements(arr1, arr2);
        System.out.print("Common elements: ");
        for (String str : commonElements) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 10) Remove duplicate elements from an array
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + java.util.Arrays.toString(uniqueArray));
        
        int[] array1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Sample array

        // 22) Print the elements of an array present on even position
        System.out.println("Elements at even positions:");
        printElementsAtEvenPosition(array1);

        // 23) Print the elements of an array present on odd position
        System.out.println("Elements at odd positions:");
        printElementsAtOddPosition(array1);

        // 24) Print the sum of all the elements of an array
        int sum = calculateSum(array1);
        System.out.println("Sum of all elements: " + sum);

        // 25) Sort the elements of an array in ascending order
        int[] sortedAsc = sortAscending(array1);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(sortedAsc));

        // 26) Sort the elements of an array in descending order
        int[] sortedDesc = sortDescending(array1);
        System.out.println("Sorted array in descending order: " + Arrays.toString(sortedDesc));

        // 27) Swap two array with temp variable
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6};
        System.out.println("Before swapping:");
        System.out.println("Array 1: " + Arrays.toString(arr3));
        System.out.println("Array 2: " + Arrays.toString(arr4));
        swapArrays(arr3, arr4);
        System.out.println("After swapping:");
        System.out.println("Array 1: " + Arrays.toString(arr3));
        System.out.println("Array 2: " + Arrays.toString(arr4));
    }

    // Task 1: Calculate the average value of array
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Task 2: Test if an array contains a specific value
    public static boolean containsSpecificValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    // Task 3: Find the index of an array element
    public static int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Task 4: Remove a specific element from an array
    public static int[] removeElement(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int num : arr) {
            if (num != element) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    // Task 5: Find the maximum value of an array
    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Task 6: Find the minimum value of an array
    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Task 7: Reverse an array of integer values
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    // Task 8: Find duplicate values of an array of integer values
    public static int[] findDuplicateValues(int[] arr) {
        int[] duplicates = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates[index++] = arr[i];
                    break;
                }
            }
        }

        return Arrays.copyOf(duplicates, index);
    }

    // Task 9: Find duplicate values of an array of string values
    public static String[] findDuplicateStringValues(String[] arr) {
        String[] duplicates = new String[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    duplicates[index++] = arr[i];
                    break;
                }
            }
        }

        return Arrays.copyOf(duplicates, index);
    }

    // Task 10: Find common elements between two arrays (string values)
    public static String[] findCommonElements(String[] arr1, String[] arr2) {
        String[] commonElements = new String[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str1.equals(str2)) {
                    commonElements[index++] = str1;
                    break;
                }
            }
        }

        return Arrays.copyOf(commonElements, index);
    }

    // Task 11: Remove duplicate elements from an array
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }
 // Task 22: Print the elements of an array present on even position
    public static void printElementsAtEvenPosition(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 23: Print the elements of an array present on odd position
    public static void printElementsAtOddPosition(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 24: Print the sum of all the elements of an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Task 25: Sort the elements of an array in ascending order
    public static int[] sortAscending(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    // Task 26: Sort the elements of an array in descending order
    public static int[] sortDescending(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        reverseArrayForSwap(sortedArr);
        return sortedArr;
    }

    // Task 27: Swap two array with temp variable
    public static void swapArrays(int[] arr1, int[] arr2) {
        int[] temp = Arrays.copyOf(arr1, arr1.length);
        System.arraycopy(arr2, 0, arr1, 0, arr1.length);
        System.arraycopy(temp, 0, arr2, 0, arr2.length);
    }

    // Utility method to reverse an array
    public static void reverseArrayForSwap(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}