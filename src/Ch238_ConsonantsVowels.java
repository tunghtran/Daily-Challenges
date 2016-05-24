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
            char[] split = input.toCharArray();
            char[] output = new char[split.length];
            for(int i = 0; i < output.length; i++){
                output[i] = getChar(split[i]);
                System.out.print(output[i]+"");
            }
            System.out.println();
        }
        
        return "";
    }

    public char getChar(char chara){
        switch(chara){
            case 'c':
                chara = consonants[(int) (Math.random() * (consonants.length))];
                break;
            case 'v':
                chara = vowels[(int) (Math.random() * (vowels.length))];
                break;
            case 'C':
                chara = Character.toUpperCase(consonants[(int) (Math.random() * (consonants.length))]);
                break;
            case 'V':
                chara = Character.toUpperCase(vowels[(int) (Math.random() * (vowels.length))]);
                break;
            default:
                throw new RuntimeException("Invalid input");
                
        }
        return chara;
    }
}
