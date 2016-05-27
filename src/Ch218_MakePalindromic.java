import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class Ch218_MakePalindromic implements Solution{

    public static void main(String[] args) {
        System.out.println(new Ch218_MakePalindromic().run());
    }

    @Override
    public String run() {
        makePalindromic("11");
        makePalindromic("28");
        makePalindromic("68");
        makePalindromic("123");
        makePalindromic("286");
        makePalindromic("196196871");
        return "";
    }

    public void makePalindromic(String original){
        String s1, s2, reverse;
        BigInteger n1, n2, sum;
        
        //step count
        int step = 0;
        
        //assign the original value to "s1"
        s1 = original;
        
        //assign the reverse value of orginal to "reverse" and "s2"
        reverse = s2 = reverse(original);
        
        //while a number and its reverse are not the same (i.e. a number is not yet palidromic)
        while(!isPalindrome(s1, s2)){
            
            //assign a number and its reverse to n1 and n2 respectively
            n1 = new BigInteger(s1);
            n2 = new BigInteger(s2);
            
            //check the sum of the original number and its reverse
            sum = n1.add(n2);
            
            //increment the step count
            step++;
            
            //the sum of the original number and its reverse is assigned to s1
            s1 = String.valueOf(sum);
            
            //the reverse of the sum of the original number and its reverse is assigned to s1
            reverse = s2 = reverse(s1);
            
            //keep checking using "while" loop
        }
        
        //if a number is palindrome
        if(isPalindrome(s1, s2)){
            
            //print out result
            System.out.println(original + " after " + step + " steps: " + reverse);
        }
    }
    
    public String reverse(String s){
        String rev = new StringBuffer(s).reverse().toString();
        return rev;
    }
    
    public boolean isPalindrome(String ori, String rev){
        return (ori.equals(rev));
    }
}
