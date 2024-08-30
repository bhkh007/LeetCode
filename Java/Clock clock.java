 class Clock{
    
    public static int getAngle(int hh, int mm){
        
        int minute_angle = 6 * mm;
         
        double hour_angle = 30 * hh + 0.5 * mm;
        
        double diff = Math.abs(hour_angle - minute_angle);
        
        return (int) Math.min(diff, 360 - diff);
        
    }
    
    
    public static void main(String... args){
        
        int hh1 = 05, mm1 = 05;
        
        System.out.println(getAngle(hh1, mm1));
    }
}




/* 

A-4: Clock Angle
Write a function to print the angle between hour hand and minute hand in an analog clock at any gtven
time. Please print the lesser of the angles.
Int getAngle(int hh, int mm) {
// TODO:
}
Note:
hh value can be between 1 to 12
mm value can be between 0 to 59
Example
Input: 6, OO Output: 180
Input 5, 30 Output 15




 */