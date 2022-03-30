package ReadDictionary;

import java.util.Scanner;

public class Example_Switch_If {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        String b = a.nextLine();


        switch (b){
            case "y":
                System.out.println("yyyyy");
            break;
        }

        if (b.equals("y")){
            System.out.println("gggg");
        }


    }

}