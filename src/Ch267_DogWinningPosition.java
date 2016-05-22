/**DESCRIPTION
 * Your dog just won X place in a dog show, congratulations! 
 * You post your star's photo and placement announcement to /r/aww and,
 * predictably, a funny redditor asks what places the rest of 
 * the participating dogs took. Your job is to create a program 
 * that lists all places within the range of 0-100 in spoken English,
 * excluding the placing (X) of your winning pup.
 * 
 */

/** INPUT is the integer placement of your dog (X) within the range 0-100.
 * 
 */

/** OUTPUT
 * A reader should see a neatly formatted list of placements from 0-100 
 * in spoken English, excluding your dog's placement.
 */

import java.util.Scanner;

public class Ch267_DogWinningPosition implements Solution{
    private static int START = 0;
    private static int END = 101;
    
    public static void main(String[] args) {
        System.out.println(new Ch267_DogWinningPosition().run());
    }

    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position (within 0-100): ");
        int pos = in.nextInt();
        
        for(int i = START; i<= END; i++){
            if(i==pos || i ==0){
                System.out.print("");
            }else{
                if(i%10 == 1 && i%100 != 0 && i%100 != 11){
                    System.out.print(i+"st, ");
                }
                else if(i%10 == 2 && i%100 != 0 && i%100 != 12){
                    System.out.print(i+"nd, ");
                }
                else if(i%10 == 3 && i%100 != 0 && i%100 != 13){
                        System.out.print(i+"rd, ");
                }
                else{
                    System.out.print(i+"th, ");
                }
            }
        }
        System.out.println();
        return "";
    }
}