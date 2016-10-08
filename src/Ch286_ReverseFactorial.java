import java.util.Scanner;

/**
 *
 * @author Tung Tran
 */

/**
 * Link to challenge: https://www.reddit.com/r/dailyprogrammer/comments/55nior/20161003_challenge_286_easy_reverse_factorial/
 */
public class Ch286_ReverseFactorial implements Solution{

    
    public static void main(String[] args) {
        System.out.println(new Ch286_ReverseFactorial().run());
    }

    @Override
    public String run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int i = 1;
        
        while(n%i == 0){
            n = n/i;
            i++;
            if(n==i){
               return temp + " = " + i + "!";
            }
        }    
        return n+ "  NONE";
    }

}
