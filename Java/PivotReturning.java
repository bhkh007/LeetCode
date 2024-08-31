public class PivotReturning{

    public static boolean isPivot(String moves){

        int x=0; 
        int y=0;
        for(int move : moves.toCharArray()){
            switch(move){
                case 'n':
                y--;
                break;
                case 'e':
                x++;
                break;
                case 'w':
                x--;
                break;
                case 's':
                y++;
                break;
                default:
                break;
            }
        }

        return true;
    }


    public static void main(String... args){
        String abc = "newsssew";
        System.out.println(isPivot(abc));
    }
}


/* 
given me the pivot in the 2-D matrix, who's initial position is not known,
 and then provided me the string like "news", "ne" or "newsesnw"  etc. 
 find after performing the operations based on each charachter of provided string
  (where n stands for movement in north direction, e for east , w for west and s for south)
   wheather the pivot at its starting position or not?
 */