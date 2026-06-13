import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String number = in.nextLine();
            int pair =0;
            boolean correctness = false;
            for(int i = 0; i < number.length(); i++){

                if((number.charAt(i) == ')' || number.charAt(i) == '(')&& pair == 0){
                    pair++;
                    correctness = false;
                }
                else if((number.charAt(i) == '('  || number.charAt(i) == ')')&& pair == 1){
                    pair=0;
                    correctness = true;
                }

            }
            if(correctness){
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }
    }