class Main{
    
    public static boolean isPerfect(int x){
        int s = (int) Math.sqrt(x);
        return s*s ==x;
        
    }
    
    public static boolean isFibonacci(int n){
        return isPerfect(5*n*n + 4) || isPerfect(5 * n*n -4);
    }
    
    public static int sumEven(int input){
        if(isFibonacci(input)){
            return input;
        }
        
        else{
            int evenNum = 0;
            int a=0, b=1;
            while(b<input){
               if(b%2==0){
                evenNum +=b;
               }
               int nextFib =a+b;
               a=b;
               b= nextFib;
            }
            return evenNum;
        }
        
    }
    
    
    public static void main(String...args){
        int input = 20;
        System.out.println(sumEven(input));
    }
    
    
}


/* 

A-5 Variation of Fibonacci
The Fibonacci sequence is constructed by adding the last two numbers of the sequence so far to get the
next number in the sequence. The first and the second numbers of the sequence are defined as 0 and 1
We get.
o, 1, 1, 2, 3, 5, 8, 13, 21

Write a tunctlon w
s Input as a number:
If the given number is a Fibonacci number, print the number
If the given number is NOT Fibonacci number, print the sum of all even Fibonacci numbers
less than the given number.
int getFibOutput(int input) {
Example
Input: 21 Output: 21
Input: 20 Output: 10



 */
