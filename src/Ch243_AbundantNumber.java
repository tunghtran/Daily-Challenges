
import java.util.Scanner;

public class Ch243_AbundantNumber implements Solution{
    private int SIZE = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Ch243_AbundantNumber().run());
    }

    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[SIZE];
        
        System.out.println("How many inputs?");
        int limit = in.nextInt();
        System.out.println();
        
        int i = 0;
        while (in.hasNextInt()){
            arr[i] = in.nextInt();
            i++;
            if(i == limit)
                break;
        }
        System.out.println();
        for(int j = 0; j < limit; j++){
            isAbundant(arr[j]);
        }
        return "";
    }
    
    public void isAbundant(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        
        if(sum < 2*n){
            System.out.println(n + " deficient");
        }
        else if (sum > 2*n){
            System.out.println(n + " abundant by " + (sum - 2*n));
        }
        else
            System.out.println(n + " ~~neither~~ deficient");
    }

}
