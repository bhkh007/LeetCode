 class Insertion{
    
    public static void insertion(int[] array){
        int n= array.length;
        for(int i=0;i<n;++i){
            int key = array[i];
            int j = i-1;
            
            
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }    
    
    public static void printArray(int[] array){
        int n = array.length;
        for(int i=0;i<n;++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String...args){
        int [] array = {10,50,60,24,2,50,2,99};
        
        printArray(array);
        insertion(array);
        printArray(array);
    }
}




/* Insertion Sort using key element (without using swapping)
 Elements that are greater than the key are shifted one position to the right.
The key is then inserted into its correct position.
*/



class InsertionSwapping{
    
    public static void insertion(int [] array){
        int n = array.length;
        for(int i=1;i<n;++i){
            int j=i;
            
            while(j>0 && array[j-1] > array[j]){
                swap(array, j-1, j);
                j--;
            }
        }
    }
    
    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void printArray(int[] array){
        int n= array.length;
        for(int i=0;i<n;++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String... args){
        int [] array = {10,58,30,20,15,99,1};
        
        printArray(array);
        
        insertion(array);
        
        printArray(array);
    }
    
}



/* Insertion sorting using swapping elements */