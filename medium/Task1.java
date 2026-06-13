import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

            try{
                size = in.nextInt();        //розмір
            }
            catch(Exception e){
                System.out.println("Enter only number!!");
                return;
            }


        String[] newSubj = new String[size];  //масив з готовими з відступами
        in.nextLine();
        for(int i = 0; i < size; i++){      //змога вводити рівно вказану к-сть
            StringBuilder whitespaces = new StringBuilder();   //збираємо пробіли
            String subj = in.nextLine();        //одна дисципліна


            String[] a = subj.split(" ");
            String name = a[1];               //її назва
            int ierarh = Integer.parseInt(a[2]);  //її к-сть відступів


            for(int j = 0; j<=ierarh; j++){      //докупи к-сть відступів
                whitespaces.append(" ");
            }
            newSubj[i] = whitespaces+name;   // пробіли + назва -> в масив з готовими бро
        }

        for(String s : newSubj){
            System.out.println(s);      //виводимо готовенькіх
        }
    }
}

