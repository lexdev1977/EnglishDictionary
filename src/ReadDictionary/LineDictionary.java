package ReadDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LineDictionary {
    public static void main(String[] args) throws FileNotFoundException {
//        считываем из файла в переменную dictionaryFromFile
        File dictionaryFromFile = new File("EngDictionary");

//        сканируем из переменной типа File в переменную тмпа Scanner
        Scanner scannerDictionary = new Scanner(dictionaryFromFile);

//        создаем безразмерный массив типа List
        List<String> lineDictionary = new ArrayList<>();

//        пробегаемся по массиву с помощью hasNextLine (сканирует всю строку) и записывая данные в массив
        while (scannerDictionary.hasNextLine()){
            lineDictionary.add(scannerDictionary.nextLine());
        }


        Random rndLineDictionary = new Random();


        int nextLineNumber = (rndLineDictionary.nextInt(0, lineDictionary.size()));

        System.out.println(lineDictionary.get(nextLineNumber));



    }
}
