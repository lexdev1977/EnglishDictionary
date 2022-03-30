package ReadDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class StartRandom {
    public static void main(String[] args) throws FileNotFoundException {



        ReadDictionary newDic = new ReadDictionary("EngDictionary2");
        List<String> eng = newDic.getEngWord();
        List<String> trans = newDic.getTranscription();
        List<String> rus = newDic.getTranslation();

        RandomArray dicRND = new RandomArray(eng.size());
        int[] rndDic = dicRND.getArrayNumber();

        int righWord = 0;
        int wrongWord = 0;



        Scanner start = new Scanner(System.in);
        for (int i = 0; i<eng.size(); i++){
            System.out.println();System.out.println();
            System.out.println("Всего слов - " + eng.size() + "  Осталось слов - " + (eng.size()-i));

            System.out.println(); System.out.println();
            System.out.println("Переведите слово - " + eng.get(rndDic[i]));
            String command = start.next();

            if (command.equals("y")){
                System.out.println("Правильно это слово - " + trans.get(rndDic[i]) + rus.get(rndDic[i]));
                righWord++;
            }else if (command.equals("b")){
                System.out.println("Жаль, что вы уходите приходите еще!!!");
                break;
            }else {
                System.out.println("Неправильно это слово - " + trans.get(rndDic[i]) + rus.get(rndDic[i]));
                wrongWord++;
            }


        }

        System.out.println("Вы должны были изучить - " + eng.size() + " Было изучено = " + righWord
                + " Подтяните еще -" + wrongWord);



    }
}
