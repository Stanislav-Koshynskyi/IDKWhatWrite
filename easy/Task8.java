import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        String zsuv = in.nextLine();
        String text = in.nextLine();

        StringBuilder finalText = new StringBuilder();
        int zsuvInt;
        try{
            zsuvInt = Integer.parseInt(zsuv);
            switch(type){
                case "E":
                    for(int i = 0; i < text.length(); i++){
                        char letter = text.charAt(i);
                        if((letter >=65 && letter <=90)||(letter >=97 && letter <=122)){
                            char newChar;
                            if(((letter >=65 && letter <=90)&&letter+zsuvInt >90 )||((letter >=97 && letter <=122)&&letter+zsuvInt>122)){
                                newChar = (char) (letter+zsuvInt-26);
                            }
                            else{
                                newChar = (char) (letter+zsuvInt);
                            }
                            finalText.append(newChar);
                        }
                        else{
                            finalText.append(letter);
                        }
                    }
                    break;
                case "D":
                    for(int i = 0; i < text.length(); i++){
                        char letter = text.charAt(i);
                        if((letter >=65 && letter <=90)||(letter >=97 && letter <=122)){
                            char newChar;
                            if(((letter >=65 && letter <=90) && letter-zsuvInt <65 )||((letter >=97 && letter <=122)&& letter-zsuvInt<97)){
                                newChar = (char) (letter-zsuvInt+26);
                            }
                            else{
                                newChar = (char) (letter-zsuvInt);
                            }
                            finalText.append(newChar);
                        }
                        else{
                            finalText.append(letter);
                        }
                    }
                    break;

                default:
                    System.out.println("Enter only 'E'(encryption) or 'D' (decryption)!! (1 row)");
                    break;
            }

            System.out.println(finalText);
        }
        catch(NumberFormatException e){
            System.out.println("Enter only numbers (2 row)!!");
        }
    }
}