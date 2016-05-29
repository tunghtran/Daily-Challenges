import java.util.*;

/** DESCRIPTION (https://www.reddit.com/r/dailyprogrammer/comments/30ubcl/20150330_challenge_208_easy_culling_numbers/)
 * 
 */

/**
 *
 * @author Tung Tran
 */
public class Ch208_CullingNumbers implements Solution{
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(new Ch208_CullingNumbers().run());
    }

    @Override
    public String run() {
        String num = sc.nextLine();
        return cull(num);
    }
    
    public String cull(String input){
        String[] arr = input.split(" ");
        ArrayList<String> bl = new ArrayList<>();
        Collections.sort(Arrays.asList(arr));
        for(String s : arr){
            if(!bl.contains(s)){
                bl.add(s);
            }
        }
        
        Collections.sort(bl);
        return bl.toString();
    }
}