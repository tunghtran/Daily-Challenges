import java.util.Scanner;

public class Dogs implements EulerSolution{
    private static int START = 0;
    private static int END = 101;
    
    public static void main(String[] args) {
        System.out.println(new Dogs().run());
    }

    @Override
    public String run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position (within 0-100): ");
        int pos = in.nextInt();
        
        for(int i = START; i<= END; i++){
            if(i==pos || i ==0){
                System.out.print("");
            }else{
                if(i%10 == 1 && i%100 != 0 && i%100 != 11){
                    System.out.print(i+"st, ");
                }
                else if(i%10 == 2 && i%100 != 0 && i%100 != 12){
                    System.out.print(i+"nd, ");
                }
                else if(i%10 == 3 && i%100 != 0 && i%100 != 13){
                        System.out.print(i+"rd, ");
                }
                else{
                    System.out.print(i+"th, ");
                }
            }
        }
        System.out.println();
        return "";
    }
}