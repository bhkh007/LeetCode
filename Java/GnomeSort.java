class GnomeSort {

    // Method to perform Gnome Sort
    public static void gnomeSort(int[] array) {
        int n = array.length;
        int index = 0;

        while (index < n) {
            // If we're at the start of the array or the current element is in order
            if (index == 0 || array[index] >= array[index - 1]) {
                index++;
            } else {
                // Swap the elements and step back
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test Gnome Sort
    public static void main(String[] args) {
        int[] array = {34, 2, 78, 12, 45, 23};

        System.out.println("Original array:");
        printArray(array);

        gnomeSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
