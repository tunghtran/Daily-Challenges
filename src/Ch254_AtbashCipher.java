/** DESCRIPTION
 * Atbash is a simple substitution cipher originally for the Hebrew alphabet, 
 * but possible with any known alphabet. It emerged around 500-600 BCE. 
 * It works by substituting the first letter of an alphabet for the last letter, 
 * the second letter for the second to last and so on, 
 * effectively reversing the alphabet. Here is the Atbash substitution table:
 *      Plain:  abcdefghijklmnopqrstuvwxyz
 *      Cipher: ZYXWVUTSRQPONMLKJIHGFEDCBA
 */

/** INPUT
 * For this challenge you'll be asked to implement the Atbash cipher 
 * and encode (or decode) some English language words. 
 * If the character is NOT part of the English alphabet (a-z), 
 * you can keep the symbol intact. Examples:
 *      foobar
 *      wizard
 *      /r/dailyprogrammer
 *      gsrh rh zm vcznkov lu gsv zgyzhs xrksvi
 */

/** OUTPUT
 * Your program should emit the following strings as ciphertext or plaintext:
 *      ullyzi
 *      draziw
 *      /i/wzrobkiltiznnvi
 *      this is an example of the atbash cipher
 * 
 */

/**
 * @author Tung Tran
 */
public class Ch254_AtbashCipher implements Solution {

    public static void main(String[] args) {
        System.out.println(new Ch254_AtbashCipher().run());
    }

    @Override
    public String run() {
        System.out.println("foobar" + " => " + encode("foobar"));
        System.out.println("wizard" + " => " + encode("wizard"));
        System.out.println("/r/dailyprogrammer" + " => " + encode("/r/dailyprogrammer"));
        System.out.println("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi" + " => " + decode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"));
        return "";
    }
    
    String[] plain = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                    "o","p","q","r","s","t","u","v","w","x","y","z" };
    String[] cipher = {"Z","Y","X","W","V","U","T","S","R","Q","P","O","N","M",
                    "L","K","J","I","H","G","F","E","D","C","B","A"};
    
    public String encode(String in){
        String[] inArr = in.split("");
        
        for(int i = 0; i < plain.length; i++){
            for(int j = 0; j < inArr.length; j++){
                if(inArr[j].equals(plain[i])){
                    inArr[j] = cipher[i];
                }
            }
        }
        
        StringBuilder builder = new StringBuilder();
        for(String s : inArr){
            builder.append(s);
        }
        
        return builder.toString().toLowerCase();
    }
    
    public String decode(String in){
        String in1 = in.toUpperCase();
        String[] inArr = in1.split("");
        
        for(int i = 0; i < cipher.length; i++){
            for(int j = 0; j < inArr.length; j++){
                if(inArr[j].equals(cipher[i])){
                    inArr[j] = plain[i];
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String s : inArr){
            builder.append(s);
        }
                
        return builder.toString();
    }
}
