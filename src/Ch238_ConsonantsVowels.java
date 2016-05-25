import java.util.Scanner;

/**Description
 * You were hired to create words for a new language. 
 * However, your boss wants these words to follow a strict pattern of 
 * consonants and vowels. You are bad at creating words by yourself, 
 * so you decide it would be best to randomly generate them.
 * Your task is to create a program that generates a random word 
 * given a pattern of consonants (c) and vowels (v). 
 */

/**Input Description
 * Any string of the letters c and v, uppercase or lowercase.
 */

/**Output Description
 * A random lowercase string of letters in which consonants (bcdfghjklmnpqrstvwxyz)
 * occupy the given 'c' indices and vowels (aeiou) occupy the given 'v' indices.
 */

/**Sample inputs and output
 *      cvcvcc                  -> litunn
 *      CcvV                    -> ytie
 *      cvcvcvcvcvcvcvcvcvcv    -> poxuyusovevivikutire
 */

/**
 * @author Tung Tran
 */
public class Ch238_ConsonantsVowels implements Solution {

    private static char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    private static char[] vowels={'a','e','i','o','u'};
    private Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(new Ch238_ConsonantsVowels().run());
    }

    @Override
    public String run() {
        boolean done = false;
        
        while(!done){
            String input = in.nextLine();
            generateWord(input);
        }
        
        return "";
    }

    public void generateWord(String str){
        char[] split = str.toCharArray();
        
        for(char x : split){
            switch(x){
                case 'c':
                    x = consonants[(int) (Math.random() * (consonants.length))];
                    System.out.print(x);
                    break;
                case 'v':
                    x = vowels[(int) (Math.random() * (vowels.length))];
                    System.out.print(x);
                    break;
                case 'C':
                    x = Character.toUpperCase(consonants[(int) (Math.random() * (consonants.length))]);
                    System.out.print(x);
                    break;
                case 'V':
                    x = Character.toUpperCase(vowels[(int) (Math.random() * (vowels.length))]);
                    System.out.print(x);
                    break;
                default: //handles invalid input
                    throw new RuntimeException("Invalid input");
            }
            
        }

        System.out.println("\n");
    }
}
