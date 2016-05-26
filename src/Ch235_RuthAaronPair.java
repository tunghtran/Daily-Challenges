/** DESCRIPTION (https://www.reddit.com/r/dailyprogrammer/comments/3nkanm/20151005_challenge_235_easy_ruthaaron_pairs/)
 * determine if a pair of numbers is indeed a valid Ruth-Aaron pair
 * In mathematics, a Ruth–Aaron pair consists of two consecutive integers (e.g. 714 and 715)
 * for which the sums of the distinct prime factors of each integer are equal. 
 * For example, we know that (714, 715) is a valid Ruth-Aaron pair
 * because its distinct prime factors are:
 *      714 = 2 * 3 * 7 * 17
 *      715 = 5 * 11 * 13
 * and the sum of those is both 29:
 *      2 + 3 + 7 + 17 = 5 + 11 + 13 = 29
 */

/**
 * @author Tung Tran
 */
public class Ch235_RuthAaronPair implements Solution{

    public static void main(String[] args) {
        System.out.println(new Ch235_RuthAaronPair().run());
    }

    @Override
    public String run() {
        int n1 = 5;
        int n2 = 6;
        int n3 = 2107;
        int n4 = 2108;
        int n5 = 492;
        int n6 = 493;
        int n7 = 128;
        int n8 = 129;
        
        System.out.printf("(%d, %d) %s \n", n1, n2, compare(n1, n2));
        System.out.printf("(%d, %d) %s \n", n3, n4, compare(n3, n4));
        System.out.printf("(%d, %d) %s \n", n5, n6, compare(n5, n6));
        System.out.printf("(%d, %d) %s \n", n7, n8, compare(n7, n8));
        return "";
    }
    
    public boolean compare(int a, int b){
        return primeFactorSum(a) == primeFactorSum(b) && b-a == 1;
    }
    
    public int primeFactorSum(int n){
        int sum = 0;
        for(int i = 2; i <= n; i++){
            if(Library.isPrime(i) && n%i == 0){
                sum+=i;
                n/=i;
            }
        }
        return sum;
    }

    public boolean isPrime(int n){
        if(n<=0)
            throw new IllegalArgumentException("Negative Number");
        if(n==0 || n == 1)
            return false;
        else if(n==2)
            return true;
        else{
           if(n%2 == 0){
               return false;
           }
           for(int i = 3, end = (int)Math.sqrt(n); i <= end; i+=2){
               if(n%i==0){
                   return true;
               }
           }
           return true;
        }
    }
    
}
