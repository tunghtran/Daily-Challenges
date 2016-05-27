import java.text.DecimalFormat;
import java.util.*;

/** DESCRIPTION (https://www.reddit.com/r/dailyprogrammer/comments/35l5eo/20150511_challenge_214_easy_calculating_the/)
 * Given a list of numbers as input which will serve as the statistical population, 
 * calculate the standard deviation of that population.
 */

/**
 *
 * @author Tung Tran
 */
public class Ch214_StandardDeviation implements Solution{

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(new Ch214_StandardDeviation().run());
    }

    @Override
    public String run() {
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        List<String> bList = Arrays.asList(arr);
        
        return calculateDeviation(bList);
        
        
    }

    public String calculateDeviation(List<String> al){
        DecimalFormat df = new DecimalFormat("####.####");
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(String s1: al){
            int val = Integer.valueOf(s1);
            list.add(val);
            sum += val;
        }
        
        //Step 1: calculate mean
        int mean = sum/list.size();
        
        //Step 2 & 3:
        int total = 0;
        
        for(int i : list){
            int val = (i-mean)*(i-mean);
            total +=val;
        }
        
        //Step 4 & 5: Calculate variance and deviation
        double variance = (double)total/(double)list.size();
        
        double deviation = Math.sqrt((double)variance);
        
        String res = df.format(deviation);
        return res;
    }
}
