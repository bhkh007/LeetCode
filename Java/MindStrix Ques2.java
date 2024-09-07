class Main {
    public static void main(String[] args) {
        int[] c1 = {1, 2, 3, 4, 5};
        int[] c2 = {2, 5, 8, 1, 6};
        printRepeated(c1, c2, c1.length, c2.length);
    }

    static void printRepeated(int[] c1, int[] c2, int c1Len, int c2Len) {
        int i = 0, j = 0;
        
        // Single loop to manually handle comparison
        while (i < c1Len) {
            // Compare c1[i] with all elements of c2 using only one loop
            if (c1[i] == c2[j]) {
                System.out.println(c1[i]);  // Print repeated element
            }

            // Increment j, reset and move to next i when j exceeds c2Len
            j++;
            if (j == c2Len) {
                i++;        // Move to the next element in c1
                j = 0;      // Reset j to compare next element in c1 with c2 again
            }
        }
    }
}






/*
given two integerarrays 
int [] c1 = {1,2,3,4,5};
int [] c2 = {2,5,8,1,6};

return all the repeated elements from two arrays
condtion: using only one loop
do not use any inbuilt methods

method signature
void printRepeated(int[] c1.int [] c2, int c1Len , int c2Len){}
 */