  class Main{
    
    public static int sumDigits(int number){
        int sum = 0;
        while(number>0){
            sum +=number%10;
            number/=10;
        }
        return sum;
    }
    
    
    public static int sumOfAll(int number){
        
        while(number>=10){
            number = sumDigits(number);
        }
        
        return number;
    }
    
    
    public static void main(String... args){
        int nums = 5;
        
        System.out.println(sumOfAll(nums));
    }
} 


/* 
  given me the string containing number ex-2468, 
  asked me to find the output of sum of digits until the sum is single digit

 */