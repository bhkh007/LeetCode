import java.util.Arrays;

class RadixSort {

    // Method to get the maximum value in the array
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp
    private static void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n]; // output array to hold sorted values
        int[] count = new int[10]; // count array to store the frequency of digits (0 to 9)

        // Initialize count array with all zeros
        Arrays.fill(count, 0);

        // Store count of occurrences of digits in count[]
        for (int i = 0; i < n; i++) {
            int digit = (array[i] / exp) % 10;
            count[digit]++;
        }

        // Change count[i] so that it contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (array[i] / exp) % 10;
            output[count[digit] - 1] = array[i];
            count[digit]--;
        }

        // Copy the output array to array[], so that array[] now contains sorted numbers
        System.arraycopy(output, 0, array, 0, n);
    }

    // The main function to that sorts array[] of size n using Radix Sort
    public static void radixSort(int[] array) {
        // Find the maximum number to know the number of digits
        int max = getMax(array);

        // Do counting sort for every digit. Note that instead of passing digit number,
        // exp is passed. exp is 10^i where i is the current digit number.
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test Radix Sort
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original array:");
        printArray(array);

        radixSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
