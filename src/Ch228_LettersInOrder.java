import java.util.ArrayList;
import java.util.Scanner;

/** DESCRIPTION (https://www.reddit.com/r/dailyprogrammer/comments/3h9pde/20150817_challenge_228_easy_letters_in/)
 * write a program that can determine if the letters in a word are in alphabetical order.
 * As a bonus, see if you can find words spelled in reverse alphebatical order.
 */

/** INPUT & OUTPUT SAMPLE
 * You'll be given one word per line, all in standard English. Examples:
 *      almost
 *      cereal 
 * Your program should emit the word and if it is in order or not. Examples:
 *      almost IN ORDER
 *      cereal NOT IN ORDER
 */

/**
 *
 * @author Tung Tran
 */
public class Ch228_LettersInOrder implements Solution{

    String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
                        "p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) {
        System.out.println(new Ch228_LettersInOrder().run());
    }

    @Override
    public String run() {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        while(!done){
            String line = sc.nextLine();
            inputs.add(line);
            if(line.equals(" "))
                break;
        }
        
        for(String s : inputs){
            if(s.equals(" ")){
                System.out.println("");
            }
            else if(inOrder(s)){
                System.out.println(s + " IN ORDER");
            }
            else if(inReverseOrder(s)){
                System.out.println(s + " IN REVERSE ORDER");
            }
            else
                System.out.println(s + " NOT IN ORDER");
        }
        return "";
    }

    public boolean inOrder(String in){
        String[] arr = in.toLowerCase().split("");
        int[] sto = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < alpha.length; j++){
                if(arr[i].equals(alpha[j])){
                    sto[i] = j;
                }
            }
        }

        for(int i = 0; i < sto.length-1; i++){
            if(sto[i] - sto[i+1] > 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean inReverseOrder(String in){
        String rev = new StringBuffer(in).reverse().toString();
        String[] arr = rev.toLowerCase().split("");
        int[] sto = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < alpha.length; j++){
                if(arr[i].equals(alpha[j])){
                    sto[i] = j;
                }
            }
        }

        for(int i = 0; i < sto.length-1; i++){
            if(sto[i] - sto[i+1] > 0){
                return false;
            }
        }
        return true;
    }
}