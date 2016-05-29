import java.util.*;

/**
 *
 * @author Tung Tran
 */
public class Ch232_Palindromes implements Solution{

    public static void main(String[] args) {
        System.out.println(new Ch232_Palindromes().run());
    }

    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String output = "";
        for(int i = 0; i <n; i++){
            String line = in.nextLine();
            output = output.concat(line);
            
        }
        
        return isPalindrome(output.toLowerCase());
        
    }

    public String isPalindrome(String input){
        input = input.toLowerCase();
        String[] splitArr = input.split("");
        List<String> list = new ArrayList<>(Arrays.asList(splitArr));
        
        list.removeAll(Arrays.asList(" "));
        list.removeAll(Arrays.asList("?"));
        list.removeAll(Arrays.asList(","));
        list.removeAll(Arrays.asList("!"));
        list.removeAll(Arrays.asList("."));
        list.removeAll(Arrays.asList("^"));
        list.removeAll(Arrays.asList("-"));

        splitArr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(splitArr));

        for(int i = 0; i < splitArr.length/2; i++){
            if(!splitArr[i].equals(splitArr[splitArr.length - 1 - i])){
                return ("Not a palindrome");
            }
        }
        return ("Palindrome");
    }
}
