 class Main{
    
    public static void main(String... args){
        
        String str = "ILoveJavaProgramming";
        
        int[] num = {1,5,9};
        
        StringBuilder sb = new StringBuilder(str);
        
        for(int i=0;i<num.length;i++){
            sb.insert(num[i]  +i ,' ');
        }
        
        System.out.println(sb.toString());
    }
}



/* 
    Questions asked in Raja Software Coding Round

 String str = "ILoveJavaProgramming";

write a java program to give space after the given numbers of index given in given array
int arr []= {0,4,8};
 */