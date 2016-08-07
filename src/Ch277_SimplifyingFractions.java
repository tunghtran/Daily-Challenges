/**
 * https://www.reddit.com/r/dailyprogrammer/comments/4uhqdb/20160725_challenge_277_easy_simplifying_fractions/
 */
import java.util.Scanner;


/**
 *
 * @author Tung Tran
 */
public class Ch277_SimplifyingFractions {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        
        boolean done = false;
        while(!done){
            a = in.nextInt();
            b = in.nextInt();
            if(a!= 0 && b!= 0){
                int factor = gcd(a,b);
                a = a/factor;
                b = b/factor;
                System.out.println(a + " " + b + "\n");
            }
            else{
                done = true;
            }
            if(done){
                System.exit(0);
            }
        }
        
        
    }

    public static int gcd(int a, int b){
        
        if (a == 0 || b ==0)
            return (a+b); //Base case
        else
        {
            if(a%b == 0)
                return b;
            return gcd(b, a%b);
        }
        
    }
}
