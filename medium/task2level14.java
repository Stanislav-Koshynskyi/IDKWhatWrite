import java.util.Scanner;

public class task2level14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();

        if(firstLine.equals("C")) {
            compress(secondLine);
        }else {
            decompress(secondLine);
        }
    }

    private static void compress(String line) {
        int n = 0;
        char c = line.charAt(0);
        StringBuilder result = new StringBuilder();

        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (line.charAt(i) == c) {
                n++;
            }else {
                result.append(String.valueOf(c) + n);
                n=1;
                c = line.charAt(i);
            }
        }
        result.append(String.valueOf(c) + n);
        System.out.println(line.length() >= result.length() ? result.toString() : line);

    }

    private static void decompress(String line) {
        char[] chars = line.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {

        }
    }
}
