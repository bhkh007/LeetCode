class Main {
    public static void main(String[] args) {
        int[] c1 = {1, 2, 3, 4, 5};
        int[] c2 = {6, 7, 8, 9, 0};
        int[] c3 = new int[c1.length + c2.length]; // Merged array

        printMerged(c1, c2, c3, c1.length, c2.length);

        // Print the merged array
        for (int i = 0; i < c3.length; i++) {
            System.out.print(c3[i] + " ");
        }
    }

    static void printMerged(int[] array1, int[] array2, int[] c3, int array1len, int array2len) {
        int i = 0, j = 0, k = 0; // Indices for array1, array2, and c3 respectively
        
        while (i < array1len || j < array2len) {
            // Copy two elements from array1 if within bounds
            if (i < array1len) {
                c3[k++] = array1[i++];
                if (i < array1len) {
                    c3[k++] = array1[i++];
                }
            }

            // Copy two elements from array2 if within bounds
            if (j < array2len) {
                c3[k++] = array2[j++];
                if (j < array2len) {
                    c3[k++] = array2[j++];
                }
            }
        }
    }
}




/* 
 given two integerarrays 
int [] c1 = {1,2,3,4,5};
int [] c2 = {6,7,8,9,0};

another integer array c3
copy all elements from two arrays
alternatively every two character such that
char c3[] = {1,2,6,7,3,4,8,9,5,0};
condition is use only one loop

method signature
void printMerged(int[] array1, int[] array2 , int[] c3 , int array1len , int array2len)
 */