 class Main{
    
    public static boolean power(int n){
        return n>0 && (n &(n-1)) == 0;
    }
    
    public static int isPower(int [] arr){
        
        int count = 0;
        
        for(int num : arr) {
            if(power(num)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String... args){
        int [] arr = {10,20,64,128,4,8,16};
        System.out.println(isPower(arr));
    }
    
}


/* 
given me the array and asked me to find the no. of elements which are exactly the power of 2?

 */